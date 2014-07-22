package collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Shorthand for constructing core data structures, for example:
 * <p>
 * <code>Map(List(1,2), Set(3,4))</code>
 */
public class Immutable {

    //<editor-fold desc="Map">
    public static <K, V> Map<K, V> Map() {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();


        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0, V v0) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1, K k2, V v2) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1, K k2, V v2, K k3, V v3) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0,
                                       V v0,
                                       K k1,
                                       V v1,
                                       K k2,
                                       V v2,
                                       K k3,
                                       V v3,
                                       K k4,
                                       V v4,
                                       K k5,
                                       V v5,
                                       K k6,
                                       V v6) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);
        acc.put(k6, v6);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0,
                                       V v0,
                                       K k1,
                                       V v1,
                                       K k2,
                                       V v2,
                                       K k3,
                                       V v3,
                                       K k4,
                                       V v4,
                                       K k5,
                                       V v5,
                                       K k6,
                                       V v6,
                                       K k7,
                                       V v7) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);
        acc.put(k6, v6);
        acc.put(k7, v7);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0,
                                       V v0,
                                       K k1,
                                       V v1,
                                       K k2,
                                       V v2,
                                       K k3,
                                       V v3,
                                       K k4,
                                       V v4,
                                       K k5,
                                       V v5,
                                       K k6,
                                       V v6,
                                       K k7,
                                       V v7,
                                       K k8,
                                       V v8) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);
        acc.put(k6, v6);
        acc.put(k7, v7);
        acc.put(k8, v8);

        return acc.build();
    }

    public static <K, V> Map<K, V> Map(K k0,
                                       V v0,
                                       K k1,
                                       V v1,
                                       K k2,
                                       V v2,
                                       K k3,
                                       V v3,
                                       K k4,
                                       V v4,
                                       K k5,
                                       V v5,
                                       K k6,
                                       V v6,
                                       K k7,
                                       V v7,
                                       K k8,
                                       V v8,
                                       K k9,
                                       V v9) {
        ImmutableMap.Builder<K, V> acc = ImmutableMap.builder();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);
        acc.put(k6, v6);
        acc.put(k7, v7);
        acc.put(k8, v8);
        acc.put(k9, v9);

        return acc.build();
    }
    //</editor-fold>

    @SafeVarargs
    public static <E> List<E> List(E... elements) {
        return ImmutableList.copyOf(elements);
    }

    @SafeVarargs
    public static <E> Set<E> Set(E... elements) {
        return ImmutableSet.copyOf(elements);
    }

    public static <T> Lazy<T> Lazy(Lazy.UnsafeSupplier<T> delegate) {
        return new Lazy<>(delegate);
    }
}
