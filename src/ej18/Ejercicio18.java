package ej18;

import java.util.Scanner;

public class Ejercicio18 {
    public static String generarDocumentoHTML(String titulo, String contenido) {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>" + titulo + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>" + titulo + "</h1>\n" +
                "<p>" + contenido + "</p>\n" +
                "</body>\n" +
                "</html>";

        return html;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo;
        String contenido;

        System.out.println("Introduce el título de la página web: ");
        titulo = sc.nextLine();
        System.out.println("Escribe el contenido de la página:");
        contenido = sc.nextLine();

        System.out.println(generarDocumentoHTML(titulo, contenido));
    }
}
