package com.fivetran.collections;

public class Ref<T> {
    public volatile T val;

    public Ref(T value) {
        this.val = value;
    }

    public static <T> Ref<T> of(T val) {
        return new Ref<>(val);
    }
}
