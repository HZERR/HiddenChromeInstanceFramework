package ru.hzerr.cdp.creator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import ru.hzerr.utils.JsonToStringStyle;

import java.util.List;

public class Field {

    private String name;
    private String description;
    private boolean optional;
    private boolean deprecated;
    private boolean experimental;
    private String type;
    @JsonProperty("$ref")
    private String reference;
    @JsonProperty("items")
    private ArrayType arrayType;
    @JsonProperty("enum")
    private List<String> enumValues;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isOptional() { return optional; }
    public void setOptional(boolean optional) { this.optional = optional; }
    /** ТИП РАВЕН null,ЕСЛИ ПРИСУТСТВУЕТ ССЫЛКА НА ДРУГОЙ ОБЬЕКТ.all:null,number,boolean,string,array,binary,integer,any,object*/ public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
    public ArrayType getArrayType() { return arrayType; }
    public void setArrayType(ArrayType arrayType) { this.arrayType = arrayType; }
    public List<String> getEnumValues() { return enumValues; }
    public void setEnumValues(List<String> enumValues) { this.enumValues = enumValues; }
    public boolean isDeprecated() { return deprecated; }
    public void setDeprecated(boolean deprecated) { this.deprecated = deprecated; }
    public boolean isExperimental() { return experimental; }
    public void setExperimental(boolean experimental) { this.experimental = experimental; }

    @Override
    public String toString() {
        return new ToStringBuilder(this, new JsonToStringStyle())
                .append("name", name)
                .append("description", description)
                .append("optional", optional)
                .append("experimental", experimental)
                .append("type", type)
                .append("reference", reference)
                .append("arrayType", arrayType)
                .append("enumValues", enumValues)
                .append("deprecated", deprecated)
                .toString();
    }
}
