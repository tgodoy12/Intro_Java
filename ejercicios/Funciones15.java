package ejercicios;

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 */
public class Funciones15 {
    public static void main(String[] args) {
        int[] vector = new int[100];

        rellenar(vector);
    }

    public static void rellenar(int[] vector) {
        for (int f=0; f<100; f++) {
            vector[f] = f;
        }

        for (int f=99; f>=0; f--) {
            System.out.print("[" + vector[f] + "]");
        }
        System.out.println();

    }
}
