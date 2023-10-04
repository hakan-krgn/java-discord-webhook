package com.hakan.jdw;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/**
 * Base interface for all webhook objects
 * that can be converted to JSON.
 */
public interface BaseObject {

    /**
     * Converts the object to a JSON string.
     *
     * @return The JSON string.
     */
    default @NotNull String toJsonString() {
        return this.toJson().toString();
    }

    /**
     * Converts the object to a JSON object.
     *
     * @return The JSON object.
     */
    @NotNull
    JSONObject toJson();
}
