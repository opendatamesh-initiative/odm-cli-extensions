package org.opendatamesh.cli.extensions.importschema;

import org.opendatamesh.dpds.model.core.EntityDPDS;

public interface ImportSchemaExtension {
    boolean supports(String from, String to);

    <T extends EntityDPDS> T importElement(ImportSchemaOptions options);
}
