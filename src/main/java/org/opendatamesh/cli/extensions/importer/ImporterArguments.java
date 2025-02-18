package org.opendatamesh.cli.extensions.importer;

import org.opendatamesh.cli.extensions.OdmCliBaseConfiguration;
import org.opendatamesh.dpds.model.DataProductVersionDPDS;

import java.nio.file.Path;
import java.util.Map;

/**
 * Represents the arguments required for an import command extension.
 * This class encapsulates configuration details such as the root descriptor path,
 * command options, and CLI base configuration.
 */
public class ImporterArguments {

    /**
     * The root path of the descriptor file where the schema will be imported.
     */
    private Path rootDescriptorPath;

    /**
     * The current data product version object.
     */
    private DataProductVersionDPDS dataProductVersion;

    /**
     * Options provided by the parent command, represented as key-value pairs.
     */
    private Map<String, String> parentCommandOptions;

    /**
     * The base configuration of the OpenDataMesh CLI.
     */
    private OdmCliBaseConfiguration odmCliConfig;

    /**
     * Retrieves the root path of the descriptor file.
     *
     * @return the {@link Path} of the root descriptor.
     */
    public Path getRootDescriptorPath() {
        return rootDescriptorPath;
    }

    /**
     * Sets the root path of the descriptor file.
     *
     * @param rootDescriptorPath the {@link Path} to be set.
     */
    public void setRootDescriptorPath(Path rootDescriptorPath) {
        this.rootDescriptorPath = rootDescriptorPath;
    }

    /**
     * Retrieves the parent command options.
     *
     * @return a {@link Map} containing key-value pairs of command options.
     */
    public Map<String, String> getParentCommandOptions() {
        return parentCommandOptions;
    }

    /**
     * Sets the parent command options.
     *
     * @param parentCommandOptions a {@link Map} containing key-value pairs of command options.
     */
    public void setParentCommandOptions(Map<String, String> parentCommandOptions) {
        this.parentCommandOptions = parentCommandOptions;
    }

    /**
     * Retrieves the OpenDataMesh CLI base configuration.
     *
     * @return the {@link OdmCliBaseConfiguration} instance.
     */
    public OdmCliBaseConfiguration getOdmCliConfig() {
        return odmCliConfig;
    }

    /**
     * Sets the OpenDataMesh CLI base configuration.
     *
     * @param odmCliConfig the {@link OdmCliBaseConfiguration} to be set.
     */
    public void setOdmCliConfig(OdmCliBaseConfiguration odmCliConfig) {
        this.odmCliConfig = odmCliConfig;
    }

    public DataProductVersionDPDS getDataProductVersion() {
        return dataProductVersion;
    }

    public void setDataProductVersion(DataProductVersionDPDS dataProductVersion) {
        this.dataProductVersion = dataProductVersion;
    }
}
