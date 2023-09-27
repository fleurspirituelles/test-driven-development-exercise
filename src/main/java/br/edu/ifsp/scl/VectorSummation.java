package br.edu.ifsp.scl;

public class VectorSummation {

    public static String sumVectors(int[] A, int[] B) {
        if (A == null || B == null || A.length != 5 || B.length != 5) {
            return "Error";
        }

        int[] C = new int[5];
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < C.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(C[i]);
        }

        return sb.toString();
    }
}