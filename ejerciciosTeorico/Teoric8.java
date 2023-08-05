package ejerciciosTeorico;

import java.util.Scanner;

/**
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
 * pedirá de nuevo hasta que la nota sea correcta.
 */
public class Teoric8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nota entre 0 y 10");
        int num = scanner.nextInt();

        while (num < 0 || num > 10) {
            System.out.println("INCORRECTO. Ingrese una nota entre 0 y 10");
            num = scanner.nextInt();
        }
        System.out.println("Nota correcta");
    }
}
