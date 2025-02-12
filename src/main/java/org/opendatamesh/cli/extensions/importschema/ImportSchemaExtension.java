package org.opendatamesh.cli.extensions.importschema;

import org.opendatamesh.cli.extensions.Extension;
import org.opendatamesh.dpds.model.core.EntityDPDS;

/**
 * Represents an extension for importing schemas inside Open Data Mesh Descriptor elements.
 */
public interface ImportSchemaExtension extends Extension {

    /**
     * Determines if the extension supports the import from a schema source to a Data Product Descriptor element.
     *
     * @param from the type of the schema source.
     * @param to   the target Data Product Descriptor element type.
     * @return {@code true} if the import is supported, {@code false} otherwise.
     */
    boolean supports(String from, String to);

    /**
     * Generates a Data Product Descriptor element from a schema source.
     *
     * @param <T>       the type of entity being imported, extending {@link EntityDPDS}.
     * @param arguments the arguments specifying the import details. {@link ImportSchemaArguments}
     * @return the imported element as an instance of {@link EntityDPDS}.
     */
    <T extends EntityDPDS> T importElement(ImportSchemaArguments arguments);
}
