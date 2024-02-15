package ej9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // guardará la frase
        String frase;
        // guardará la frase traducida
        String fraseTraducida = "";

        System.out.println("Introduce una frase:");
        //frase = sc.nextLine();
        frase = "Javalín, javalon qué buen día hace hoy";

        if(frase.matches("/\\wJavalín, javalon")) {
            System.out.println("Está escrita en el idioma de Javalandia");
            fraseTraducida.replaceAll("/((?i)Javalín, javalon(?-i))\\W*|((?i)javalén, len, len(?-i))/gm", "");
            System.out.println("Frase traducida: " + fraseTraducida);
        }else {
            System.out.println("La frase no está escrita en el idioma de Javalandia");
        }
        sc.close();
    }
}
