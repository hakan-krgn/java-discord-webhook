package com.hakan.jdw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.function.UnaryOperator;

import static com.hakan.jdw.utils.WebhookUtils.colorToInt;
import static com.hakan.jdw.utils.WebhookUtils.dateToText;

/**
 * Represents a webhook embed.
 */
public class WebhookEmbed implements JsonObject {

    private String url;
    private String title;
    private String description;
    private Color color;
    private Calendar timestamp;
    private WebhookImage image;
    private WebhookAuthor author;
    private WebhookFooter footer;
    private WebhookThumbnail thumbnail;
    private List<WebhookField> fields;

    /**
     * Creates a new webhook embed.
     *
     * @param url         The url of the embed.
     * @param title       The title of the embed.
     * @param description The description of the embed.
     * @param color       The color of the embed.
     * @param timestamp   The timestamp of the embed.
     * @param image       The image of the embed.
     * @param author      The author of the embed.
     * @param footer      The footer of the embed.
     * @param thumbnail   The thumbnail of the embed.
     * @param fields      The fields of the embed.
     */
    public WebhookEmbed(@Nullable String url,
                        @Nullable String title,
                        @Nullable String description,
                        @Nullable Color color,
                        @Nullable Calendar timestamp,
                        @Nullable WebhookImage image,
                        @Nullable WebhookAuthor author,
                        @Nullable WebhookFooter footer,
                        @Nullable WebhookThumbnail thumbnail,
                        @Nullable List<WebhookField> fields) {
        this.url = url;
        this.title = title;
        this.color = color;
        this.image = image;
        this.author = author;
        this.footer = footer;
        this.fields = fields;
        this.thumbnail = thumbnail;
        this.timestamp = timestamp;
        this.description = description;
    }

    /**
     * Gets the url of the embed.
     *
     * @return The url of the embed.
     */
    public @Nullable String getUrl() {
        return this.url;
    }

    /**
     * Gets the title of the embed.
     *
     * @return The title of the embed.
     */
    public @Nullable String getTitle() {
        return this.title;
    }

    /**
     * Gets the description of the embed.
     *
     * @return The description of the embed.
     */
    public @Nullable Calendar getTimestamp() {
        return this.timestamp;
    }

    /**
     * Gets the description of the embed.
     *
     * @return The description of the embed.
     */
    public @Nullable String getDescription() {
        return this.description;
    }

    /**
     * Gets the color of the embed.
     *
     * @return The color of the embed.
     */
    public @Nullable Color getColor() {
        return this.color;
    }

    /**
     * Gets the image of the embed.
     *
     * @return The image of the embed.
     */
    public @Nullable WebhookImage getImage() {
        return this.image;
    }

    /**
     * Gets the author of the embed.
     *
     * @return The author of the embed.
     */
    public @Nullable WebhookAuthor getAuthor() {
        return this.author;
    }

    /**
     * Gets the footer of the embed.
     *
     * @return The footer of the embed.
     */
    public @Nullable WebhookFooter getFooter() {
        return this.footer;
    }

    /**
     * Gets the fields of the embed.
     *
     * @return The fields of the embed.
     */
    public @Nullable List<WebhookField> getFields() {
        return this.fields;
    }

    /**
     * Gets the thumbnail of the embed.
     *
     * @return The thumbnail of the embed.
     */
    public @Nullable WebhookThumbnail getThumbnail() {
        return this.thumbnail;
    }

    /**
     * Sets the url of the embed.
     *
     * @param url The url of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setUrl(@Nullable String url) {
        this.url = url;
        return this;
    }

    /**
     * Sets the title of the embed.
     *
     * @param title The title of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setTitle(@Nullable String title) {
        this.title = title;
        return this;
    }

    /**
     * Sets the description of the embed.
     *
     * @param description The description of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setDescription(@Nullable String... description) {
        this.description = String.join("\n", description);
        return this;
    }

    /**
     * Sets the description of the embed.
     *
     * @param description The description of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setDescription(@NotNull List<String> description) {
        this.description = String.join("\n", description);
        return this;
    }

    /**
     * Sets the color of the embed.
     *
     * @param color The color of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setColor(@Nullable Color color) {
        this.color = color;
        return this;
    }

    /**
     * Sets the timestamp of the embed.
     *
     * @param timestamp The timestamp of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setTimestamp(@Nullable Calendar timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Sets the timestamp of the embed.
     *
     * @param image The timestamp of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setImage(@Nullable WebhookImage image) {
        this.image = image;
        return this;
    }

    /**
     * Sets the author of the embed.
     *
     * @param author The author of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setAuthor(@Nullable WebhookAuthor author) {
        this.author = author;
        return this;
    }

    /**
     * Sets the footer of the embed.
     *
     * @param footer The footer of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setFooter(@Nullable WebhookFooter footer) {
        this.footer = footer;
        return this;
    }

    /**
     * Sets the thumbnail of the embed.
     *
     * @param thumbnail The thumbnail of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setThumbnail(@Nullable WebhookThumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Sets the fields of the embed.
     *
     * @param fields The fields of the embed.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed setFields(@Nullable List<WebhookField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Adds a field to the embed.
     *
     * @param field The field to add.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed addField(@Nullable WebhookField field) {
        this.fields.add(field);
        return this;
    }

    /**
     * Removes a field from the embed.
     *
     * @param field The field to remove.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed removeField(@Nullable WebhookField field) {
        this.fields.remove(field);
        return this;
    }

    /**
     * Removes a field from the embed.
     *
     * @param index The index of the field to remove.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed removeField(int index) {
        this.fields.remove(index);
        return this;
    }

    /**
     * Clears the fields of the embed.
     *
     * @return The current instance in order to chain call methods.
     */
    public @NotNull WebhookEmbed clearFields() {
        this.fields.clear();
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
        if (this.title != null)
            json.put("title", this.title);
        if (this.description != null)
            json.put("description", this.description);
        if (this.color != null)
            json.put("color", colorToInt(this.color));
        if (this.timestamp != null)
            json.put("timestamp", dateToText(this.timestamp));
        if (this.image != null)
            json.put("image", this.image.toJson());
        if (this.author != null)
            json.put("author", this.author.toJson());
        if (this.footer != null)
            json.put("footer", this.footer.toJson());
        if (this.thumbnail != null)
            json.put("thumbnail", this.thumbnail.toJson());
        if (this.fields != null)
            this.fields.forEach(field -> json.append("fields", field.toJson()));

        return json;
    }



    /**
     * {@inheritDoc}
     */
    public static class Builder implements com.hakan.jdw.Builder<WebhookEmbed> {

        private String url;
        private String title;
        private String description;
        private Color color;
        private Calendar timestamp;
        private WebhookImage image;
        private WebhookAuthor author;
        private WebhookFooter footer;
        private WebhookThumbnail thumbnail;
        private List<WebhookField> fields = new ArrayList<>();

        /**
         * Sets the url of the embed.
         *
         * @param url The url of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder url(@NotNull String url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the title of the embed.
         *
         * @param title The title of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder title(@NotNull String title) {
            this.title = title;
            return this;
        }

        /**
         * Sets the description of the embed.
         *
         * @param description The description of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder description(@NotNull String... description) {
            this.description = String.join("\n", description);
            return this;
        }

        /**
         * Sets the description of the embed.
         *
         * @param description The description of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder description(@NotNull List<String> description) {
            this.description = String.join("\n", description);
            return this;
        }

        /**
         * Sets the color of the embed.
         *
         * @param color The color of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder color(@NotNull Color color) {
            this.color = color;
            return this;
        }

        /**
         * Sets the timestamp of the embed.
         *
         * @param timestamp The timestamp of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder timestamp(@NotNull Calendar timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Sets the timestamp of the embed.
         *
         * @param timestamp The timestamp of the embed.
         * @param timezone  The timezone of the timestamp.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder timestamp(@NotNull Date timestamp,
                                          @NotNull TimeZone timezone) {
            this.timestamp = Calendar.getInstance();
            this.timestamp.setTimeZone(timezone);
            this.timestamp.setTime(timestamp);
            return this;
        }

        /**
         * Sets the timestamp of the embed.
         *
         * @param timestamp The timestamp of the embed.
         * @param timezone  The timezone of the timestamp.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder timestamp(long timestamp,
                                          @NotNull TimeZone timezone) {
            return this.timestamp(new Date(timestamp), timezone);
        }

        /**
         * Sets the timestamp of the embed.
         *
         * @param timestamp The timestamp of the embed.
         * @param timezone  The timezone of the timestamp.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder timestamp(@NotNull Date timestamp,
                                          @NotNull String timezone) {
            return this.timestamp(timestamp, TimeZone.getTimeZone(timezone));
        }

        /**
         * Sets the timestamp of the embed.
         *
         * @param timestamp The timestamp of the embed.
         * @param timezone  The timezone of the timestamp.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder timestamp(long timestamp,
                                          @NotNull String timezone) {
            return this.timestamp(timestamp, TimeZone.getTimeZone(timezone));
        }

        /**
         * Sets the image of the embed.
         *
         * @param image The image of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder image(@NotNull WebhookImage image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the author of the embed.
         *
         * @param author The author of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder author(@NotNull WebhookAuthor author) {
            this.author = author;
            return this;
        }

        /**
         * Sets the footer of the embed.
         *
         * @param footer The footer of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder footer(@NotNull WebhookFooter footer) {
            this.footer = footer;
            return this;
        }

        /**
         * Sets the thumbnail of the embed.
         *
         * @param thumbnail The thumbnail of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder thumbnail(@NotNull WebhookThumbnail thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        /**
         * Sets the fields of the embed.
         *
         * @param fields The fields of the embed.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder fields(@NotNull List<WebhookField> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Adds a field to the embed.
         *
         * @param field The field to add.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder field(@NotNull WebhookField field) {
            this.fields.add(field);
            return this;
        }

        /**
         * Creates a new image builder and
         * applies the builder function.
         *
         * @param builderFunction The builder function.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder image(@NotNull UnaryOperator<WebhookImage.Builder> builderFunction) {
            return this.image(builderFunction.apply(new WebhookImage.Builder()).build());
        }

        /**
         * Creates a new author builder and
         * applies the builder function.
         *
         * @param builderFunction The builder function.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder author(@NotNull UnaryOperator<WebhookAuthor.Builder> builderFunction) {
            return this.author(builderFunction.apply(new WebhookAuthor.Builder()).build());
        }

        /**
         * Creates a new footer builder and
         * applies the builder function.
         *
         * @param builderFunction The builder function.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder footer(@NotNull UnaryOperator<WebhookFooter.Builder> builderFunction) {
            return this.footer(builderFunction.apply(new WebhookFooter.Builder()).build());
        }

        /**
         * Creates a new thumbnail builder and
         * applies the builder function.
         *
         * @param builderFunction The builder function.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder thumbnail(@NotNull UnaryOperator<WebhookThumbnail.Builder> builderFunction) {
            return this.thumbnail(builderFunction.apply(new WebhookThumbnail.Builder()).build());
        }

        /**
         * Creates a new field builder and
         * applies the builder function.
         *
         * @param builderFunction The builder function.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder field(@NotNull UnaryOperator<WebhookField.Builder> builderFunction) {
            return this.field(builderFunction.apply(new WebhookField.Builder()).build());
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull WebhookEmbed build() {
            return new WebhookEmbed(
                    this.url,
                    this.title,
                    this.description,
                    this.color,
                    this.timestamp,
                    this.image,
                    this.author,
                    this.footer,
                    this.thumbnail,
                    this.fields
            );
        }
    }
}
