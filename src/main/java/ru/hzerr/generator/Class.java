package ru.hzerr.generator;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import ru.hzerr.utils.JsonToStringStyle;

import java.util.List;

// Является классом только если type = object
public class Class {

    @JsonProperty("id")
    private String name;
    private String description;
    private String type;
    private boolean experimental;
    private boolean deprecated;
    @JsonProperty("enum")
    private List<String> enumValues; // УКАЗЫВАЮТС В СЛУЧАЕ, ЕСЛИ type == string!
    @JsonProperty("properties")
    private List<Field> fields;

    // УКАЗЫВАЕТСЯ В СЛУЧАЕ, ЕСЛИ ЭТО ПОЛЕ ДОМЕНА ЯВЛЯЕТСЯ МАССИВОМ
    @JsonProperty("items")
    private ArrayType arrayType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isExperimental() {
        return experimental;
    }

    public void setExperimental(boolean experimental) {
        this.experimental = experimental;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public ArrayType getArrayType() {
        return arrayType;
    }

    public void setArrayType(ArrayType arrayType) {
        this.arrayType = arrayType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, new JsonToStringStyle())
                .append("name", name)
                .append("description", description)
                .append("type", type)
                .append("experimental", experimental)
                .append("deprecated", deprecated)
                .append("enumValues", enumValues)
                .append("fields", fields)
                .append("arrayType", arrayType)
                .toString();
    }
}
