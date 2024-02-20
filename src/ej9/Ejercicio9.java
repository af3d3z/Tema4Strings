package ej9;

import java.util.Scanner;

public class Ejercicio9 {
    public static final String DIALECTO1 = "Javalín, javalon";
    public static final String DIALECTO2 = "javalén, len, len";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // guardará la frase
        String frase;
        // guardará la frase traducida
        String fraseTraducida = "";

        System.out.println("Introduce una frase:");
        frase = sc.nextLine();

        if(frase.startsWith(DIALECTO1)) {
            System.out.println("Está escrita en el idioma de Javalandia");
            fraseTraducida = frase.replaceAll(DIALECTO1, "").trim();
            System.out.println("Frase traducida: " + fraseTraducida);
        }else if (frase.endsWith(DIALECTO2)) {
            System.out.println("Está escrita en el idioma de Javalandia");
            fraseTraducida = frase.replaceAll(DIALECTO2, "").trim();
            System.out.println("Frase traducida: " + fraseTraducida);
        } else {
            System.out.println("La frase no está escrita en el idioma de Javalandia");
        }
        sc.close();
    }
}
