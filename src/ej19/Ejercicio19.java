package ej19;

public class Ejercicio19 {
    public static String toCamelCase(String frase) {
        if (frase == null || frase.isEmpty()) {
            return "";
        }

        String[] palabras = frase.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (!palabra.isEmpty()) {
                if (i == 0) {
                    resultado += palabra.toLowerCase();
                } else {
                    resultado += palabra.substring(0, 1).toUpperCase() +
                            (palabra.length() > 1 ? palabra.substring(1).toLowerCase() : "");
                }
            }
        }

        return resultado;
    }


    public static void main(String[] args) {
        String frase = "Me GUsta merenDAR gaLLEtas";
        System.out.println(toCamelCase(frase));
    }
}
