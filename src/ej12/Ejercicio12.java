package ej12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String[] frase;
        Scanner sc = new Scanner(System.in);
        String palabraMasLarga;

        System.out.println("Introduce una frase:");
        frase = sc.nextLine().split(" ");
        palabraMasLarga = frase[0];

        for(String palabra : frase) {
            if(palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        System.out.println("La palabra más larga de la frase es: " + palabraMasLarga);
        sc.close();
    }
}
