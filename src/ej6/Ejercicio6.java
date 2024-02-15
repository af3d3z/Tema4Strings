package ej6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // guardará la frase introducida por teclado
        String frase = "";
        Scanner sc = new Scanner(System.in);
        // guardará cada palabra temporalmente
        String palabra = "";

        while(!palabra.equals("fin")){
            if(!palabra.equals("")){
                frase += palabra + " ";
            }
            System.out.println("Introduce una palabra:");
            palabra = sc.next();
        }

        System.out.println(frase);
    }
}
