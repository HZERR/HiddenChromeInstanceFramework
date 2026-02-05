package ru.hzerr.cdp.creator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;
import ru.hzerr.utils.JsonToStringStyle;

import java.util.List;

@JsonIgnoreProperties({"commands"})
public class Domain {

    private String domain;
    private boolean experimental;
    private boolean deprecated;
    private String description;
    private List<String> dependencies;
    private List<Class> types;
    private List<Event> events;

    public String getDomain() { return domain; }
    public void setDomain(String domain) { this.domain = domain; }
    public boolean isDeprecated() { return deprecated; }
    public void setDeprecated(boolean deprecated) { this.deprecated = deprecated; }
    public boolean isExperimental() { return experimental; }
    public void setExperimental(boolean experimental) { this.experimental = experimental; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public List<String> getDependencies() { return dependencies; }
    public void setDependencies(List<String> dependencies) { this.dependencies = dependencies; }
    /** all:number,string,array,integer,object*/ public List<Class> getTypes() { return types; }
    public void setTypes(List<Class> types) { this.types = types; }
    public Class getType(String typeName) {
        for (Class type : types) {
            if (type.getName().equals(typeName)) return type;
        }

        throw new IllegalArgumentException("No such type: " + typeName);
    }
    public List<Event> getEvents() { return events; }
    public void setEvents(List<Event> events) { this.events = events; }

    @Override
    public String toString() {
        return new ToStringBuilder(this, new JsonToStringStyle())
                .append("domain", domain)
                .append("experimental", experimental)
                .append("deprecated", deprecated)
                .append("description", description)
                .append("dependencies", dependencies)
                .append("types", types)
                .toString();
    }
}
