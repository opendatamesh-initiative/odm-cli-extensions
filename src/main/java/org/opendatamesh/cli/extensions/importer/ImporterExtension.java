package org.opendatamesh.cli.extensions.importer;

import org.opendatamesh.cli.extensions.Extension;


/**
 * Represents an extension for importing objects inside Open Data Mesh Descriptor elements.
 */
public interface ImporterExtension<T> extends Extension {

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
     * @param target    the type of entity being imported.
     * @param arguments the arguments specifying the import details. {@link ImporterArguments}
     * @return the imported element.
     */
    T importElement(T target, ImporterArguments arguments);

    /**
     * Gets the class type of the target entity being imported.
     *
     * @return the {@link Class} object representing the target entity type.
     */
    Class<T> getTargetClass();
}
