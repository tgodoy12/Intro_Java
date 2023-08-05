package ejercicios;

public class Ejerc21 {
    public static void main(String[] args) {
        int[][] matriz = rellenar(10);

        int[][] submatriz = new int[3][3];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                submatriz[f][c] = matriz[f+7][c+7];
            }
        }

        mostrarMatriz(matriz, 10);
        mostrarMatriz(submatriz, 3);
        detector(matriz, submatriz, 10, 3);


    }

    public static int[][] rellenar(int dimension) {
        int[][] matriz = new int[dimension][dimension];

        for (int f = 0; f < dimension; f++) {
            for (int c = 0; c < dimension; c++) {
                matriz[f][c] = (int) (Math.random() * 10);
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz, int dimension) {

        for (int f = 0; f < dimension; f++) {
            for (int c = 0; c < dimension; c++) {
                System.out.print("[" + matriz[f][c] + "]");
            }
            System.out.println();
        }

    }

    public static void detector(int[][] matriz, int[][] submatriz, int dimension, int dimension2) {
        boolean[][] verificacion = new boolean[dimension][dimension];

        for (int f = 0; f < dimension; f++) {
            for (int c = 0; c < dimension; c++) {
                verificacion[f][c] = false;
            }
        }

        for (int f = 0; f <= dimension - dimension2; f++) {
            for (int c = 0; c <= dimension - dimension2; c++) {
                boolean coincidencia = true;

                for (int i = 0; i < dimension2; i++) {
                    for (int j = 0; j < dimension2; j++) {
                        if (matriz[f + i][c + j] != submatriz[i][j]) {
                            coincidencia = false;
                            break;
                        }
                    }
                    if (!coincidencia) {
                        break;
                    }
                }

                if (coincidencia) {
                    for (int i = 0; i < dimension2; i++) {
                        for (int j = 0; j < dimension2; j++) {
                            verificacion[f + i][c + j] = true;
                            System.out.println("Posición: [" + (f+i) + "," + (c+j) + "]");
                        }
                    }
                }
            }
        }

        for (int f = 0; f < dimension; f++) {
            for (int c = 0; c < dimension; c++) {
                System.out.print("[" + verificacion[f][c] + "]");
            }
            System.out.println();
        }



    }
}
