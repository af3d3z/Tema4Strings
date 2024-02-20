package ej13;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        char[] palabra0;
        char[] palabra1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera palabra:");
        palabra0 = sc.next().toCharArray();
        sc.nextLine();
        System.out.println("Introduce la segunda palabra:");
        palabra1 = sc.next().toCharArray();

        // ordenamos los arrays
        Arrays.sort(palabra0);
        Arrays.sort(palabra1);

        if(Arrays.equals(palabra0, palabra1)){
            System.out.print("Son anagramas");
        }else {
            System.out.print("NO son anagrama");
        }
        sc.close();
    }
}
