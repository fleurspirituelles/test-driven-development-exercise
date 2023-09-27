package br.edu.ifsp.scl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorSummationTest {
    @Test
    void testVectorElementSum() {
        int[] A = {2, 5, 8, 34, 5};
        int[] B = {8, 51, 2, 16, 5};
        String result = VectorSummation.sumVectors(A, B);
        assertEquals("10, 56, 10, 50, 10", result);
    }
}


