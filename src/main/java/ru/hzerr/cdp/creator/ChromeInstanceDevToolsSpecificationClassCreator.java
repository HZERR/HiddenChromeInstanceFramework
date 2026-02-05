package ru.hzerr.cdp.creator;

import org.apache.commons.io.file.PathUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.hzerr.cdp.creator.model.*;
import ru.hzerr.cdp.creator.model.Class;
import ru.hzerr.ex.ChromeInstanceSpecificationCreationException;
import ru.hzerr.utils.JsonUtils;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChromeInstanceDevToolsSpecificationClassCreator implements IChromeInstanceDevToolsSpecificationClassCreator {

    private static final String REPOSITORY_NAME = "HiddenOfficalChromeAutomation";
    private static final String SUPPORTED_MAJOR_VERSION = "1";
    private static final String SUPPORTED_MINOR_VERSION = "3";
    private static final Logger log = LogManager.getLogger(ChromeInstanceDevToolsSpecificationClassCreator.class);

    private Path chromeDevToolsSpecificationPath;
    private Path chromeDevToolsCDPDirectoryPath;
    private boolean autoDetectOutputDirectories = true;

    public ChromeInstanceDevToolsSpecificationClassCreator() {
    }

    @Override
    public ChromeDevToolsSpecification createChromeDevToolsSpecification() {
        if (chromeDevToolsSpecificationPath == null) throw new IllegalArgumentException("Chrome DevTools specification path is missing");

        JsonNode specificationAsJsonNode = null;
        try {
            specificationAsJsonNode = JsonUtils.readValueAsJsonNode(PathUtils.readString(chromeDevToolsSpecificationPath, StandardCharsets.UTF_8));
        } catch (JacksonException | IOException e) {
            throw new ChromeInstanceSpecificationCreationException("Failed to parse Chrome DevTools specification as JsonNode", e);
        }

        if (!specificationAsJsonNode.has("version")) throw new IllegalArgumentException("Chrome DevTools specification version is missing");
        JsonNode chromeDevToolsSpecificationVersion = specificationAsJsonNode.get("version");
        if (!chromeDevToolsSpecificationVersion.has("major")) throw new IllegalArgumentException("Chrome DevTools specification major version is missing");
        if (!chromeDevToolsSpecificationVersion.has("minor")) throw new IllegalArgumentException("Chrome DevTools specification minor version is missing");

        String currentMajorVersion = chromeDevToolsSpecificationVersion.get("major").asString();
        String currentMinorVersion = chromeDevToolsSpecificationVersion.get("minor").asString();
        if (!currentMajorVersion.equals(SUPPORTED_MAJOR_VERSION)) throw new IllegalArgumentException("Chrome DevTools specification major version is not supported. Current: %s. Required: %s".formatted(currentMajorVersion, SUPPORTED_MAJOR_VERSION));
        if (!currentMinorVersion.equals(SUPPORTED_MINOR_VERSION)) throw new IllegalArgumentException("Chrome DevTools specification minor version is not supported. Current: %s. Required: %s".formatted(currentMinorVersion, SUPPORTED_MINOR_VERSION));

        try {
            return JsonUtils.readValue(specificationAsJsonNode, ChromeDevToolsSpecification.class);
        } catch (JacksonException e) {
            throw new ChromeInstanceSpecificationCreationException("Failed to parse Chrome DevTools specification", e);
        }
    }

    @Override
    public void createTypes() {
        Path chromeDevToolsTypesPath = null;
        if (autoDetectOutputDirectories) {
            chromeDevToolsTypesPath = findChromeCDPProjectLocation().resolve("type");
        } else {
            if (chromeDevToolsCDPDirectoryPath == null) throw new IllegalArgumentException("Chrome DevTools CDP directory path is missing");
            chromeDevToolsTypesPath = chromeDevToolsCDPDirectoryPath.resolve("type");
        }
        log.info("The directory for Chrome DevTools types has been defined: {}", chromeDevToolsTypesPath);

        try {
            PathUtils.cleanDirectory(chromeDevToolsTypesPath);
            createTypes0(chromeDevToolsTypesPath, createChromeDevToolsSpecification());
        } catch (Exception e) { throw new ChromeInstanceSpecificationCreationException("Failed to create Chrome DevTools types", e); }
    }

    @Override
    public void createRequests() {

    }

    @Override
    public void createEvents() {
        Path chromeDevToolsEventsPath = null;
        Path chromeDevToolsEventProcessorsPath = null;
        if (autoDetectOutputDirectories) {
            Path chromeCDPProjectLocation = findChromeCDPProjectLocation();
            chromeDevToolsEventsPath = chromeCDPProjectLocation.resolve("event");
            chromeDevToolsEventProcessorsPath = chromeCDPProjectLocation.resolve("processor").resolve("impl");
        } else {
            if (chromeDevToolsCDPDirectoryPath == null) throw new IllegalArgumentException("Chrome DevTools CDP directory path is missing");
            chromeDevToolsEventsPath = chromeDevToolsCDPDirectoryPath.resolve("event");
            chromeDevToolsEventProcessorsPath = chromeDevToolsCDPDirectoryPath.resolve("processor").resolve("impl");
        }
        log.info("The directory for Chrome DevTools events has been defined: {}", chromeDevToolsEventsPath);
        log.info("The directory for Chrome DevTools event processors has been defined: {}", chromeDevToolsEventsPath);

        try {
            PathUtils.cleanDirectory(chromeDevToolsEventsPath);
            PathUtils.cleanDirectory(chromeDevToolsEventProcessorsPath);
            createEvents0(chromeDevToolsEventsPath, chromeDevToolsEventProcessorsPath, createChromeDevToolsSpecification());
        } catch (Exception e) { throw new ChromeInstanceSpecificationCreationException("Failed to create Chrome DevTools events", e); }
    }

    private Path findChromeCDPProjectLocation() {
        Path currentClassLocation = null;
        try {
            currentClassLocation = Paths.get(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).normalize();
        } catch (URISyntaxException e) { throw new ChromeInstanceSpecificationCreationException("Failed to autodetect class location", e); }
        log.info("Current source location: {}. Auto-detection of the output directory...", currentClassLocation);

        Path parent = currentClassLocation.getParent();
        do {
            if (parent.endsWith(REPOSITORY_NAME)) {
                log.info("The project directory has been defined: {}", parent);
                return parent.resolve("src").resolve("main").resolve("java").resolve("ru").resolve("hzerr").resolve("cdp");
            }
        } while ((parent = parent.getParent()) != null);
        throw new IllegalStateException("The project directory could not be determined");
    }

    public void setChromeDevToolsSpecificationPath(Path chromeDevToolsSpecificationPath) {
        this.chromeDevToolsSpecificationPath = chromeDevToolsSpecificationPath;
    }

    public Path getChromeDevToolsSpecificationPath() {
        return chromeDevToolsSpecificationPath;
    }

    public void setChromeDevToolsCDPDirectoryPath(Path chromeDevToolsCDPDirectoryPath) {
        this.chromeDevToolsCDPDirectoryPath = chromeDevToolsCDPDirectoryPath;
    }

    public Path getChromeDevToolsCDPDirectoryPath() {
        return chromeDevToolsCDPDirectoryPath;
    }

    public void setAutoDetectOutputDirectories(boolean autoDetectOutputDirectories) {
        this.autoDetectOutputDirectories = autoDetectOutputDirectories;
    }

    public boolean isAutoDetectOutputDirectories() {
        return autoDetectOutputDirectories;
    }

    private void createEvents0(Path chromeDevToolsEventsPath, Path chromeDevToolsEventProcessorsPath, ChromeDevToolsSpecification chromeDevToolsSpecification) throws IOException {
        for (Domain domain: chromeDevToolsSpecification.getDomains()) {
            Path domainPath = chromeDevToolsEventsPath.resolve(getShirtPackageByDomainName(domain.getDomain()));
            Files.createDirectories(domainPath);
            log.info("Domain directory has been successfully created: {}!", domainPath);
        }

        StringBuilder creatorEventsImportBuilder = new StringBuilder();
        StringBuilder creatorEventNameFieldsBuilder = new StringBuilder();
        StringBuilder creatorCreateMethodsBuilder = new StringBuilder();
        for (Domain domain: chromeDevToolsSpecification.getDomains()) {
            if (domain.getEvents() != null) {
                for (Event event : domain.getEvents()) {
                    createEvent(chromeDevToolsEventsPath, chromeDevToolsEventProcessorsPath, chromeDevToolsSpecification, domain, event, creatorEventsImportBuilder, creatorEventNameFieldsBuilder, creatorCreateMethodsBuilder);
                    log.info("Event {} has been successfully created!", event.getName());
                }
            }
        }

        Path chromeInstanceEventProcessorCreatorPath = chromeDevToolsEventProcessorsPath.resolve("ChromeInstanceEventProcessorCreator.java");
        String chromeInstanceEventProcessorCreatorClassFileContent = """
                package ru.hzerr.cdp.processor.impl;
                
                import ru.hzerr.cdp.processor.EventProcessingExceptionHandler;
                import ru.hzerr.cdp.processor.EventProcessingHandler;
                
                public class ChromeInstanceEventProcessorCreator {
                
                %s
                
                    private ChromeInstanceEventProcessorCreator() {
                    }
                
                %s
                }
                """.formatted(
                creatorEventNameFieldsBuilder.toString().replaceAll("\\s+$", ""),
                creatorCreateMethodsBuilder.toString().replaceAll("\\s+$", "")
        );

        PathUtils.writeString(chromeInstanceEventProcessorCreatorPath, chromeInstanceEventProcessorCreatorClassFileContent, StandardCharsets.UTF_8);
        log.info("ChromeInstanceEventProcessorCreator has been successfully created!");
    }

    private void createEvent(Path chromeDevToolsEventsPath, Path chromeDevToolsEventProcessorPath, ChromeDevToolsSpecification chromeDevToolsSpecification, Domain domain, Event event, StringBuilder creatorEventsImportBuilder, StringBuilder creatorEventNameFieldsBuilder, StringBuilder creatorCreateMethodsBuilder) throws IOException {
        Path domainPath = chromeDevToolsEventsPath.resolve(getShirtPackageByDomainName(domain.getDomain()));
        String eventClassName = "%sEvent".formatted(StringUtils.capitalize(event.getName()));
        Path eventPath = domainPath.resolve("%s.java".formatted(eventClassName));

        StringBuilder importBuilder = new StringBuilder();
        StringBuilder annotationBuilder = new StringBuilder();
        StringBuilder fieldBuilder = new StringBuilder();
        StringBuilder methodBuilder = new StringBuilder();

        if (event.isDeprecated()) {
            annotationBuilder.append("@Deprecated\n");
        }
        if (event.isExperimental()) {
            importBuilder.append("import ru.hzerr.annotation.Experimental;\n");
            annotationBuilder.append("@Experimental\n");
        }
        if (event.getDescription() != null) {
            importBuilder.append("import ru.hzerr.annotation.Description;\n");
            annotationBuilder.append("@Description(\"").append(event.getDescription().replace("\n", " ").replace("\"", "\\\"")).append("\")\n");
        }

        importBuilder.append("import ru.hzerr.annotation.Event;\n");
        annotationBuilder.append("@Event(\"").append(event.getName()).append("\")\n");

        if (event.getFields() != null) {
            for (Field field: event.getFields()) {
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
                                    Domain referenceDomain = chromeDevToolsSpecification.getDomain(reference[0]);
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
                                            if (!importBuilder.toString().contains("ru.hzerr.cdp.type." + getShirtPackageByDomainName(referenceDomain.getDomain()) + "." + referenceType.getName())) {
                                                importBuilder.append("import ru.hzerr.cdp.type.").append(getShirtPackageByDomainName(referenceDomain.getDomain())).append(".").append(referenceType.getName()).append(";\n");
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
                                                throw new IllegalStateException("Illegal array type in array reference: " + domain.getDomain() + " / " + event.getName() + " / " + field.getArrayType());
                                        }

                                        case "object" -> {
                                            if (!importBuilder.toString().contains("java.util.List")) {
                                                importBuilder.append("import java.util.List;\n");
                                            }

                                            if (!importBuilder.toString().contains("ru.hzerr.cdp.type." + getShirtPackageByDomainName(domain.getDomain()) + "." + referenceType.getName())) {
                                                importBuilder.append("import ru.hzerr.cdp.type.").append(getShirtPackageByDomainName(domain.getDomain())).append(".").append(referenceType.getName()).append(";\n");
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
                        Domain referenceDomain = chromeDevToolsSpecification.getDomain(reference[0]);
                        Class referenceType = referenceDomain.getType(reference[1]);

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
                                if (!importBuilder.toString().contains("ru.hzerr.cdp.type." + getShirtPackageByDomainName(referenceDomain.getDomain()) + "." + referenceType.getName())) {
                                    importBuilder.append("import ru.hzerr.cdp.type.").append(getShirtPackageByDomainName(referenceDomain.getDomain())).append(".").append(referenceType.getName()).append(";\n");
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
                        Class referenceType = domain.getType(reference[0]);

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
                                // Добавляем о нем информацию в текущий тип. Несмотря на то, что reference в текущем домене, сам пакет другой, поэтому импорт на него нужен
                                if (!importBuilder.toString().contains("ru.hzerr.cdp.type." + getShirtPackageByDomainName(domain.getDomain()) + "." + referenceType.getName())) {
                                    importBuilder.append("import ru.hzerr.cdp.type.").append(getShirtPackageByDomainName(domain.getDomain())).append(".").append(referenceType.getName()).append(";\n");
                                }

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
                package ru.hzerr.cdp.event.%s;
                
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
                eventClassName,
                fieldBuilder.toString().replaceAll("\\s+$", ""),
                eventClassName,
                methodBuilder.toString().replaceAll("\\s+$", "")
        ).replace("\n\n\n", "\n\n");

        PathUtils.writeString(eventPath, classFileContent, StandardCharsets.UTF_8);

        // Создание процессора
        String eventProcessorClassName = "%sEventProcessor".formatted(StringUtils.capitalize(event.getName()).startsWith(domain.getDomain()) ? StringUtils.capitalize(event.getName()) : domain.getDomain() + StringUtils.capitalize(event.getName()));
        Path eventProcessorPath = chromeDevToolsEventProcessorPath.resolve("%s.java".formatted(eventProcessorClassName));
        String fullEventName = domain.getDomain() + "." + event.getName();

        String eventProcessorClassFileContent = """
                package ru.hzerr.cdp.processor.impl;
                
                import ru.hzerr.cdp.event.%s.%s;
                import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;
                
                %spublic abstract class %s extends AbstractChromeInstanceEventProcessor<%s> {
                
                    public %s() {
                        super("%s", %s.class);
                    }
                
                    @Override
                    protected abstract void onEvent(%s event) throws Exception;
                
                    @Override
                    protected abstract void onEventProcessingException(Exception e);
                
                    @Override
                    public String getEventName() { return "%s"; }
                }
                """.formatted(getShirtPackageByDomainName(domain.getDomain()), eventClassName, event.isDeprecated() ? "@Deprecated\n" : "", eventProcessorClassName, eventClassName, eventProcessorClassName, fullEventName, eventClassName, eventClassName, fullEventName);

        PathUtils.writeString(eventProcessorPath, eventProcessorClassFileContent, StandardCharsets.UTF_8);

        // Добавление метода создания процессора и информации в ChromeInstanceEventProcessorCreator
        creatorEventsImportBuilder.append("import ru.hzerr.cdp.event.").append(getShirtPackageByDomainName(domain.getDomain())).append(".").append(eventClassName).append(";\n");
        if (event.isDeprecated()) creatorEventNameFieldsBuilder.append("\t@Deprecated\n");
        creatorEventNameFieldsBuilder.append("\tpublic static final String ");
        String eventTmpName = StringUtils.capitalize(event.getName()).startsWith(domain.getDomain()) ? StringUtils.capitalize(event.getName()) : domain.getDomain() + StringUtils.capitalize(event.getName());
        for (String partName: StringUtils.splitByCharacterTypeCamelCase(eventTmpName)) {
            creatorEventNameFieldsBuilder.append(partName.toUpperCase()).append("_");
        }
        creatorEventNameFieldsBuilder.append("EVENT_NAME = \"").append(fullEventName).append("\";\n");
        creatorCreateMethodsBuilder.append("""
                    %spublic static %s create%s(EventProcessingHandler<ru.hzerr.cdp.event.%s.%s> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
                        return new %s() {
                
                            @Override
                            protected void onEvent(ru.hzerr.cdp.event.%s.%s event) throws Exception {
                                eventHandler.onEvent(event);
                            }
                
                            @Override
                            protected void onEventProcessingException(Exception e) {
                                exceptionHandler.onEventProcessingException(e);
                            }
                        };
                    }

                """.formatted(event.isDeprecated() ? "@Deprecated\n\t" : "", eventProcessorClassName, eventProcessorClassName, getShirtPackageByDomainName(domain.getDomain()), eventClassName, eventProcessorClassName, getShirtPackageByDomainName(domain.getDomain()), eventClassName));
    }

    private void createTypes0(Path chromeDevToolsTypesPath, ChromeDevToolsSpecification chromeDevToolsSpecification) throws IOException {
        for (Domain domain: chromeDevToolsSpecification.getDomains()) {
            Path domainPath = chromeDevToolsTypesPath.resolve(getShirtPackageByDomainName(domain.getDomain()));
            Files.createDirectories(domainPath);
            log.info("Domain directory has been successfully created: {}!", domainPath);
        }

        for (Domain domain: chromeDevToolsSpecification.getDomains()) {
            if (domain.getTypes() != null) {
                for (Class cls : domain.getTypes()) {
                    if (cls.getType().equals("object")) { // Создаем классы только в случае, если тип является обьектом. Все типы: number, string, array, integer, object
                        createType(chromeDevToolsTypesPath, chromeDevToolsSpecification, domain, cls);
                        log.info("Type {} has been successfully created!", cls.getName());
                    }
                }
            }
        }
    }

    private void createType(Path chromeDevToolsTypesPath, ChromeDevToolsSpecification chromeDevToolsSpecification, Domain domain, Class cls) throws IOException {
        Path domainPath = chromeDevToolsTypesPath.resolve(getShirtPackageByDomainName(domain.getDomain()));
        Path typePath = domainPath.resolve("%s.java".formatted(cls.getName()));

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
                                    Domain referenceDomain = chromeDevToolsSpecification.getDomain(reference[0]);
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
                                            if (!importBuilder.toString().contains("ru.hzerr.cdp.type." + getShirtPackageByDomainName(referenceDomain.getDomain()) + "." + referenceType.getName())) {
                                                importBuilder.append("import ru.hzerr.cdp.type.").append(getShirtPackageByDomainName(referenceDomain.getDomain())).append(".").append(referenceType.getName()).append(";\n");
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
                        Domain referenceDomain = chromeDevToolsSpecification.getDomain(reference[0]);
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
                                if (!importBuilder.toString().contains("ru.hzerr.cdp.type." + getShirtPackageByDomainName(referenceDomain.getDomain()) + "." + referenceType.getName())) {
                                    importBuilder.append("import ru.hzerr.cdp.type.").append(getShirtPackageByDomainName(referenceDomain.getDomain())).append(".").append(referenceType.getName()).append(";\n");
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
//                        // Сначала создаем тип в текущем домене на который ведет reference
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
                package ru.hzerr.cdp.type.%s;
                
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

        PathUtils.writeString(typePath, classFileContent, StandardCharsets.UTF_8);
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
