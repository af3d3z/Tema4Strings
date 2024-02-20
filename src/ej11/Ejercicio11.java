package ej11;

import java.util.Scanner;

public class Ejercicio11 {
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
        String fraseDescodificada = "";

        System.out.println("DESCODIFICADOR:");
        System.out.println("Introduce la frase a descodificar:");
        frase = sc.nextLine().toLowerCase();

        for(char caracter : frase.toCharArray()){
            fraseDescodificada += codifica(CONJUNTO2, CONJUNTO1, caracter);
        }

        System.out.println("Frase descodificada: " + fraseDescodificada);
        sc.close();
    }
}
