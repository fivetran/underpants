package com.fivetran.collections;

import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Seq {
    public static <T> Stream<T> tabulate(int n, IntFunction<T> f) {
        return IntStream.range(0, n).mapToObj(f);
    }

    public static <T> Stream<T> repeat(int n, T value) {
        return tabulate(n, i -> value);
    }
}
