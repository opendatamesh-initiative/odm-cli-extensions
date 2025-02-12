package org.opendatamesh.cli.extensions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * This class represent a single command option of the extension
 */
public class ExtensionOption {
    private final List<String> names;
    private final String paramLabel;
    private final String description;
    private final boolean required;
    private final boolean interactive;
    private final String defaultValue;
    private final String defaultValueFromConfig;
    private final Consumer<String> setter;
    private final Supplier<String> getter;

    /**
     * Gets the list of the option names (e.g --portName).
     *
     * @return the list of option names
     */
    public List<String> getNames() {
        return names;
    }

    /**
     * Gets the parameter label of the option.
     *
     * @return the parameter label
     */
    public String getParamLabel() {
        return paramLabel;
    }

    /**
     * Gets the description of the option.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Checks if the option is required.
     *
     * @return {@code true} if the option is required, {@code false} otherwise
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Checks if the option is interactive.
     *
     * @return {@code true} if the option is interactive, {@code false} otherwise
     */
    public boolean isInteractive() {
        return interactive;
    }

    /**
     * Gets the default value of the option.
     *
     * @return the default value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Gets the setter function for this option.
     *
     * @return the setter function
     */
    public Consumer<String> getSetter() {
        return setter;
    }

    /**
     * Gets the getter function for this option.
     *
     * @return the getter function
     */
    public Supplier<String> getGetter() {
        return getter;
    }

    /// Gets the default value from the configuration. This must use a dot notation to retrieve
    /// values from the application configuration file of the odm-cli application (application.yml).
    ///
    /// E.g. `cli.env.custom`
    ///
    /// @return the default value from configuration
    public String getDefaultValueFromConfig() {
        return defaultValueFromConfig;
    }

    private ExtensionOption(Builder builder) {
        this.names = builder.names;
        this.paramLabel = builder.paramLabel;
        this.description = builder.description;
        this.required = builder.required;
        this.interactive = builder.interactive;
        this.defaultValue = builder.defaultValue;
        this.setter = builder.setter;
        this.getter = builder.getter;
        this.defaultValueFromConfig = builder.defaultValueFromConfig;
    }

    /**
     * Builder class for {@link ExtensionOption}.
     */
    public static class Builder {
        private List<String> names;
        private String paramLabel;
        private String description;
        private boolean required;
        private boolean interactive;
        private String defaultValue;
        public String defaultValueFromConfig;
        private Consumer<String> setter;
        private Supplier<String> getter;

        /**
         * Sets the names for the option.
         *
         * @param names the names to set (e.g. --portName, -p, etc...)
         * @return the builder instance
         */
        public Builder names(String... names) {
            this.names = Arrays.stream(names).collect(Collectors.toList());
            return this;
        }

        /**
         * Sets the parameter label for the option.
         *
         * @param paramLabel the parameter label
         * @return the builder instance
         */
        public Builder paramLabel(String paramLabel) {
            this.paramLabel = paramLabel;
            return this;
        }

        /**
         * Sets the description for the option.
         *
         * @param description the description
         * @return the builder instance
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets whether the option is required.
         *
         * @param required {@code true} if required, otherwise {@code false}
         * @return the builder instance
         */
        public Builder required(boolean required) {
            this.required = required;
            return this;
        }

        /**
         * Sets whether the option is interactive.
         *
         * @param interactive {@code true} if interactive, otherwise {@code false}
         * @return the builder instance
         */
        public Builder interactive(boolean interactive) {
            this.interactive = interactive;
            return this;
        }

        /**
         * Sets the default value for the option.
         *
         * @param defaultValue the default value
         * @return the builder instance
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /// Sets the default value from the configuration. This
        ///
        /// @param defaultValueFromConfig the default value from config. This must use a dot notation to retrieve
        ///                                    values from the application configuration file of the odm-cli application (application.yml).
        ///
        ///                                    E.g. `cli.env.custom`
        /// @return the builder instance
        public Builder defaultValueFromConfig(String defaultValueFromConfig) {
            this.defaultValueFromConfig = defaultValueFromConfig;
            return this;
        }

        /**
         * Sets the setter function.
         *
         * @param setter the setter function
         * @return the builder instance
         */
        public Builder setter(Consumer<String> setter) {
            this.setter = setter;
            return this;
        }

        /**
         * Sets the getter function.
         *
         * @param getter the getter function
         * @return the builder instance
         */
        public Builder getter(Supplier<String> getter) {
            this.getter = getter;
            return this;
        }

        /**
         * Builds an instance of {@link ExtensionOption}.
         *
         * @return a new instance of {@link ExtensionOption}
         * @throws IllegalStateException if required fields are not set
         */
        public ExtensionOption build() {
            if (this.names == null || this.names.isEmpty()) {
                throw new IllegalStateException("Names must be provided");
            }
            if (this.setter == null) {
                throw new IllegalStateException("Setter must be provided");
            }
            if (this.getter == null) {
                throw new IllegalStateException("Getter must be provided");
            }
            return new ExtensionOption(this);
        }
    }
}
