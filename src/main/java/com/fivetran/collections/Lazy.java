package com.fivetran.collections;

import java.util.function.Supplier;

public class Lazy<T> {
    private final UnsafeSupplier<T> delegate;
    volatile T value;

    public Lazy(UnsafeSupplier<T> delegate) {
        this.delegate = delegate;
    }

    public T get() {
        if (value == null) {
            synchronized (this) {
                value = delegate.get();
            }
        }

        return value;
    }

    @FunctionalInterface
    public static interface UnsafeSupplier<T> extends Supplier<T> {
        T getUnsafe() throws Exception;

        default T get() {
            try {
                return getUnsafe();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
