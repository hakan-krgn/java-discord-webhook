package com.hakan.jdw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.util.List;

/**
 * Represents a webhook footer.
 */
public class WebhookFooter implements BaseObject {

    private String text;
    private String iconUrl;

    /**
     * Creates a new webhook footer.
     *
     * @param text    The text of the footer.
     * @param iconUrl The icon url of the footer.
     */
    public WebhookFooter(@Nullable String text,
                         @Nullable String iconUrl) {
        this.text = text;
        this.iconUrl = iconUrl;
    }

    /**
     * Gets the text of the footer.
     *
     * @return The text of the footer.
     */
    public @Nullable String getText() {
        return this.text;
    }

    /**
     * Gets the icon url of the footer.
     *
     * @return The icon url of the footer.
     */
    public @Nullable String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * Sets the text of the footer.
     *
     * @param text The text of the footer.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookFooter setText(@Nullable String... text) {
        this.text = String.join("\n", text);
        return this;
    }

    /**
     * Sets the text of the footer.
     *
     * @param text The text of the footer.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookFooter setText(@NotNull List<String> text) {
        this.text = String.join("\n", text);
        return this;
    }

    /**
     * Sets the icon url of the footer.
     *
     * @param iconUrl The icon url of the footer.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookFooter setIconUrl(@Nullable String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull JSONObject toJson() {
        JSONObject json = new JSONObject();

        if (this.text != null)
            json.put("text", this.text);
        if (this.iconUrl != null)
            json.put("icon_url", this.iconUrl);

        return json;
    }



    /**
     * {@inheritDoc}
     */
    public static class Builder implements com.hakan.jdw.Builder<WebhookFooter> {

        private String text;
        private String iconUrl;

        /**
         * Sets the text of the footer.
         *
         * @param text The text of the footer.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder text(@NotNull String... text) {
            this.text = String.join("\n", text);
            return this;
        }

        /**
         * Sets the text of the footer.
         *
         * @param text The text of the footer.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder text(@NotNull List<String> text) {
            this.text = String.join("\n", text);
            return this;
        }

        /**
         * Sets the icon url of the footer.
         *
         * @param iconUrl The icon url of the footer.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder iconUrl(@NotNull String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull WebhookFooter build() {
            return new WebhookFooter(
                    this.text,
                    this.iconUrl
            );
        }
    }
}
