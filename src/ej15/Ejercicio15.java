package ej15;

import java.util.Random;
import java.util.Scanner;

import static ej15.Ejercicio16.coincidencias;

public class Ejercicio15 {
    static String generarPalabraAleatoria (String palabra) {
        Random rand = new Random();
        char[] copiaPalabra = palabra.toCharArray();
        char[] palabraGenerada = new char[palabra.length()];

        for(int i = 0; i < palabra.length(); i++) {
            if(palabraGenerada[i] == 0) {
                int num = rand.nextInt(palabra.length());
                palabraGenerada[i] = copiaPalabra[num];
            }
        }

        return new String(palabraGenerada);
    }

    public static void main(String[] args) {
        String palabra;
        String intento;
        Scanner sc = new Scanner(System.in);

        System.out.println("J1: Introduce una palabra:");
        palabra = sc.next().toLowerCase();
        System.out.println(generarPalabraAleatoria(palabra));

        do{
            System.out.println("J2: Introduce la palabra correspondiente a ese anagrama: ");
            intento = sc.next().toLowerCase().trim();
            if(intento.equals("")) {
                System.out.println("La palabra no puede estar vacía!");
            }
            System.out.printf("Ha habido un número de %d coincidencias\n", coincidencias(palabra, intento));
        }while(!intento.equals(palabra));

        System.out.println("Enhorabuena, gana el jugador 2!");
        sc.close();
    }
}
