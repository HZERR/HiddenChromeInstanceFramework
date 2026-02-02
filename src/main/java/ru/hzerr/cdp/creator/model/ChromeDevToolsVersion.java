package ru.hzerr.cdp.creator.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import ru.hzerr.utils.JsonToStringStyle;

public class ChromeDevToolsVersion {

    private String major;
    private String minor;

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    public String getMinor() { return minor; }
    public void setMinor(String minor) { this.minor = minor; }

    @Override
    public String toString() {
        return new ToStringBuilder(this, new JsonToStringStyle())
                .append("major", major)
                .append("minor", minor)
                .toString();
    }
}
