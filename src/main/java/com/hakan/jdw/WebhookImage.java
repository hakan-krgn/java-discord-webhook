package com.hakan.jdw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/**
 * Represents a webhook image.
 */
public class WebhookImage implements JsonObject {

    private String url;

    /**
     * Creates a new webhook image.
     *
     * @param url The url of the image.
     */
    public WebhookImage(@Nullable String url) {
        this.url = url;
    }

    /**
     * Gets the url of the image.
     *
     * @return The url of the image.
     */
    public @Nullable String getUrl() {
        return this.url;
    }

    /**
     * Sets the url of the image.
     *
     * @param url The url of the image.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookImage setUrl(@Nullable String url) {
        this.url = url;
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

        return json;
    }



    /**
     * {@inheritDoc}
     */
    public static class Builder implements com.hakan.jdw.Builder<WebhookImage> {

        private String url;

        /**
         * Sets the url of the image.
         *
         * @param url The url of the image.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder url(@NotNull String url) {
            this.url = url;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull WebhookImage build() {
            return new WebhookImage(
                    this.url
            );
        }
    }
}
