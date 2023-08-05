package ejercicios;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class Bucles10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        int limite = scanner.nextInt();
        int suma = 0;

        while (suma <= limite) {
            System.out.println("Ingrese un número");
            int num = scanner.nextInt();
            suma += num;

        }

        System.out.println("La suma total fue de: " + suma);


    }
}
