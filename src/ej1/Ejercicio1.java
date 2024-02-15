package ej1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // guardará la primera frase
        String frase0;
        // guardará la segunda frase
        String frase1;
        Scanner sc  = new Scanner(System.in);

        // entrada de datos
        System.out.println("Introduce la primera frase:");
        frase0 = sc.nextLine();
        System.out.println("Introduce la segunda frase:");
        frase1 = sc.nextLine();

        // comparación
        if(frase0.length() == frase1.length()) {
            System.out.println("Las dos frases miden lo mismo.");
        }else if(frase0.length() > frase1.length()) {
            System.out.println("La primera frase es más larga.");
        } else {
            System.out.println("La segunda frase es la más larga.");
        }
    }
}
