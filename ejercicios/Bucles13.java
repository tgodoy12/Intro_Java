package ejercicios;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
 * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *     * * * *
 *     *     *
 *     *     *
 *     * * * *
 */
public class Bucles13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de lados");
        int largo = scanner.nextInt();

        for (int f = 0; f < largo; f++) {
            for (int c = 0; c < largo; c++) {
                if (f == 0 || f == largo-1 || c == 0 || c == largo-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
