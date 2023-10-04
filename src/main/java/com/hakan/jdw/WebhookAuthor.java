package com.hakan.jdw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.util.List;

/**
 * Represents a webhook author.
 */
public class WebhookAuthor implements BaseObject {

    private String url;
    private String name;
    private String iconUrl;

    /**
     * Creates a new webhook author.
     *
     * @param url     The url of the author.
     * @param name    The name of the author.
     * @param iconUrl The icon url of the author.
     */
    public WebhookAuthor(@Nullable String url,
                         @Nullable String name,
                         @Nullable String iconUrl) {
        this.url = url;
        this.name = name;
        this.iconUrl = iconUrl;
    }

    /**
     * Gets the url of the author.
     *
     * @return The url of the author.
     */
    public @Nullable String getUrl() {
        return this.url;
    }

    /**
     * Gets the name of the author.
     *
     * @return The name of the author.
     */
    public @Nullable String getName() {
        return this.name;
    }

    /**
     * Gets the icon url of the author.
     *
     * @return The icon url of the author.
     */
    public @Nullable String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * Sets the url of the author.
     *
     * @param url The url of the author.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookAuthor setUrl(@Nullable String url) {
        this.url = url;
        return this;
    }

    /**
     * Sets the name of the author.
     *
     * @param name The name of the author.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookAuthor setName(@Nullable String... name) {
        this.name = String.join("\n", name);
        return this;
    }

    /**
     * Sets the name of the author.
     *
     * @param name The name of the author.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookAuthor setName(@NotNull List<String> name) {
        this.name = String.join("\n", name);
        return this;
    }

    /**
     * Sets the icon url of the author.
     *
     * @param iconUrl The icon url of the author.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookAuthor setIconUrl(@Nullable String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull JSONObject toJson() {
        JSONObject json = new JSONObject();

        if (this.url != null)
            json.put("url", this.url);
        if (this.name != null)
            json.put("name", this.name);
        if (this.iconUrl != null)
            json.put("icon_url", this.iconUrl);

        return json;
    }



    /**
     * {@inheritDoc}
     */
    public static class Builder implements com.hakan.jdw.Builder<WebhookAuthor> {

        private String url;
        private String name;
        private String iconUrl;

        /**
         * Sets the url of the author.
         *
         * @param url The url of the author.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder url(@NotNull String url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the name of the author.
         *
         * @param name The name of the author.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder name(@NotNull String... name) {
            this.name = String.join("\n", name);
            return this;
        }

        /**
         * Sets the name of the author.
         *
         * @param name The name of the author.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder name(@NotNull List<String> name) {
            this.name = String.join("\n", name);
            return this;
        }

        /**
         * Sets the icon url of the author.
         *
         * @param iconUrl The icon url of the author.
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
        public @NotNull WebhookAuthor build() {
            return new WebhookAuthor(
                    this.url,
                    this.name,
                    this.iconUrl
            );
        }
    }
}
