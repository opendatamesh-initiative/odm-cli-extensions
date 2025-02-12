package org.opendatamesh.cli.extensions;

import java.util.List;

/**
 * Represents an extension for the OpenDataMesh CLI.
 * Extensions provide additional functionality that can be configured
 * using a set of options and metadata.
 */
public interface Extension {

    /**
     * Retrieves the list of available command options for this extension.
     *
     * @return a list of {@link ExtensionOption} representing the command options.
     */
    List<ExtensionOption> getExtensionOptions();

    /**
     * Provides metadata about the extension, such as name, version, and description.
     *
     * @return an {@link ExtensionInfo} object containing information about the extension.
     */
    ExtensionInfo getExtensionInfo();
}
