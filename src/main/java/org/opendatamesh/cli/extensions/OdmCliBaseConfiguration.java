package org.opendatamesh.cli.extensions;

import java.util.List;
import java.util.Map;

public class OdmCliBaseConfiguration {
    private Config cliConfiguration;
    private List<System> remoteSystemsConfigurations;
    private Map<String, String> env;

    public Config getCliConfiguration() {
        return cliConfiguration;
    }

    public void setCliConfiguration(Config cliConfiguration) {
        this.cliConfiguration = cliConfiguration;
    }

    public List<System> getRemoteSystemsConfigurations() {
        return remoteSystemsConfigurations;
    }

    public void setRemoteSystemsConfigurations(List<System> remoteSystemsConfigurations) {
        this.remoteSystemsConfigurations = remoteSystemsConfigurations;
    }

    public Map<String, String> getEnv() {
        return env;
    }

    public void setEnv(Map<String, String> env) {
        this.env = env;
    }

    public static class System {
        private String name;
        private String endpoint;
        private String user;
        private String password;

        public String getName() {
            return name;
        }

        public String getEndpoint() {
            return endpoint;
        }

        public String getUser() {
            return user;
        }

        public String getPassword() {
            return password;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class Config {
        private String templatesFolder;

        public String getTemplatesFolder() {
            return templatesFolder;
        }

        public void setTemplatesFolder(String templatesFolder) {
            this.templatesFolder = templatesFolder;
        }
    }
}
