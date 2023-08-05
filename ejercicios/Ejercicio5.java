package ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");

        int num = scanner.nextInt();

        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);

        System.out.println("DOBLE: " + doble);
        System.out.println("TRIPLE: " + triple);
        System.out.println("RAÍZ CUADRADA: " + raiz);
    }
}
