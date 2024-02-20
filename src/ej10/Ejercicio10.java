package ej10;

import java.util.Scanner;

public class Ejercicio10 {
    static final char[] CONJUNTO1 = new char[] {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
    static final char[] CONJUNTO2 = new char[] {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

    static char codifica(char[] conjunto1, char[] conjunto2, char c){
        char caracter = c;
        boolean encontrado = false;

        for(int i = 0; i < conjunto1.length && !encontrado; i++) {
            if(caracter == conjunto1[i]){
                caracter = conjunto2[i];
                encontrado = true;
            }
        }

        return caracter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        String fraseCodificada = "";

        System.out.println("CODIFICADOR:");
        System.out.println("Introduce la frase a codificar:");
        frase = sc.nextLine().toLowerCase();

        for(char caracter : frase.toCharArray()){
            fraseCodificada += codifica(CONJUNTO1, CONJUNTO2, caracter);
        }

        System.out.println("Frase codificada: " + fraseCodificada);
        sc.close();
    }
}
