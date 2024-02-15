package ej5;

public class Ejercicio5 {
    public static String reverse(String str) {
        String reversedString = "";

        // recorremos el string desde el final y vamos concatenando sus carácteres a reversedString
        for(int i = str.length()-1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        return reversedString;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hola muy buenas"));
    }
}
