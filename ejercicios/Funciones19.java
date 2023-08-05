package ejercicios;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
 * matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
 * signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
 * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Funciones19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int n = scanner.nextInt();

        int matrixAntiSimetrica[][] = new int[n][n];
        int matrixAleatoria[][] = new int[n][n];

        //Creo matriz Antisimétrica para verificar que sea TRUE
        rellenarAntiSimetrica(matrixAntiSimetrica, n);
        mostrarMatrix(matrixAntiSimetrica, n);

        //Creo matriz aleatoria para verificar que sea FALSE
        rellenarAleatoria(matrixAleatoria, n);
        mostrarMatrix(matrixAleatoria, n);

        //Alojo en un boolean el retorno de la función que verifica si es o no Antisimétrica
        //boolean esAntiSimetrica = verifAntiSimetria(matrixAntiSimetrica, n);
        //esAntiSimetrica = verifAntiSimetria(matrixAleatoria, n);
    }

    public static void rellenarAntiSimetrica(int matrizAntiSimetrica[][], int n) {
        for (int f=0; f<n; f++) {
            for (int c=0; c<n; c++) {
                if (f == c) {
                    matrizAntiSimetrica[f][c] = 0;
                }else{
                    do {
                        matrizAntiSimetrica[f][c] = (int) (Math.random()*20);
                        matrizAntiSimetrica[c][f] = -matrizAntiSimetrica[f][c];
                    } while (matrizAntiSimetrica[f][c] == 0);

                }
            }
        }
    }

    public static void mostrarMatrix(int matrix[][], int n) {
        for (int f=0; f<n; f++) {
            for (int c=0; c<n; c++) {
                System.out.print("[" + matrix[f][c] + "]");
            }
            System.out.println();
        }
    }

    public static void rellenarAleatoria(int matrix[][], int n) {
        for (int f=0; f<n; f++) {
            for (int c=0; c<n; c++) {
                matrix[f][c] = (int) (Math.random() * 20);
            }
        }
    }

    public static boolean verifAntiSimetria(int matrix[][], int n) {
        boolean antiSimetria;

        for (int f=0; f<n; f++) {
            for (int c=0; c<n; c++) {

                //verificar que la diagonal sea 0
                //verificar que matrix[f][c] = -matrix[c][f]
            }
        }



        return antiSimetria;
    }
}
