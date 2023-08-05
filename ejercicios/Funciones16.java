package ejercicios;

import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
 * usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 */
public class Funciones16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamanio = scanner.nextInt();
        int[] vector = new int[tamanio];

        rellenar(vector, tamanio);

        System.out.println("Ingrese el número que desea buscar en el vector");
        int numero = scanner.nextInt();
        buscarNum(vector, tamanio, numero);
    }

    public static void rellenar(int[] vector, int tamanio) {
        for (int f=0; f<tamanio; f++) {
            vector[f] = (int) (Math.random() * 100);
        }

        for (int f=0; f<tamanio; f++) {
            System.out.print("[" + vector[f] + "]");
        }
        System.out.println();
    }

    public static void buscarNum(int[] vector, int tamanio, int numero) {
        for (int f=0; f<tamanio; f++) {
            if (vector[f] == numero) {
                System.out.println("El número " + numero + " se encuentra en la posición: " + f);
            }
        }
    }
}
