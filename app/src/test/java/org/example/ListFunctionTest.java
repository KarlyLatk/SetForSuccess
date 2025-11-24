package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.ListFunction.removeDuplicates;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFunctionTest {
    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        assertEquals(removeDuplicates(new ArrayList<>()), new ArrayList<>());
    }
    @Test
    public void testRemoveDuplicatesWithStrings() {
        assertEquals(removeDuplicates(new ArrayList<>(List.of("A", "A", "B", "A"))), new ArrayList<>(List.of("A", "B")));
    }
    @Test
    public void testRemoveDuplicatesWithDouble() {
        assertEquals(removeDuplicates(new ArrayList<>(List.of(1.4, 1.4, 2.8))), new ArrayList<>(List.of(1.4, 2.8)));
    }
}
