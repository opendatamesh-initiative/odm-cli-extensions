package org.opendatamesh.cli.extensions.importschema;

import org.opendatamesh.cli.extensions.Extension;
import org.opendatamesh.dpds.model.core.EntityDPDS;

public interface ImportSchemaExtension extends Extension {
    boolean supports(String from, String to);

    <T extends EntityDPDS> T importElement(ImportSchemaArguments arguments);
}
