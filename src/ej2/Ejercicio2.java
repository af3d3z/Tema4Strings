package ej2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // guardará la contraseña introducida por el usuario 1.
        String contrasena;
        // guardará los intentos del jugador 2.
        String intento;
        Scanner sc = new Scanner(System.in);
        // reflejará si el jugador 2 ha encontrado la contraseña
        boolean correcto = false;

        System.out.println("ACIERTA LA CONTRASEÑA:");
        System.out.println("Jugador 1 -> Introduzca la contraseña:");
        contrasena = sc.next();

        do{
            System.out.println("Jugador 2 -> Introduzca su intento:");
            intento = sc.next();

            if(intento.equals(contrasena)) {
                correcto = true;
            }else {
                for(int i = 0; i < contrasena.length(); i++) {
                    if(i >= intento.length() || contrasena.charAt(i) != intento.charAt(i)) {
                        System.out.print('*');
                    }else {
                        System.out.print(contrasena.charAt(i));
                    }
                }
                System.out.println();
            }
        }while(!correcto);

        System.out.println("ENHORABUENA JUGADOR 2, LA CONTRASEÑA ERA: " + contrasena);
        sc.close();
    }
}
