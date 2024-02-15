package ej7;

public class Ejercicio7 {
    public static int repeticiones(String frase, String palabra) {
        /*
        // cuenta los carácteres recorridos
        int contador = 0;
        // cuenta cuantas ocurrencias de la palabra existen en la frase
        int contadorPalabras = 0;

        while(contador < frase.length() && (contador + palabra.length()) < frase.length()){
            if(frase.charAt(contador) == palabra.charAt(0) && palabra.equals(frase.substring(contador, contador + palabra.length()))){
                contador += palabra.length();
                contadorPalabras++;
            }else{
                contador++;
            }
        }

        return contadorPalabras;*/
        // guardará el número de ocurrencias
        int nOcurrencias = 0;
        // guardará el array de palabras
        String[] fraseSeparada = frase.split("\\s");
        for(int i = 0; i < fraseSeparada.length; i++) {
            if(fraseSeparada[i].equals(palabra)){
                nOcurrencias++;
            }
        }

        return nOcurrencias;
    }

    public static void main(String[] args) {
        System.out.println(repeticiones("A triplem le gustan las patatilllas y el packet tracer, a triplem le gustan los gatos.", "triplem "));
    }
}
