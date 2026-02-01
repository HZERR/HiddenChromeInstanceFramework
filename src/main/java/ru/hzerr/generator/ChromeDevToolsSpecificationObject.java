package ru.hzerr.generator;

import org.apache.commons.lang3.builder.ToStringBuilder;
import ru.hzerr.utils.JsonToStringStyle;

import java.util.List;

public class ChromeDevToolsSpecificationObject {

    private ChromeDevToolsVersion version;
    private List<Domain> domains;

    public ChromeDevToolsVersion getVersion() {
        return version;
    }

    public void setVersion(ChromeDevToolsVersion version) {
        this.version = version;
    }

    public List<Domain> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, new JsonToStringStyle())
                .append("version", version)
                .append("domains", domains)
                .toString();
    }
}
