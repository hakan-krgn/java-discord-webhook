package com.hakan.jdw.utils;

import org.jetbrains.annotations.NotNull;

/**
 * Utility class for JSON operations.
 */
public final class JsonUtils {

    /**
     * Private constructor to prevent
     * instantiation of this class.
     */
    private JsonUtils() {

    }

    /**
     * Beautifies the given json string.
     *
     * @param input Input json string.
     * @return Beautified json string.
     * @see <a href="https://stackoverflow.com/questions/5457524/json-beautifier-library-for-java">Json beautifier method</a>
     */
    public static @NotNull String beautify(@NotNull String input) {
        StringBuilder inputBuilder = new StringBuilder();
        char[] inputChar = input.toCharArray();

        int tabCount = 0;
        for (int i = 0; i < inputChar.length; i++) {
            String charI = String.valueOf(inputChar[i]);
            if (charI.equals("}") || charI.equals("]")) {
                tabCount--;
                if (!String.valueOf(inputChar[i - 1]).equals("[") && !String.valueOf(inputChar[i - 1]).equals("{"))
                    inputBuilder.append(newLine(tabCount));
            }
            inputBuilder.append(charI);

            if (charI.equals("{") || charI.equals("[")) {
                tabCount++;
                if (String.valueOf(inputChar[i + 1]).equals("]") || String.valueOf(inputChar[i + 1]).equals("}"))
                    continue;

                inputBuilder.append(newLine(tabCount));
            }

            if (charI.equals(","))
                inputBuilder.append(newLine(tabCount));
        }

        return inputBuilder.toString();
    }

    /**
     * Creates a new line with the given tab count
     * for the beautify method.
     *
     * @param tabCount Tab count.
     * @return New line.
     */
    private static @NotNull String newLine(int tabCount) {
        StringBuilder builder = new StringBuilder();

        builder.append("\n");
        for (int j = 0; j < tabCount; j++)
            builder.append("  ");
        return builder.toString();
    }
}
