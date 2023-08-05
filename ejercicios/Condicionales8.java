package ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
 * usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la función Lenght() en Java.
 */
public class Condicionales8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra de 8 caracteres");

        String frase = scanner.nextLine();

        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
            System.out.println("Usted ingresó una frase de: " + frase.length() + " caracteres.");
        }
    }
}
