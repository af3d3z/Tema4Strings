package ej8;

public class Ejercicio8 {
    public static String reverse(String str) {
        String reversedString = "";

        // recorremos el string desde el final y vamos concatenando sus carácteres a reversedString
        for(int i = str.length()-1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        return reversedString.replaceAll(" ", "");
    }

    public static boolean esPalindroma(String str) {
        return str.equals(reverse(str));
    }

    public static void main(String[] args) {
        System.out.println(esPalindroma("Hao"));
        System.out.println(esPalindroma("aEa"));
        System.out.println(esPalindroma("Dabale arroz a la zorra el abad"));
    }
}
