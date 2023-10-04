# Java Discord Webhook API

## What is this library?

A simple Java API for Discord webhooks, this API supports both synchronous
and asynchronous requests. You can do almost everything about discord webhooks
with this api easily.

## Getting Started

You can use this library with maven or gradle. You just need to add the
dependency to your pom.xml or build.gradle file to use it.

### Prerequisites

- Java Development Kit (JDK) 8 or above

### Installation

#### Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.hakan-krgn</groupId>
        <artifactId>java-discord-webhook</artifactId>
        <version>0.0.1</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```

#### Gradle

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.hakan-krgn:java-discord-webhook:0.0.1'
}
```

## Usage

```java
public class ExampleWebhook {

    public static void main(String[] args) {
        String url = "https://discord.com/api/webhooks/.../...";

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
                                .inline(true)))
                .build();

        webhook.execute(url);
    }
}
```

## License

This project is licensed under the MIT License. You can check
out [LICENSE](https://github.com/hakan-krgn/java-discord-webhook/blob/master/LICENSE) file for details.
