package ej15;

public class Ejercicio16 {
    public static int coincidencias (String palabra1, String palabra2) {
        int contador = 0;
        String temp;

        if(palabra1.length() <= palabra2.length()){
            temp = palabra1;
            palabra1 = palabra2;
            palabra2 = temp;
        }

        for(int i = 0; i < palabra2.length(); i++) {
            if(palabra1.charAt(i) == palabra2.charAt(i)) {
                contador++;
            }
        }

        return contador;
    }
}
