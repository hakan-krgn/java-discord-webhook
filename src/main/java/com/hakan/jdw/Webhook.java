package com.hakan.jdw;

import com.hakan.jdw.utils.WebhookUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Represents a discord webhook.
 * You can send a webhook to a specific
 * channel with this class.
 */
public class Webhook implements BaseObject {

    private String content;
    private String username;
    private String avatarUrl;
    private String threadName;
    private List<WebhookEmbed> embeds;

    /**
     * Creates a new webhook.
     *
     * @param content    The content of the webhook.
     * @param username   The username of the webhook.
     * @param avatarUrl  The avatar url of the webhook.
     * @param threadName The thread of the webhook.
     * @param embeds     The embeds of the webhook.
     */
    public Webhook(@Nullable String content,
                   @Nullable String username,
                   @Nullable String avatarUrl,
                   @Nullable String threadName,
                   @Nullable List<WebhookEmbed> embeds) {
        this.embeds = embeds;
        this.content = content;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.threadName = threadName;
    }

    /**
     * Gets the content of the webhook.
     *
     * @return The content of the webhook.
     */
    public @Nullable String getContent() {
        return this.content;
    }

    /**
     * Gets the username of the webhook.
     *
     * @return The username of the webhook.
     */
    public @Nullable String getUsername() {
        return this.username;
    }

    /**
     * Gets the avatar url of the webhook.
     *
     * @return The avatar url of the webhook.
     */
    public @Nullable String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * Gets the thread of the webhook.
     *
     * @return The thread of the webhook.
     */
    public @Nullable String getThreadName() {
        return this.threadName;
    }

    /**
     * Gets the embeds of the webhook.
     *
     * @return The embeds of the webhook.
     */
    public @Nullable List<WebhookEmbed> getEmbeds() {
        return this.embeds;
    }

    /**
     * Sets the content of the webhook.
     *
     * @param content The content of the webhook.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook setContent(@Nullable String... content) {
        this.content = String.join("\n", content);
        return this;
    }

    /**
     * Sets the content of the webhook.
     *
     * @param content The content of the webhook.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook setContent(@NotNull List<String> content) {
        this.content = String.join("\n", content);
        return this;
    }

    /**
     * Sets the username of the webhook.
     *
     * @param username The username of the webhook.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook setUsername(@Nullable String username) {
        this.username = username;
        return this;
    }

    /**
     * Sets the avatar url of the webhook.
     *
     * @param avatarUrl The avatar url of the webhook.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook setAvatarUrl(@Nullable String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Sets the thread of the webhook.
     *
     * @param threadName The thread of the webhook.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook setThreadName(@Nullable String threadName) {
        this.threadName = threadName;
        return this;
    }

    /**
     * Sets the embeds of the webhook.
     *
     * @param embeds The embeds of the webhook.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook setEmbeds(@Nullable List<WebhookEmbed> embeds) {
        this.embeds = embeds;
        return this;
    }

    /**
     * Adds an embed to the webhook.
     *
     * @param embed The embed to add.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook addEmbed(@Nullable WebhookEmbed embed) {
        this.embeds.add(embed);
        return this;
    }

    /**
     * Removes an embed from the webhook.
     *
     * @param embed The embed to remove.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook removeEmbed(@Nullable WebhookEmbed embed) {
        this.embeds.remove(embed);
        return this;
    }

    /**
     * Removes an embed from the webhook.
     *
     * @param index The index of the embed to remove.
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook removeEmbed(int index) {
        this.embeds.remove(index);
        return this;
    }

    /**
     * Clears the embeds of the webhook.
     *
     * @return The current instance in order to chain call methods.
     */
    public @NotNull Webhook clearEmbeds() {
        this.embeds.clear();
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull JSONObject toJson() {
        JSONObject json = new JSONObject();

        if (this.content != null)
            json.put("content", this.content);
        if (this.username != null)
            json.put("username", this.username);
        if (this.avatarUrl != null)
            json.put("avatar_url", this.avatarUrl);
        if (this.threadName != null)
            json.put("thread_name", this.threadName);
        if (this.embeds != null)
            this.embeds.forEach(embed -> json.append("embeds", embed.toJson()));

        return json;
    }

    /**
     * Executes the webhook.
     * This method will send the webhook to the
     * channel that you set.
     *
     * @param url The url of the webhook.
     */
    public void execute(@NotNull String url) {
        WebhookUtils.execute(url, this);
    }



    /**
     * {@inheritDoc}
     */
    public static class Builder implements com.hakan.jdw.Builder<Webhook> {

        private String content;
        private String username;
        private String avatarUrl;
        private String threadName;
        private List<WebhookEmbed> embeds = new ArrayList<>();

        /**
         * Sets the content of the webhook.
         *
         * @param content The content of the webhook.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder content(@NotNull String... content) {
            this.content = String.join("\n", content);
            return this;
        }

        /**
         * Sets the content of the webhook.
         *
         * @param content The content of the webhook.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder content(@NotNull List<String> content) {
            this.content = String.join("\n", content);
            return this;
        }

        /**
         * Sets the username of the webhook.
         *
         * @param username The username of the webhook.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder username(@NotNull String username) {
            this.username = username;
            return this;
        }

        /**
         * Sets the avatar url of the webhook.
         *
         * @param avatarUrl The avatar url of the webhook.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder avatarUrl(@NotNull String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * Sets the thread of the webhook.
         *
         * @param threadName The thread of the webhook.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder threadName(@NotNull String threadName) {
            this.threadName = threadName;
            return this;
        }

        /**
         * Sets the embeds of the webhook.
         *
         * @param embeds The embeds of the webhook.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder embeds(@NotNull List<WebhookEmbed> embeds) {
            this.embeds = embeds;
            return this;
        }

        /**
         * Adds an embed to the webhook.
         *
         * @param embed The embed to add.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder embed(@NotNull WebhookEmbed embed) {
            this.embeds.add(embed);
            return this;
        }

        /**
         * Creates a new embed builder and
         * applies the builder function.
         *
         * @param builderFunction The builder function.
         * @return The current instance in order to chain call methods.
         */
        public @NotNull Builder embed(@NotNull UnaryOperator<WebhookEmbed.Builder> builderFunction) {
            return this.embed(builderFunction.apply(new WebhookEmbed.Builder()).build());
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull Webhook build() {
            return new Webhook(
                    this.content,
                    this.username,
                    this.avatarUrl,
                    this.threadName,
                    this.embeds
            );
        }
    }
}
