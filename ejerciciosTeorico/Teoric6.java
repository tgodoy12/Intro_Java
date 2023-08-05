package ejerciciosTeorico;

import java.util.Scanner;

/**
 * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
 * alguno de ellos es mayor a 25.
 */
public class Teoric6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro número entero");
        int num2 = scanner.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números [" + num1 + "," + num2 + "] son mayores que 25");
        } else if (num1 > 25 && !(num2 > 25)) {
            System.out.println("El número: " + num1 + " es mayor que 25");
        } else if (!(num1 > 25) && num2 > 25) {
            System.out.println("El número: " + num2 + " es mayor que 25");
        } else {
            System.out.println("Ambos números son menores que 25");

        }

    }
}

