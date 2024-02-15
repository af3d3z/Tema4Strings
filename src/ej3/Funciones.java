package ej3;

public class Funciones {
    public static int getWhiteSpaces(String str) {
        // will save here the number of whitespaces that the string contains
        int nWhiteSpaces = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                nWhiteSpaces++;
            }
        }

        return nWhiteSpaces;
    }
}
