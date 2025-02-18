package org.opendatamesh.cli.extensions.importer;

import org.opendatamesh.cli.extensions.Extension;
import org.opendatamesh.dpds.model.core.EntityDPDS;

/**
 * Represents an extension for importing objects inside Open Data Mesh Descriptor elements.
 */
public interface ImporterExtension<T extends EntityDPDS> extends Extension {

    /**
     * Determines if the extension supports the import from a schema source to a Data Product Descriptor element.
     *
     * @param from the type of source.
     * @param to   the target Data Product Descriptor element type.
     * @return {@code true} if the import is supported, {@code false} otherwise.
     */
    boolean supports(String from, String to);

    /**
     * Generates a Data Product Descriptor element from a schema source.
     *
     * @param target       the type of entity being imported, extending {@link EntityDPDS}.
     * @param arguments the arguments specifying the import details. {@link ImporterArguments}
     * @return the imported element as an instance of {@link EntityDPDS}.
     */
    T importElement(T target, ImporterArguments arguments);

    Class<T> getTargetClass();

}
