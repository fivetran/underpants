package com.fivetran.collections;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mutable {
    //<editor-fold desc="Map">
    public static <K, V> Map<K, V> Map() {
        Map<K, V> acc = Maps.newLinkedHashMap();


        return acc;
    }

    public static <K, V> Map<K, V> Map(K k0, V v0) {
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);

        return acc;
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1) {
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);
        acc.put(k1, v1);

        return acc;
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1, K k2, V v2) {
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);

        return acc;
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1, K k2, V v2, K k3, V v3) {
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);

        return acc;
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);

        return acc;
    }

    public static <K, V> Map<K, V> Map(K k0, V v0, K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);

        return acc;
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
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);
        acc.put(k6, v6);

        return acc;
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
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);
        acc.put(k6, v6);
        acc.put(k7, v7);

        return acc;
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
        Map<K, V> acc = Maps.newLinkedHashMap();

        acc.put(k0, v0);
        acc.put(k1, v1);
        acc.put(k2, v2);
        acc.put(k3, v3);
        acc.put(k4, v4);
        acc.put(k5, v5);
        acc.put(k6, v6);
        acc.put(k7, v7);
        acc.put(k8, v8);

        return acc;
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
        Map<K, V> acc = Maps.newLinkedHashMap();

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

        return acc;
    }
    //</editor-fold>

    @SafeVarargs
    public static <E> List<E> List(E... elements) {
        return Lists.newArrayList(elements);
    }

    @SafeVarargs
    public static <E> Set<E> Set(E... elements) {
        return Sets.newHashSet(elements);
    }
}
