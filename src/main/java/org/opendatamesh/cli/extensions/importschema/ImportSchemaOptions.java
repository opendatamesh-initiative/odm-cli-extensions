package org.opendatamesh.cli.extensions.importschema;

import org.opendatamesh.cli.extensions.OdmCliBaseConfiguration;

import java.nio.file.Path;
import java.util.Map;

public class ImportSchemaOptions {
    private Path rootDescriptorPath;
    private Map<String, String> commandCliInputParameters;
    private Map<String, String> commandCliOutputParameters;
    private OdmCliBaseConfiguration odmCliConfig;

    public Path getRootDescriptorPath() {
        return rootDescriptorPath;
    }

    public void setRootDescriptorPath(Path rootDescriptorPath) {
        this.rootDescriptorPath = rootDescriptorPath;
    }

    public Map<String, String> getCommandCliInputParameters() {
        return commandCliInputParameters;
    }

    public void setCommandCliInputParameters(Map<String, String> commandCliInputParameters) {
        this.commandCliInputParameters = commandCliInputParameters;
    }

    public Map<String, String> getCommandCliOutputParameters() {
        return commandCliOutputParameters;
    }

    public void setCommandCliOutputParameters(Map<String, String> commandCliOutputParameters) {
        this.commandCliOutputParameters = commandCliOutputParameters;
    }

    public OdmCliBaseConfiguration getOdmCliConfig() {
        return odmCliConfig;
    }

    public void setOdmCliConfig(OdmCliBaseConfiguration odmCliConfig) {
        this.odmCliConfig = odmCliConfig;
    }
}
