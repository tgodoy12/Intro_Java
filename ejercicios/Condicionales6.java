package ejercicios;

import java.util.Scanner;

/**
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class Condicionales6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");

        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es un número PAR");
        }else{
            System.out.println(num + " es un número IMPAR");
            }
    }
}
