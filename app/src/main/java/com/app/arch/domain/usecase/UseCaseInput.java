package com.app.arch.domain.usecase;

import androidx.annotation.NonNull;

public class UseCaseInput<T> {
    public static final UseCaseInput<Void> NONE = null;
    private T input;

    private UseCaseInput(T input) {
      this.input = input;
    }

    public static UseCaseInput<Void> empty() {
        return NONE;
    }

    public static <T> UseCaseInput<T> create(T inputParameter) {
        return new UseCaseInput<T>(inputParameter);
    }

    @NonNull
    public T getInput() {
        return input;
    }
}
