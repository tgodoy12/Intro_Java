package ejerciciosTeorico;

import java.util.Scanner;

/**
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
 * ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 * 5 *****
 * 3 ***
 * 11 ***********
 * 2 **
 */
public class Teoric10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //buscar una mejor forma para condicionar el rango de los numeros ingresados por el usuario
        System.out.println("Ingrese un número");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un número");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese un número");
        int num3 = scanner.nextInt();
        System.out.println("Ingrese un número");
        int num4 = scanner.nextInt();

        System.out.print(num1 + " ");
        for (int i=0; i<num1; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num2 + " ");
        for (int i=0; i<num2; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num3 + " ");
        for (int i=0; i<num3; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num4 + " ");
        for (int i=0; i<num4; i++) {
            System.out.print("*");
        }
/**
 * Mejorar este programa. Se puede hacer si utilizar tantos for, y un while al principio para la lectura de los
 * inputs.
 */








    }
}
