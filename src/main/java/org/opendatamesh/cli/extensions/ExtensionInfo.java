package org.opendatamesh.cli.extensions;

public class ExtensionInfo {
    private final String description;

    private ExtensionInfo(Builder builder) {
        this.description = builder.description;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private String description;

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
