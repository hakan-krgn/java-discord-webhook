package com.hakan.jdw.utils;

import com.hakan.jdw.Webhook;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;

import javax.net.ssl.HttpsURLConnection;
import java.awt.Color;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Utility class for sending webhooks,
 * converting colors and dates.
 */
public final class WebhookUtils {

    /**
     * Private constructor to prevent
     * instantiation of this class.
     */
    private WebhookUtils() {

    }

    /**
     * Converts a {@link Calendar} to a {@link String}.
     *
     * @param calendar the calendar to convert
     * @return the converted string
     */
    public static @NotNull String dateToText(@NotNull Calendar calendar) {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        formatter.setTimeZone(TimeZone.getTimeZone(calendar.getTimeZone().getID()));
        return formatter.format(calendar.getTime());
    }

    /**
     * Converts a {@link Color} to an {@link Integer}.
     *
     * @param color the color to convert
     * @return the converted integer
     */
    public static int colorToInt(@NotNull Color color) {
        int rgb = color.getRed();
        rgb = (rgb << 8) + color.getGreen();
        rgb = (rgb << 8) + color.getBlue();
        return rgb;
    }

    /**
     * Executes a webhook.
     *
     * @param link    the webhook link
     * @param webhook the webhook to execute
     */
    @SneakyThrows
    public static void execute(@NotNull String link,
                               @NotNull Webhook webhook) {
        execute(link, webhook.toJsonString());
    }

    /**
     * Executes a webhook.
     *
     * @param link the webhook link
     * @param json the json to execute
     */
    @SneakyThrows
    public static void execute(@NotNull String link,
                               @NotNull String json) {
        HttpsURLConnection connection = (HttpsURLConnection)
                new URL(link).openConnection();

        connection.addRequestProperty("Content-Type", "application/json");
        connection.addRequestProperty("User-Agent", "Java-DiscordWebhook");
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(json.getBytes(StandardCharsets.UTF_8));
        outputStream.flush();

        connection.getInputStream().close();
        connection.disconnect();
    }
}
