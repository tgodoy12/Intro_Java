package ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un número entero");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        System.out.println("El resultado es: " + suma);
    }
}
