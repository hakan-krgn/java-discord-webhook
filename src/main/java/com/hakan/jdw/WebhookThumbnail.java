package com.hakan.jdw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/**
 * Represents a webhook thumbnail.
 */
public class WebhookThumbnail implements JsonObject {

    private String url;

    /**
     * Creates a new webhook thumbnail.
     *
     * @param url The url of the thumbnail.
     */
    public WebhookThumbnail(@Nullable String url) {
        this.url = url;
    }

    /**
     * Gets the url of the thumbnail.
     *
     * @return The url of the thumbnail.
     */
    public @Nullable String getUrl() {
        return this.url;
    }

    /**
     * Sets the url of the thumbnail.
     *
     * @param url The url of the thumbnail.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookThumbnail setUrl(@Nullable String url) {
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
    public static class Builder implements com.hakan.jdw.Builder<WebhookThumbnail> {

        private String url;

        /**
         * Sets the url of the thumbnail.
         *
         * @param url The url of the thumbnail.
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
        public @NotNull WebhookThumbnail build() {
            return new WebhookThumbnail(
                    this.url
            );
        }
    }
}
