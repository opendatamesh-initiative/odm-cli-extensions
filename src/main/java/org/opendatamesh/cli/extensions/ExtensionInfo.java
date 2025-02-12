package org.opendatamesh.cli.extensions;

/**
 * This class represent the extension metadata.
 */
public class ExtensionInfo {
    private final String description;

    private ExtensionInfo(Builder builder) {
        this.description = builder.description;
    }

    /**
     * Gets the description of the extension.
     * This should contain what the extension does and
     * how to use it.
     *
     * @return the description of the extension.
     */
    public String getDescription() {
        return description;
    }

    public static class Builder {
        private String description;

        /**
         * The description of the extension should contain
         * what the extension does and how to use it.
         *
         * @param description the description of the extension.
         * @return the builder instance.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public ExtensionInfo build() {
            if (this.description == null || this.description.isEmpty()) {
                throw new IllegalStateException("Description must be provided");
            }
            return new ExtensionInfo(this);
        }
    }
}
