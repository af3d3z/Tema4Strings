package ej20;

import java.util.Arrays;

public class Ejercicio20 {
    public static String[] dividir(String palabra, int n) {
        if (palabra == null || palabra.isEmpty() || n <= 0) {
            return new String[0];
        }

        int longitud = palabra.length();
        int cantidadSecuencias = (int) Math.ceil((double) longitud / n);
        String[] secuencias = new String[cantidadSecuencias];

        for (int i = 0; i < cantidadSecuencias; i++) {
            int inicio = i * n;
            int fin = Math.min((i + 1) * n, longitud);
            secuencias[i] = palabra.substring(inicio, fin);
        }

        return secuencias;
    }

    public static void main(String[] args) {
        String palabra = "destornillador";
        System.out.println(Arrays.toString(dividir(palabra, 4)));
    }
}
