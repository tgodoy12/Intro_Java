package ejercicios;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese ºC que desea convertir");

        double centg = scanner.nextDouble();

        double fahr = 32 + (9 * centg / 5);

        System.out.println(fahr + " ºF");
    }

}
