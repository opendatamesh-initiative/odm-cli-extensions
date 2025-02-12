package org.opendatamesh.cli.extensions;

import java.util.List;

/**
 * Represents the base configuration for the OpenDataMesh CLI.
 */
public class OdmCliBaseConfiguration {

    /**
     * Configuration settings for the CLI.
     */
    private Config cliConfiguration;

    /**
     * List of configurations for remote systems access.
     */
    private List<System> remoteSystemsConfigurations;

    /**
     * Retrieves the CLI configuration settings.
     *
     * @return the {@link Config} object containing CLI settings.
     */
    public Config getCliConfiguration() {
        return cliConfiguration;
    }

    /**
     * Sets the CLI configuration settings.
     *
     * @param cliConfiguration the {@link Config} object to be set.
     */
    public void setCliConfiguration(Config cliConfiguration) {
        this.cliConfiguration = cliConfiguration;
    }

    /**
     * Retrieves the list of remote system access configurations.
     *
     * @return a list of {@link System} objects representing remote system settings.
     */
    public List<System> getRemoteSystemsConfigurations() {
        return remoteSystemsConfigurations;
    }

    /**
     * Sets the list of remote system access configurations.
     *
     * @param remoteSystemsConfigurations a list of {@link System} objects to be set.
     */
    public void setRemoteSystemsConfigurations(List<System> remoteSystemsConfigurations) {
        this.remoteSystemsConfigurations = remoteSystemsConfigurations;
    }

    /**
     * Represents the configuration to access a remote system.
     */
    public static class System {

        /**
         * The name of the remote system.
         */
        private String name;

        /**
         * The endpoint URL of the remote system.
         */
        private String endpoint;

        /**
         * The username for authentication with the remote system.
         */
        private String user;

        /**
         * The password for authentication with the remote system.
         */
        private String password;

        /**
         * Retrieves the name of the remote system.
         *
         * @return the system name.
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the name of the remote system.
         *
         * @param name the system name to set.
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Retrieves the endpoint URL of the remote system.
         *
         * @return the system endpoint.
         */
        public String getEndpoint() {
            return endpoint;
        }

        /**
         * Sets the endpoint URL of the remote system.
         *
         * @param endpoint the system endpoint to set.
         */
        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        /**
         * Retrieves the username for authentication with the remote system.
         *
         * @return the username.
         */
        public String getUser() {
            return user;
        }

        /**
         * Sets the username for authentication with the remote system.
         *
         * @param user the username to set.
         */
        public void setUser(String user) {
            this.user = user;
        }

        /**
         * Retrieves the password for authentication with the remote system.
         *
         * @return the password.
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the password for authentication with the remote system.
         *
         * @param password the password to set.
         */
        public void setPassword(String password) {
            this.password = password;
        }
    }

    /**
     * Represents the configuration settings for the CLI.
     */
    public static class Config {

        /**
         * The folder path where the templates of Data Product Descriptor elements are stored.
         */
        private String templatesFolder;

        /**
         * Retrieves the path to the templates' folder.
         *
         * @return the templates folder path.
         */
        public String getTemplatesFolder() {
            return templatesFolder;
        }

        /**
         * Sets the path to the templates' folder.
         *
         * @param templatesFolder the templates folder path to set.
         */
        public void setTemplatesFolder(String templatesFolder) {
            this.templatesFolder = templatesFolder;
        }
    }
}
