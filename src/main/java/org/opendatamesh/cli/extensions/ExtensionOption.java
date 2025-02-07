package org.opendatamesh.cli.extensions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ExtensionOption {
    private final List<String> names;
    private final String paramLabel;
    private final String description;
    private final boolean required;
    private final boolean interactive;
    private final String defaultValue;
    private final Consumer<String> setter;
    private final Supplier<String> getter;

    public List<String> getNames() {
        return names;
    }

    public String getParamLabel() {
        return paramLabel;
    }

    public String getDescription() {
        return description;
    }

    public boolean isRequired() {
        return required;
    }

    public boolean isInteractive() {
        return interactive;
    }


    public String getDefaultValue() {
        return defaultValue;
    }

    public Consumer<String> getSetter() {
        return setter;
    }

    public Supplier<String> getGetter() {
        return getter;
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
    }

    public static class Builder {
        private List<String> names;
        private String paramLabel;
        private String description;
        private boolean required;
        private boolean interactive;
        private String defaultValue;
        private Consumer<String> setter;
        private Supplier<String> getter;


        public Builder names(String... names) {
            this.names = Arrays.stream(names).collect(Collectors.toList());
            return this;
        }

        public Builder paramLabel(String paramLabel) {
            this.paramLabel = paramLabel;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder required(boolean required) {
            this.required = required;
            return this;
        }

        public Builder interactive(boolean interactive) {
            this.interactive = interactive;
            return this;
        }

        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setter(Consumer<String> setter) {
            this.setter = setter;
            return this;
        }

        public Builder getter(Supplier<String> getter) {
            this.getter = getter;
            return this;
        }

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
