package ej17;

public class Ejercicio17 {
    public static String eliminarComentarios(String sentencia) {
        String resultado = "";
        boolean dentroComentario = false;

        for (int i = 0; i < sentencia.length(); i++) {
            char actual = sentencia.charAt(i);

            if (dentroComentario) {
                if (actual == '*' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '/') {
                    dentroComentario = false;
                    i++; // Salta el siguiente carácter '/'
                }
            } else {
                if (actual == '/' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '*') {
                    dentroComentario = true;
                    i++; // Salta el siguiente carácter '*'
                } else {
                    resultado += actual;
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        String sentencia = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
        System.out.println(eliminarComentarios(sentencia));
    }
}
