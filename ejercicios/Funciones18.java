package ejercicios;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 */
public class Funciones18 {
    public static void main(String[] args) {
        int n=4;
        int matrix[][] = new int[n][n];

        rellenarMatrix(matrix, n);
        mostrarMatrix(matrix,n);
        System.out.println();
        matrixTranspuesta(matrix, n);
    }

    public static void rellenarMatrix(int matrix[][], int n) {
        for (int f=0; f<n; f++) {
            for (int c=0; c<n; c++) {
                matrix[f][c] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarMatrix(int matrix[][], int n) {
        System.out.println("Matriz Original");

        for (int f=0; f<n; f++) {
            for (int c=0; c<n; c++) {
                System.out.print("[" + matrix[f][c] + "]");
            }
            System.out.println();
        }
    }

    public static void matrixTranspuesta(int matrix[][], int n) {
        System.out.println("Matriz transpuesta");
        for (int f=0; f<n; f++) {
            for (int c=0; c<n; c++) {
                System.out.print("[" + matrix[c][f] + "]");
            }
            System.out.println();
        }
    }
}
