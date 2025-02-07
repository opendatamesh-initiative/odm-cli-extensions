package org.opendatamesh.cli.extensions;

import java.util.List;

public interface Extension {
    List<ExtensionOption> getExtensionOptions();

    ExtensionInfo getExtensionInfo();
}
