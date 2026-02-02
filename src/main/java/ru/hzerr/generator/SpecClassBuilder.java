package ru.hzerr.generator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.hzerr.utils.JsonToStringStyle;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpecClassBuilder {

    private static final Logger log = LogManager.getLogger(SpecClassBuilder.class);

    public SpecClassBuilder() {

    }

    public void generateDomains(File output, ChromeDevToolsSpecificationObject  chromeDevToolsSpecificationObject) throws IOException {
        System.out.println("Generating chromeDevToolsSpecificationObject to " + output.getAbsolutePath());

        Set<String> types = new HashSet<>();

        chromeDevToolsSpecificationObject.getDomains().forEach(domain -> {
            File newDomainFolder = new File(output, getShirtPackageByDomainName(domain.getDomain()));
            newDomainFolder.mkdirs();
        });

        for (Domain domain: chromeDevToolsSpecificationObject.getDomains()) {
            if (domain.getTypes() != null) {
                for (Class cls : domain.getTypes()) {
                    if (cls.getType().equals("object")) { // Создаем классы только в случае, если тип является обьектом. Все типы: number, string, array, integer, object
                        generateClass(output, chromeDevToolsSpecificationObject, domain, cls, types);
//                        if (cls.getFields() != null) {
//                            cls.getFields().forEach(f -> {
//                                if (f.getArrayType() != null) {
//                                    if (f.getType().equals("array")) {
//                                        types.add(f.getArrayType().getType());
//                                    } else throw new IllegalStateException("КАВО?");
//                                }
//                            });
//                        }
                    }
                }
            }
        }

        types.forEach((type) -> { log.warn("type: " + type); });
    }

    private void generateClass(File output, ChromeDevToolsSpecificationObject chromeDevToolsSpecificationObject, Domain domain, Class cls, Set<String> forDebug) throws IOException {
        File domainDir = new File(output, getShirtPackageByDomainName(domain.getDomain()));
        File classFile = new File(domainDir, cls.getName() + ".java");

        StringBuilder importBuilder = new StringBuilder();
        StringBuilder annotationBuilder = new StringBuilder();
        StringBuilder fieldBuilder = new StringBuilder();
        StringBuilder methodBuilder = new StringBuilder();

        if (cls.isDeprecated()) {
            annotationBuilder.append("@Deprecated\n");
        }
        if (cls.isExperimental()) {
            importBuilder.append("import ru.hzerr.annotation.Experimental;\n");
            annotationBuilder.append("@Experimental\n");
        }
        if (cls.getDescription() != null) {
            importBuilder.append("import ru.hzerr.annotation.Description;\n");
            annotationBuilder.append("@Description(\"").append(cls.getDescription().replace("\n", " ").replace("\"", "\\\"")).append("\")\n");
        }

        if (cls.getFields() != null) {
            for (Field field : cls.getFields()) {
                if (field.isDeprecated()) {
                    fieldBuilder.append("\t@Deprecated\n");
                }

                if (field.isExperimental()) {
                    if (!importBuilder.toString().contains("ru.hzerr.annotation.Experimental")) {
                        importBuilder.append("import ru.hzerr.annotation.Experimental;\n");
                    }

                    fieldBuilder.append("\t@Experimental\n");
                }

                if (!field.isOptional()) {
                    if (!importBuilder.toString().contains("ru.hzerr.annotation.Required")) {
                        importBuilder.append("import ru.hzerr.annotation.Required;\n");
                    }

                    fieldBuilder.append("\t@Required\n");
                }

                if (field.getDescription() != null) {
                    if (!importBuilder.toString().contains("ru.hzerr.annotation.Description")) {
                        importBuilder.append("import ru.hzerr.annotation.Description;\n");
                    }

                    fieldBuilder.append("\t@Description(\"").append(field.getDescription().replace("\n", " ").replace("\"", "\\\"")).append("\")\n");
                }

                if (field.getEnumValues() != null && !field.getEnumValues().isEmpty()) {
                    if (!importBuilder.toString().contains("ru.hzerr.annotation.Enum")) {
                        importBuilder.append("import ru.hzerr.annotation.Enum;\n");
                    }

                    fieldBuilder.append("\t@Enum({");
                    for (int i = 0; i < field.getEnumValues().size(); i++) {
                        String enumValue = field.getEnumValues().get(i);

                        if (i > 0) fieldBuilder.append(", ");
                        fieldBuilder.append("\"").append(enumValue).append("\"");
                    }
                    fieldBuilder.append("})\n");
                }

                // Обработка типов: null(reference),number,boolean,string,array,binary,integer,any,object
                // Добавить: array
                if (field.getType() != null) {
                    switch (field.getType()) {
                        case "string" -> {
                            fieldBuilder.append("\tprivate String ").append(field.getName()).append(";\n");

                            // Getter
                            methodBuilder.append("\t").append("public String get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");

                            // Setter
                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(String ").append(field.getName()).append(") {").append("\n");
                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");
                        }

                        case "integer" -> {
                            fieldBuilder.append("\tprivate int ").append(field.getName()).append(";\n");

                            // Getter
                            methodBuilder.append("\t").append("public int get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");

                            // Setter
                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(int ").append(field.getName()).append(") {").append("\n");
                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");
                        }

                        case "number" -> {
                            fieldBuilder.append("\tprivate Number ").append(field.getName()).append(";\n");

                            // Getter
                            methodBuilder.append("\t").append("public Number get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");

                            // Setter
                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(Number ").append(field.getName()).append(") {").append("\n");
                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");
                        }

                        case "boolean" -> {
                            fieldBuilder.append("\tprivate boolean ").append(field.getName()).append(";\n");

                            // Getter
                            methodBuilder.append("\t").append("public boolean get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");

                            // Setter
                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(boolean ").append(field.getName()).append(") {").append("\n");
                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");
                        }

                        case "binary" -> {
                            fieldBuilder.append("\tprivate byte[] ").append(field.getName()).append(";\n");

                            // Getter
                            methodBuilder.append("\t").append("public byte[] get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");

                            // Setter
                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(byte[] ").append(field.getName()).append(") {").append("\n");
                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");
                        }

                        case "any", "object" -> {
                            fieldBuilder.append("\tprivate Object ").append(field.getName()).append(";\n");

                            // Getter
                            methodBuilder.append("\t").append("public Object get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");

                            // Setter
                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(Object ").append(field.getName()).append(") {").append("\n");
                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                            methodBuilder.append("\t").append("}").append("\n");
                        }

                        case "array" -> {
                            if (field.getArrayType().getType() != null) {
                                switch (field.getArrayType().getType()) {
                                    case "number" -> {
                                        fieldBuilder.append("\tprivate Number[] ").append(field.getName()).append(";\n");

                                        // Getter
                                        methodBuilder.append("\t").append("public Number[] get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                        methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                        methodBuilder.append("\t").append("}").append("\n");

                                        // Setter
                                        methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(Number[] ").append(field.getName()).append(") {").append("\n");
                                        methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                        methodBuilder.append("\t").append("}").append("\n");
                                    }

                                    case "string" -> {
                                        fieldBuilder.append("\tprivate String[] ").append(field.getName()).append(";\n");

                                        // Getter
                                        methodBuilder.append("\t").append("public String[] get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                        methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                        methodBuilder.append("\t").append("}").append("\n");

                                        // Setter
                                        methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(String[] ").append(field.getName()).append(") {").append("\n");
                                        methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                        methodBuilder.append("\t").append("}").append("\n");
                                    }

                                    case "integer" -> {
                                        fieldBuilder.append("\tprivate int[] ").append(field.getName()).append(";\n");

                                        // Getter
                                        methodBuilder.append("\t").append("public int[] get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                        methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                        methodBuilder.append("\t").append("}").append("\n");

                                        // Setter
                                        methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(int[] ").append(field.getName()).append(") {").append("\n");
                                        methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                        methodBuilder.append("\t").append("}").append("\n");
                                    }

                                    case "any" -> {
                                        fieldBuilder.append("\tprivate Object[] ").append(field.getName()).append(";\n");

                                        // Getter
                                        methodBuilder.append("\t").append("public Object[] get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                        methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                        methodBuilder.append("\t").append("}").append("\n");

                                        // Setter
                                        methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(Object[] ").append(field.getName()).append(") {").append("\n");
                                        methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                        methodBuilder.append("\t").append("}").append("\n");
                                    }
                                }
                            } else {
                                String[] reference = field.getArrayType().getReference().split("\\.");
                                if (reference.length > 1) {
                                    Domain referenceDomain = chromeDevToolsSpecificationObject.getDomain(reference[0]);
                                    Class referenceType = referenceDomain.getType(reference[1]); // ТИПЫ, КОТОРЫЕ ТУТ МОГУТ БЫТЬ: string,array,integer,object.

                                    // Добавляем метаданные только для типов, которые мы не генерируем
                                    if (ObjectUtils.notEqual(referenceType.getType(), "object")) {
                                        if (referenceType.isExperimental()) {
                                            if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeExperimental")) {
                                                importBuilder.append("import ru.hzerr.annotation.TypeExperimental;\n");
                                            }

                                            fieldBuilder.append("\t@TypeExperimental").append("\n");
                                        }

                                        if (referenceType.isDeprecated()) {
                                            if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeDeprecated")) {
                                                importBuilder.append("import ru.hzerr.annotation.TypeDeprecated;\n");
                                            }

                                            fieldBuilder.append("\t@TypeDeprecated").append("\n");
                                        }

                                        if (referenceType.getDescription() != null) {
                                            if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeDescription")) {
                                                importBuilder.append("import ru.hzerr.annotation.TypeDescription;\n");
                                            }

                                            fieldBuilder.append("\t@TypeDescription(\"").append(referenceType.getDescription().replace("\n", " ").replace("\"", "\\\"")).append("\")\n");
                                        }
                                    }

                                    switch (referenceType.getType()) {
                                        case "string" -> {
                                            if (!importBuilder.toString().contains("java.util.List")) {
                                                importBuilder.append("import java.util.List;\n");
                                            }
                                            fieldBuilder.append("\tprivate List<String> ").append(field.getName()).append(";\n");

                                            // Getter
                                            methodBuilder.append("\t").append("public List<String> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");

                                            // Setter
                                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<String> ").append(field.getName()).append(") {").append("\n");
                                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");
                                        }

                                        case "integer" -> {
                                            if (!importBuilder.toString().contains("java.util.List")) {
                                                importBuilder.append("import java.util.List;\n");
                                            }
                                            fieldBuilder.append("\tprivate List<Integer> ").append(field.getName()).append(";\n");

                                            // Getter
                                            methodBuilder.append("\t").append("public List<Integer> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");

                                            // Setter
                                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<Integer> ").append(field.getName()).append(") {").append("\n");
                                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");
                                        }

                                        case "array" -> {
                                            if (referenceType.getArrayType() != null && referenceType.getArrayType().getType() != null && referenceType.getArrayType().getType().equals("string")) {
                                                if (!importBuilder.toString().contains("java.util.List")) {
                                                    importBuilder.append("import java.util.List;\n");
                                                }
                                                fieldBuilder.append("\tprivate List<List<String>> ").append(field.getName()).append(";\n");

                                                // Getter
                                                methodBuilder.append("\t").append("public List<List<String>> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                                methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                                methodBuilder.append("\t").append("}").append("\n");

                                                // Setter
                                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<List<String>> ").append(field.getName()).append(") {").append("\n");
                                                methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                                methodBuilder.append("\t").append("}").append("\n");
                                            } else
                                                throw new IllegalStateException("Illegal array type in array reference");
                                        }

                                        case "object" -> {
                                            if (!importBuilder.toString().contains("java.util.List")) {
                                                importBuilder.append("import java.util.List;\n");
                                            }

                                            // Добавляем о нем информацию в текущий тип
                                            if (!importBuilder.toString().contains("ru.hzerr.generated." + getShirtPackageByDomainName(referenceDomain.getDomain()) + "." + referenceType.getName())) {
                                                importBuilder.append("import ru.hzerr.generated.").append(getShirtPackageByDomainName(referenceDomain.getDomain())).append(".").append(referenceType.getName()).append(";\n");
                                            }
                                            fieldBuilder.append("\tprivate List<").append(referenceType.getName()).append("> ").append(field.getName()).append(";\n");

                                            // Getter
                                            methodBuilder.append("\t").append("public List<").append(referenceType.getName()).append("> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");

                                            // Setter
                                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<").append(referenceType.getName()).append("> ").append(field.getName()).append(") {").append("\n");
                                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");
                                        }

                                        default -> throw new IllegalStateException("Illegal array reference type");
                                    }
                                } else {
                                    Class referenceType = domain.getType(reference[0]); // ТИПЫ, КОТОРЫЕ ТУТ МОГУТ БЫТЬ: string,array,integer,object. P.S array МОЖЕТ БЫТЬ ТОЛЬКО number и array! А ЭТОТ ПОСЛЕДНИЙ array ТОЛЬКО string!!!

                                    // Добавляем метаданные только для типов, которые мы не генерируем
                                    if (ObjectUtils.notEqual(referenceType.getType(), "object")) {
                                        if (referenceType.isExperimental()) {
                                            if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeExperimental")) {
                                                importBuilder.append("import ru.hzerr.annotation.TypeExperimental;\n");
                                            }

                                            fieldBuilder.append("\t@TypeExperimental").append("\n");
                                        }

                                        if (referenceType.isDeprecated()) {
                                            if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeDeprecated")) {
                                                importBuilder.append("import ru.hzerr.annotation.TypeDeprecated;\n");
                                            }

                                            fieldBuilder.append("\t@TypeDeprecated").append("\n");
                                        }

                                        if (referenceType.getDescription() != null) {
                                            if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeDescription")) {
                                                importBuilder.append("import ru.hzerr.annotation.TypeDescription;\n");
                                            }

                                            fieldBuilder.append("\t@TypeDescription(\"").append(referenceType.getDescription().replace("\n", " ").replace("\"", "\\\"")).append("\")\n");
                                        }
                                    }

                                    switch (referenceType.getType()) {
                                        case "string" -> {
                                            if (!importBuilder.toString().contains("java.util.List")) {
                                                importBuilder.append("import java.util.List;\n");
                                            }
                                            fieldBuilder.append("\tprivate List<String> ").append(field.getName()).append(";\n");

                                            // Getter
                                            methodBuilder.append("\t").append("public List<String> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");

                                            // Setter
                                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<String> ").append(field.getName()).append(") {").append("\n");
                                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");
                                        }

                                        case "integer" -> {
                                            if (!importBuilder.toString().contains("java.util.List")) {
                                                importBuilder.append("import java.util.List;\n");
                                            }
                                            fieldBuilder.append("\tprivate List<Integer> ").append(field.getName()).append(";\n");

                                            // Getter
                                            methodBuilder.append("\t").append("public List<Integer> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");

                                            // Setter
                                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<Integer> ").append(field.getName()).append(") {").append("\n");
                                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");
                                        }

                                        /**
                                         * 22:27:50.036 [main] WARN  ru.hzerr.generator.SpecClassBuilder - type: DOMSnapshot / LayoutTreeSnapshot -> ArrayOfStrings
                                         * 22:27:50.037 [main] WARN  ru.hzerr.generator.SpecClassBuilder - type: DOMSnapshot / TextBoxSnapshot -> Rectangle
                                         * 22:27:50.037 [main] WARN  ru.hzerr.generator.SpecClassBuilder - type: DOMSnapshot / NodeTreeSnapshot -> ArrayOfStrings
                                         * 22:27:50.037 [main] WARN  ru.hzerr.generator.SpecClassBuilder - type: DOMSnapshot / LayoutTreeSnapshot -> Rectangle
                                         */
                                        case "array" -> { // null, number
                                            if (referenceType.getArrayType() != null) {
                                                if (referenceType.getArrayType().getType() != null && referenceType.getArrayType().getType().equals("number")) {
                                                    if (!importBuilder.toString().contains("java.util.List")) {
                                                        importBuilder.append("import java.util.List;\n");
                                                    }
                                                    fieldBuilder.append("\tprivate List<List<Number>> ").append(field.getName()).append(";\n");
                                                    // Getter
                                                    methodBuilder.append("\t").append("public List<List<Number>> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                                    methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                                    methodBuilder.append("\t").append("}").append("\n");
                                                    // Setter
                                                    methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<List<Number>> ").append(field.getName()).append(") {").append("\n");
                                                    methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                                    methodBuilder.append("\t").append("}").append("\n");
                                                } else {
                                                    String[] referenceDepth2 = referenceType.getArrayType().getReference().split("\\.");
                                                    if (referenceDepth2.length > 1) throw new IllegalStateException("Reference не в этом же домене? Если да проверьте версию протокола");

                                                    Class referenceTypeDepth2 = domain.getType(referenceDepth2[0]);
                                                    if (referenceTypeDepth2.getType().equals("integer")) {
                                                        if (!importBuilder.toString().contains("java.util.List")) {
                                                            importBuilder.append("import java.util.List;\n");
                                                        }
                                                        fieldBuilder.append("\tprivate List<List<Integer>> ").append(field.getName()).append(";\n");
                                                        // Getter
                                                        methodBuilder.append("\t").append("public List<List<Integer>> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                                        methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                                        methodBuilder.append("\t").append("}").append("\n");
                                                        // Setter
                                                        methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<List<Integer>> ").append(field.getName()).append(") {").append("\n");
                                                        methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                                        methodBuilder.append("\t").append("}").append("\n");
                                                    } else throw new IllegalStateException("Предполагается, что здесь может быть только StringIndex");
                                                }
                                            } else
                                                throw new IllegalStateException("Illegal array type in array reference: " + domain.getDomain() + " / " + cls.getName() + " / " + cls.getArrayType());
                                        }

                                        case "object" -> {
                                            if (!importBuilder.toString().contains("java.util.List")) {
                                                importBuilder.append("import java.util.List;\n");
                                            }

                                            // Добавляем о нем информацию в текущий тип. Поскольку reference в текущем домене, то импорт на него не нужен
                                            fieldBuilder.append("\tprivate List<").append(referenceType.getName()).append("> ").append(field.getName()).append(";\n");

                                            // Getter
                                            methodBuilder.append("\t").append("public List<").append(referenceType.getName()).append("> get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                            methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");

                                            // Setter
                                            methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(List<").append(referenceType.getName()).append("> ").append(field.getName()).append(") {").append("\n");
                                            methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                            methodBuilder.append("\t").append("}").append("\n");
                                        }

                                        default -> throw new IllegalStateException("Illegal array reference type");
                                    }
                                }
                            }
                        }

                        default -> throw new IllegalStateException("Illegal reference type");
                    }
                } else {
                    if (field.getReference() == null) throw new IllegalStateException("Reference type is null");
                    String[] reference = field.getReference().split("\\.");

                    if (reference.length > 1) {
                        Domain referenceDomain = chromeDevToolsSpecificationObject.getDomain(reference[0]);
                        Class referenceType = referenceDomain.getType(reference[1]); // ТИПЫ, КОТОРЫЕ ТУТ МОГУТ БЫТЬ: number,string,array,integer,object. P.S array МОЖЕТ БЫТЬ ТОЛЬКО number!

                        // ТАК НЕ ДЕЛАЕМ, Т.К NODE ССЫЛАЕТСЯ НА NODE!!!
////                        // Сначала создаем тип в другом домене на который ведет reference
//                        log.warn("СОЗДАЕМ ТИП: {} / {}", referenceDomain.getDomain(), referenceType.getName());
//                        generateClass(output, chromeDevToolsSpecificationObject, referenceDomain, referenceType);

                        // Добавляем метаданные только для типов, которые мы не генерируем
                        if (ObjectUtils.notEqual(referenceType.getType(), "object")) {
                            if (referenceType.isExperimental()) {
                                if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeExperimental")) {
                                    importBuilder.append("import ru.hzerr.annotation.TypeExperimental;\n");
                                }

                                fieldBuilder.append("\t@TypeExperimental").append("\n");
                            }

                            if (referenceType.isDeprecated()) {
                                if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeDeprecated")) {
                                    importBuilder.append("import ru.hzerr.annotation.TypeDeprecated;\n");
                                }

                                fieldBuilder.append("\t@TypeDeprecated").append("\n");
                            }

                            if (referenceType.getDescription() != null) {
                                if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeDescription")) {
                                    importBuilder.append("import ru.hzerr.annotation.TypeDescription;\n");
                                }

                                fieldBuilder.append("\t@TypeDescription(\"").append(referenceType.getDescription().replace("\n", " ").replace("\"", "\\\"")).append("\")\n");
                            }
                        }

                        switch (referenceType.getType()) {
                            case "string" -> {
                                fieldBuilder.append("\tprivate String ").append(field.getName()).append(";\n");

                                // Getter
                                methodBuilder.append("\t").append("public String get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");

                                // Setter
                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(String ").append(field.getName()).append(") {").append("\n");
                                methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");
                            }

                            case "number" -> {
                                fieldBuilder.append("\tprivate Number ").append(field.getName()).append(";\n");

                                // Getter
                                methodBuilder.append("\t").append("public Number get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");

                                // Setter
                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(Number ").append(field.getName()).append(") {").append("\n");
                                methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");
                            }

                            case "integer" -> {
                                fieldBuilder.append("\tprivate int ").append(field.getName()).append(";\n");

                                // Getter
                                methodBuilder.append("\t").append("public int get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");

                                // Setter
                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(int ").append(field.getName()).append(") {").append("\n");
                                methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");
                            }

                            case "array" -> {
                                if (referenceType.getArrayType() != null && referenceType.getArrayType().getType() != null && referenceType.getArrayType().getType().equals("number")) { // ТОЛЬКО number!!!
                                    fieldBuilder.append("\tprivate Number[] ").append(field.getName()).append(";\n");

                                    // Getter
                                    methodBuilder.append("\t").append("public Number[] get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                    methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                    methodBuilder.append("\t").append("}").append("\n");

                                    // Setter
                                    methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(Number[] ").append(field.getName()).append(") {").append("\n");
                                    methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                    methodBuilder.append("\t").append("}").append("\n");
                                } else
                                    throw new IllegalArgumentException("Invalid array type");
                            }

                            case "object" -> {
                                // Добавляем о нем информацию в текущий тип
                                if (!importBuilder.toString().contains("ru.hzerr.generated." + getShirtPackageByDomainName(referenceDomain.getDomain()) + "." + referenceType.getName())) {
                                    importBuilder.append("import ru.hzerr.generated.").append(getShirtPackageByDomainName(referenceDomain.getDomain())).append(".").append(referenceType.getName()).append(";\n");
                                }

                                // Правки для debugger.CallFrame объекта
                                String fieldName = field.getName();
                                if (fieldName.equals("this")) {
                                    fieldName = "remoteObject";
                                    if (!importBuilder.toString().contains("com.fasterxml.jackson.annotation.JsonProperty")) {
                                        importBuilder.append("import com.fasterxml.jackson.annotation.JsonProperty;\n");
                                    }
                                    fieldBuilder.append("\t@JsonProperty(\"this\")\n");
                                }
                                fieldBuilder.append("\tprivate ").append(referenceType.getName()).append(" ").append(fieldName).append(";\n");

                                // Getter
                                methodBuilder.append("\t").append("public ").append(referenceType.getName()).append(" get").append(StringUtils.capitalize(fieldName)).append("() {").append("\n");
                                methodBuilder.append("\t\t").append("return this.").append(fieldName).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");

                                // Setter
                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(fieldName)).append("(").append(referenceType.getName()).append(" ").append(fieldName).append(") {").append("\n");
                                methodBuilder.append("\t\t").append("this.").append(fieldName).append(" = ").append(fieldName).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");
                            }

                            default -> throw new IllegalArgumentException("Invalid array type!!!");
                        }
                    } else {
                        Class referenceType = domain.getType(reference[0]); // ТИПЫ, КОТОРЫЕ ТУТ МОГУТ БЫТЬ: number,string,array,integer,object. P.S array МОЖЕТ БЫТЬ ТОЛЬКО number!

                        // ТАК НЕ ДЕЛАЕМ, Т.К NODE ССЫЛАЕТСЯ НА NODE!!!
////                        // Сначала создаем тип в текущем домене на который ведет reference
//                        log.warn("СОЗДАЕМ ТИП: {} / {}", domain.getDomain(), referenceType.getName());
//                        generateClass(output, chromeDevToolsSpecificationObject, domain, referenceType);

                        if (ObjectUtils.notEqual(referenceType.getType(), "object")) {
                            if (referenceType.isExperimental()) {
                                if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeExperimental")) {
                                    importBuilder.append("import ru.hzerr.annotation.TypeExperimental;\n");
                                }

                                fieldBuilder.append("\t@TypeExperimental").append("\n");
                            }

                            if (referenceType.isDeprecated()) {
                                if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeDeprecated")) {
                                    importBuilder.append("import ru.hzerr.annotation.TypeDeprecated;\n");
                                }

                                fieldBuilder.append("\t@TypeDeprecated").append("\n");
                            }

                            if (referenceType.getDescription() != null) {
                                if (!importBuilder.toString().contains("ru.hzerr.annotation.TypeDescription")) {
                                    importBuilder.append("import ru.hzerr.annotation.TypeDescription;\n");
                                }

                                fieldBuilder.append("\t@TypeDescription(\"").append(referenceType.getDescription().replace("\n", " ").replace("\"", "\\\"")).append("\")\n");
                            }
                        }

                        switch (referenceType.getType()) {
                            case "string" -> {
                                fieldBuilder.append("\tprivate String ").append(field.getName()).append(";\n");

                                // Getter
                                methodBuilder.append("\t").append("public String get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");

                                // Setter
                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(String ").append(field.getName()).append(") {").append("\n");
                                methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");
                            }

                            case "number" -> {
                                fieldBuilder.append("\tprivate Number ").append(field.getName()).append(";\n");

                                // Getter
                                methodBuilder.append("\t").append("public Number get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");

                                // Setter
                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(Number ").append(field.getName()).append(") {").append("\n");
                                methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");
                            }

                            case "integer" -> {
                                fieldBuilder.append("\tprivate int ").append(field.getName()).append(";\n");

                                // Getter
                                methodBuilder.append("\t").append("public int get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");

                                // Setter
                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(int ").append(field.getName()).append(") {").append("\n");
                                methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");
                            }

                            case "array" -> {
                                if (referenceType.getArrayType() != null && referenceType.getArrayType().getType() != null && referenceType.getArrayType().getType().equals("number")) { // ТОЛЬКО number!!!
                                    fieldBuilder.append("\tprivate Number[] ").append(field.getName()).append(";\n");

                                    // Getter
                                    methodBuilder.append("\t").append("public Number[] get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                    methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                    methodBuilder.append("\t").append("}").append("\n");

                                    // Setter
                                    methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(Number[] ").append(field.getName()).append(") {").append("\n");
                                    methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                    methodBuilder.append("\t").append("}").append("\n");
                                } else
                                    throw new IllegalArgumentException("Invalid array type");
                            }

                            case "object" -> {
                                // Добавляем о нем информацию в текущий тип. Поскольку reference в текущем домене, то импорт на него не нужен
                                fieldBuilder.append("\tprivate ").append(referenceType.getName()).append(" ").append(field.getName()).append(";\n");

                                // Getter
                                methodBuilder.append("\t").append("public ").append(referenceType.getName()).append(" get").append(StringUtils.capitalize(field.getName())).append("() {").append("\n");
                                methodBuilder.append("\t\t").append("return this.").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");

                                // Setter
                                methodBuilder.append("\t").append("public void set").append(StringUtils.capitalize(field.getName())).append("(").append(referenceType.getName()).append(" ").append(field.getName()).append(") {").append("\n");
                                methodBuilder.append("\t\t").append("this.").append(field.getName()).append(" = ").append(field.getName()).append(";").append("\n");
                                methodBuilder.append("\t").append("}").append("\n");
                            }

                            default -> throw new IllegalArgumentException("Invalid array type!!!");
                        }
                    }
                }

                fieldBuilder.append("\n");
            }
        }

        String classFileContent = """
                package ru.hzerr.generated.%s;
                
                %s
                
                %s
                public class %s {
                
                %s
                
                    public %s() {
                    }
                
                %s
                }
                """.formatted(getShirtPackageByDomainName(domain.getDomain()),
                importBuilder.toString().replaceAll("\\s+$", ""),
                annotationBuilder.toString().replaceAll("\\s+$", ""),
                cls.getName(),
                fieldBuilder.toString().replaceAll("\\s+$", ""),
                cls.getName(),
                methodBuilder.toString().replaceAll("\\s+$", "")
        ).replace("\n\n\n", "\n\n");

        FileUtils.writeStringToFile(classFile,  classFileContent, StandardCharsets.UTF_8);
    }

    private String getShirtPackageByDomainName(String domainName) {
        String domainPackageName = StringUtils.uncapitalize(domainName);
        if (domainPackageName.equalsIgnoreCase("io")) domainPackageName = "io";
        if (domainPackageName.equalsIgnoreCase("pwa")) domainPackageName = "pwa";
        if (domainPackageName.equalsIgnoreCase("dom")) domainPackageName = "dom";
        if (domainPackageName.equalsIgnoreCase("css")) domainPackageName = "css";
        if (domainPackageName.equalsIgnoreCase("domDebugger")) domainPackageName = "domDebugger";
        if (domainPackageName.equalsIgnoreCase("domSnapshot")) domainPackageName = "domSnapshot";
        if (domainPackageName.equalsIgnoreCase("domStorage")) domainPackageName = "domStorage";
        return domainPackageName;
    }
}
