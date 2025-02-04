package org.opendatamesh.cli.extensions;

import java.util.Map;

public class OdmCliBaseConfiguration {

    private String templateFolder;

    private Map<String, Map<String, String>> services;
    private Map<String, Map<String, String>> systems;
    private Map<String, String> env;

    public String getTemplateFolder() {
        return templateFolder;
    }

    public void setTemplateFolder(String templateFolder) {
        this.templateFolder = templateFolder;
    }

    public Map<String, Map<String, String>> getServices() {
        return services;
    }

    public void setServices(Map<String, Map<String, String>> services) {
        this.services = services;
    }

    public Map<String, Map<String, String>> getSystems() {
        return systems;
    }

    public void setSystems(Map<String, Map<String, String>> systems) {
        this.systems = systems;
    }

    public Map<String, String> getEnv() {
        return env;
    }

    public void setEnv(Map<String, String> env) {
        this.env = env;
    }
}
