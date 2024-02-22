package ej14;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        char[] frase;
        char letra;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        frase = sc.nextLine().toLowerCase().toCharArray();
        // ordenamos el array de carácteres
        Arrays.sort(frase);

        letra = frase[0];
        for(int i = 0; i < frase.length; i++) {
            if(letra != frase[i]) {
                System.out.println(letra + " " + contador);
                letra = frase[i];
                contador = 0;
            }
            contador++;
        }

        sc.close();
    }
}
