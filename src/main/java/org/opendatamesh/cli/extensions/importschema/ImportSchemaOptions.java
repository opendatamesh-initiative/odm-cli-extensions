package org.opendatamesh.cli.extensions.importschema;

import org.opendatamesh.cli.extensions.OdmCliBaseConfiguration;

import java.nio.file.Path;
import java.util.Map;

public class ImportSchemaOptions {
    private Path rootDescriptorPath;
    private Map<String, String> commandCliParameters;
    private OdmCliBaseConfiguration odmCliConfig;

    public Path getRootDescriptorPath() {
        return rootDescriptorPath;
    }

    public void setRootDescriptorPath(Path rootDescriptorPath) {
        this.rootDescriptorPath = rootDescriptorPath;
    }

    public Map<String, String> getCommandCliParameters() {
        return commandCliParameters;
    }

    public void setCommandCliParameters(Map<String, String> commandCliParameters) {
        this.commandCliParameters = commandCliParameters;
    }

    public OdmCliBaseConfiguration getOdmCliConfig() {
        return odmCliConfig;
    }

    public void setOdmCliConfig(OdmCliBaseConfiguration odmCliConfig) {
        this.odmCliConfig = odmCliConfig;
    }
}
