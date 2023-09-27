package br.edu.ifsp.scl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferentSizedVectorsTest {
    @Test
    void testDifferentSizedVectors() {
        int[] A = {2, 5, 8, 34};
        int[] B = {8, 51, 2, 16, 5};
        String result = VectorSummation.sumVectors(A, B);
        assertEquals("Error", result);
    }
}
