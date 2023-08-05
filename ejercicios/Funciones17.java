package ejercicios;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Funciones17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamanio = scanner.nextInt();
        int vector[] = new int[tamanio];

        rellenar(vector, tamanio);
        contarDigitos(vector, tamanio);


    }

    public static void rellenar(int vector[], int tamanio) {
        for (int f=0; f<tamanio; f++) {
                vector[f] = (int) (Math.random() * 10000);
                //creo que no me toma el valor 10000, debería utlizar 100000 pero la tendencia es siempre hacia el limite mayor, y no el menor
            }
    }

    public static void contarDigitos(int vector[], int tamanio) {


        //variables donde se van contabilizando los difentes valores según su canitdad de dígitos
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos= 0;

        for (int f=0; f<tamanio; f++) {
            //convierto los valores del vector a String para luego utilizar el metodo length() y así obtener el tamaño
            //del numero, es decir, la cantidad de digitos
            String valores = String.valueOf(vector[f]);
            int digitos = valores.length();

            switch (digitos) {
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigitos++;
                    break;
                case 4:
                    cuatroDigitos++;
                    break;
                case 5:
                    cincoDigitos++;
                    break;
            }
        }
        System.out.println("El vector tiene: ");
        System.out.println(unDigito + " valores de 1 digito");
        System.out.println(dosDigitos + " valores de 2 digitos");
        System.out.println(tresDigitos + " valores de 3 digitos");
        System.out.println(cuatroDigitos + " valores de 4 digitos");
        System.out.println(cincoDigitos + " valores de 5 digitos");
    }



}



