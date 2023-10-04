package com.hakan.jdw.utils;

import com.hakan.jdw.Webhook;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonUtilsTest {

    @Test
    public void webhook_to_json_1() {
        Webhook webhook = new Webhook.Builder()
                .embed((builder) -> builder
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!"))
                ).build();

        String jsonText = webhook.toJsonString();
        JSONObject json = new JSONObject(jsonText);

        assertEquals(
                JsonUtils.beautify(jsonText),
                JsonUtils.beautify(json.toString())
        );
    }

    @Test
    public void webhook_to_json_2() {
        Webhook webhook = new Webhook.Builder()
                .embed((builder) -> builder
                        .color(new Color(87, 0, 97))
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!")
                                .iconUrl("https://www.spigotmc.org/data/avatars/l/661/661932.jpg?1586779817"))
                        .thumbnail((thumbnailBuilder) -> thumbnailBuilder
                                .url("https://www.spigotmc.org/data/avatars/l/661/661932.jpg?1586779817"))
                        .field((fieldBuilder) -> fieldBuilder
                                .name("Hello World!"))
                ).build();

        String jsonText = webhook.toJsonString();
        JSONObject json = new JSONObject(jsonText);

        assertEquals(
                JsonUtils.beautify(jsonText),
                JsonUtils.beautify(json.toString())
        );
    }

    @Test
    public void webhook_to_json_3() {
        Webhook webhook = new Webhook.Builder()
                .embed((builder) -> builder
                        .color(new Color(87, 0, 97))
                        .author((authorBuilder) -> authorBuilder
                                .name("Hakan")
                                .url("https://www.spigotmc.org/members/hakankargin.661932/"))
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!")
                                .iconUrl("https://www.spigotmc.org/data/avatars/l/661/661932.jpg?1586779817"))
                        .thumbnail((thumbnailBuilder) -> thumbnailBuilder
                                .url("https://www.spigotmc.org/data/avatars/l/661/661932.jpg?1586779817"))
                        .field((fieldBuilder) -> fieldBuilder
                                .name("Hello World!")
                                .value("Hello World!")
                                .inline(true))
                ).build();

        String jsonText = webhook.toJsonString();
        JSONObject json = new JSONObject(jsonText);

        assertEquals(
                JsonUtils.beautify(jsonText),
                JsonUtils.beautify(json.toString())
        );
    }

    @Test
    public void webhook_to_json_4() {
        Webhook webhook = new Webhook.Builder()
                .username("Hakan")
                .content("Hello World!")
                .avatarUrl("https://www.spigotmc.org/data/avatars/l/661/661932.jpg?1586779817")
                .embed((builder) -> builder
                        .title("Hello World!")
                        .description("Hello World!")
                        .color(new Color(87, 0, 97))
                        .url("https://www.spigotmc.org/members/hakankargin.661932/")
                        .timestamp(System.currentTimeMillis(), "UTC+3")
                        .author((authorBuilder) -> authorBuilder
                                .name("Hakan")
                                .url("https://www.spigotmc.org/members/hakankargin.661932/"))
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!")
                                .iconUrl("https://www.spigotmc.org/data/avatars/l/661/661932.jpg?1586779817"))
                        .thumbnail((thumbnailBuilder) -> thumbnailBuilder
                                .url("https://www.spigotmc.org/data/avatars/l/661/661932.jpg?1586779817"))
                        .image((imageBuilder) -> imageBuilder
                                .url("https://www.spigotmc.org/data/avatars/l/661/661932.jpg?1586779817"))
                        .field((fieldBuilder) -> fieldBuilder
                                .name("Hello World!")
                                .value("Hello World!")
                                .inline(true))
                        .field((fieldBuilder) -> fieldBuilder
                                .name("Hello World!")
                                .value("Hello World!")
                                .inline(true))
                        .field((fieldBuilder) -> fieldBuilder
                                .name("Hello World!")
                                .value("Hello World!")
                                .inline(true))
                ).build();

        String jsonText = webhook.toJsonString();
        JSONObject json = new JSONObject(jsonText);

        assertEquals(
                JsonUtils.beautify(jsonText),
                JsonUtils.beautify(json.toString())
        );
    }
}
