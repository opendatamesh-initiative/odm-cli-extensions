package org.opendatamesh.cli.extensions.importschema;

import org.opendatamesh.cli.extensions.OdmCliBaseConfiguration;

import java.nio.file.Path;
import java.util.Map;

public class ImportSchemaArguments {
    private Path rootDescriptorPath;
    private Map<String, String> parentCommandOptions;
    private OdmCliBaseConfiguration odmCliConfig;

    public Path getRootDescriptorPath() {
        return rootDescriptorPath;
    }

    public void setRootDescriptorPath(Path rootDescriptorPath) {
        this.rootDescriptorPath = rootDescriptorPath;
    }

    public Map<String, String> getParentCommandOptions() {
        return parentCommandOptions;
    }

    public void setParentCommandOptions(Map<String, String> parentCommandOptions) {
        this.parentCommandOptions = parentCommandOptions;
    }

    public OdmCliBaseConfiguration getOdmCliConfig() {
        return odmCliConfig;
    }

    public void setOdmCliConfig(OdmCliBaseConfiguration odmCliConfig) {
        this.odmCliConfig = odmCliConfig;
    }
}
