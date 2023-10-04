package com.hakan.jdw;

import org.jetbrains.annotations.NotNull;

/**
 * Builder interface for all builders
 * of webhook objects.
 *
 * @param <R> The type of object to build.
 */
public interface Builder<R> {

    /**
     * Builds the object.
     *
     * @return The built object.
     */
    @NotNull
    R build();
}
