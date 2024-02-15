package prueba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorNumeros = 0;
        int total = 0;
        int temp = 0;

        do{
            total += temp;
            contadorNumeros++;
            temp = sc.nextInt();
        }while(temp != 0);

        System.out.println((int) total/contadorNumeros);
    }
}
