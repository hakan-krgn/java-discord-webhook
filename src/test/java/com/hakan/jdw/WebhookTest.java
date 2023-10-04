package com.hakan.jdw;

import org.junit.jupiter.api.Test;

import java.awt.Color;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WebhookTest {

    @Test
    public void webhook_to_json_1() {
        String webhookUrl = System.getProperty("webhook.url");

        Webhook webhook = new Webhook.Builder()
                .embed((builder) -> builder
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!")))
                .build();

        assertDoesNotThrow(() -> webhook.execute(webhookUrl));
    }

    @Test
    public void webhook_to_json_2() {
        String webhookUrl = System.getProperty("webhook.url");

        Webhook webhook = new Webhook.Builder()
                .embed((builder) -> builder
                        .color(new Color(87, 0, 97))
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!")
                                .iconUrl("https://avatars.githubusercontent.com/u/42969966?v=4"))
                        .thumbnail((thumbnailBuilder) -> thumbnailBuilder
                                .url("https://avatars.githubusercontent.com/u/42969966?v=4"))
                        .field((fieldBuilder) -> fieldBuilder
                                .name("Hello World!")
                                .value("sas"))
                        .field((fieldBuilder) -> fieldBuilder
                                .name("Hello World2!")))
                .build();

        assertDoesNotThrow(() -> webhook.execute(webhookUrl));
    }

    @Test
    public void webhook_to_json_3() {
        String webhookUrl = System.getProperty("webhook.url");

        Webhook webhook = new Webhook.Builder()
                .embed((builder) -> builder
                        .color(new Color(87, 0, 97))
                        .author((authorBuilder) -> authorBuilder
                                .name("Hakan")
                                .url("https://github.com/hakan-krgn"))
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!")
                                .iconUrl("https://avatars.githubusercontent.com/u/42969966?v=4"))
                        .thumbnail((thumbnailBuilder) -> thumbnailBuilder
                                .url("https://avatars.githubusercontent.com/u/42969966?v=4"))
                        .field((fieldBuilder) -> fieldBuilder
                                .name("Hello World!")
                                .value("Hello World!")
                                .inline(true)))
                .build();

        assertDoesNotThrow(() -> webhook.execute(webhookUrl));
    }

    @Test
    public void webhook_to_json_4() {
        String webhookUrl = System.getProperty("webhook.url");

        Webhook webhook = new Webhook.Builder()
                .username("Hakan")
                .content("Hello World!")
                .avatarUrl("https://avatars.githubusercontent.com/u/42969966?v=4")
                .embed((builder) -> builder
                        .title("Hello World!")
                        .description("Hello World!")
                        .color(new Color(87, 0, 97))
                        .url("https://github.com/hakan-krgn")
                        .timestamp(System.currentTimeMillis(), "UTC+3")
                        .author((authorBuilder) -> authorBuilder
                                .name("Hakan")
                                .url("https://github.com/hakan-krgn")
                                .iconUrl("https://avatars.githubusercontent.com/u/42969966?v=4"))
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!")
                                .iconUrl("https://avatars.githubusercontent.com/u/42969966?v=4"))
                        .thumbnail((thumbnailBuilder) -> thumbnailBuilder
                                .url("https://avatars.githubusercontent.com/u/42969966?v=4"))
                        .image((imageBuilder) -> imageBuilder
                                .url("https://avatars.githubusercontent.com/u/42969966?v=4"))
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
                                .inline(true)))
                .build();

        assertDoesNotThrow(() -> webhook.execute(webhookUrl));
    }


    @Test
    public void webhook_to_json_5() {
        String webhookUrl = System.getProperty("webhook.url");

        Webhook webhook = new Webhook.Builder()
                .embed((builder) -> builder)
                .build();

        assertThrows(IOException.class, () -> webhook.execute(webhookUrl));
    }

    @Test
    public void webhook_to_json_6() {
        String webhookUrl = System.getProperty("webhook.url");

        Webhook webhook = new Webhook.Builder()
                .threadName("Hello World!")
                .embed((builder) -> builder
                        .footer((footerBuilder) -> footerBuilder
                                .text("Hello World!")
                                .iconUrl("https://avatars.githubusercontent.com/u/42969966?v=4"))
                        .thumbnail((thumbnailBuilder) -> thumbnailBuilder
                                .url("https://avatars.githubusercontent.com/u/42969966?v=4")))
                .build();

        assertThrows(IOException.class, () -> webhook.execute(webhookUrl));
    }
}
