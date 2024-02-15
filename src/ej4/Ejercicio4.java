package ej4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static String ordenar(String str) {
        String[] frase = str.split("\\s");
        Arrays.sort(frase);
        return String.join(" ", frase);
    }

    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();

        System.out.println(ordenar(frase));
    }
}
