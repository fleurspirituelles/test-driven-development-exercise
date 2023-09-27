package br.edu.ifsp.scl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmptyOrNullInputTest {
    @Test
    void testEmptyOrNullInput() {
        int[] A = null;
        int[] B = {};
        String result = VectorSummation.sumVectors(A, B);
        assertEquals("Error", result);
    }
}