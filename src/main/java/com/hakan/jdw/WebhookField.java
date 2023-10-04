package com.hakan.jdw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.util.List;

/**
 * Represents a webhook field.
 */
public class WebhookField implements BaseObject {

    private String name;
    private String value;
    private Boolean inline;

    /**
     * Creates a new webhook field.
     *
     * @param name   The name of the field.
     * @param value  The value of the field.
     * @param inline The inline mode of the field.
     */
    public WebhookField(@NotNull String name,
                        @NotNull String value,
                        @Nullable Boolean inline) {
        this.name = name;
        this.value = value;
        this.inline = inline;
    }

    /**
     * Gets the name of the field.
     *
     * @return The name of the field.
     */
    public @NotNull String getName() {
        return this.name;
    }

    /**
     * Gets the value of the field.
     *
     * @return The value of the field.
     */
    public @NotNull String getValue() {
        return this.value;
    }

    /**
     * Gets the inline mode of the field.
     *
     * @return The inline mode of the field.
     */
    public @Nullable Boolean isInline() {
        return this.inline;
    }

    /**
     * Sets the name of the field.
     *
     * @param name The name of the field.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookField setName(@NotNull String... name) {
        this.name = String.join("\n", name);
        return this;
    }

    /**
     * Sets the name of the field.
     *
     * @param name The name of the field.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookField setName(@NotNull List<String> name) {
        this.name = String.join("\n", name);
        return this;
    }

    /**
     * Sets the value of the field.
     *
     * @param value The value of the field.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookField setValue(@NotNull String... value) {
        this.value = String.join("\n", value);
        return this;
    }

    /**
     * Sets the value of the field.
     *
     * @param value The value of the field.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookField setValue(@NotNull List<String> value) {
        this.value = String.join("\n", value);
        return this;
    }

    /**
     * Sets the inline mode of the field.
     *
     * @param inline The inline mode of the field.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookField setInline(@Nullable Boolean inline) {
        this.inline = inline;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull JSONObject toJson() {
        JSONObject json = new JSONObject();

        if (this.name != null)
            json.put("name", this.name);
        if (this.value != null)
            json.put("value", this.value);
        if (this.inline != null)
            json.put("inline", this.inline);

        return json;
    }



    /**
     * {@inheritDoc}
     */
    public static class Builder implements com.hakan.jdw.Builder<WebhookField> {

        private String name = "";
        private String value = "";
        private boolean inline;

        /**
         * Sets the name of the field.
         *
         * @param name The name of the field.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder name(@NotNull String... name) {
            this.name = String.join("\n", name);
            return this;
        }

        /**
         * Sets the name of the field.
         *
         * @param name The name of the field.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder name(@NotNull List<String> name) {
            this.name = String.join("\n", name);
            return this;
        }

        /**
         * Sets the value of the field.
         *
         * @param value The value of the field.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder value(@NotNull String... value) {
            this.value = String.join("\n", value);
            return this;
        }

        /**
         * Sets the value of the field.
         *
         * @param value The value of the field.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder value(@NotNull List<String> value) {
            this.value = String.join("\n", value);
            return this;
        }

        /**
         * Sets the inline mode of the field.
         *
         * @param inline The inline mode of the field.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder inline(boolean inline) {
            this.inline = inline;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull WebhookField build() {
            return new WebhookField(
                    this.name,
                    this.value,
                    this.inline
            );
        }
    }
}
