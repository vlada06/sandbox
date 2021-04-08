package com.vld.immutable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * date: 08/04/2021
 * time: 09:32
 */

public class ImmutabilityTest {

    @Test
    @DisplayName("Baeldung example")
    void testListImmutability() {
        final List<String> names = new ArrayList<>();
        assertEquals(0, names.size());
        names.add("vlada");
        assertEquals(1, names.size());
    }
}
