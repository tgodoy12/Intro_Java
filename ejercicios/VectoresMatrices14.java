package ejercicios;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
 * función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
 * una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 * (void).
 * El cambio de divisas es:
 * * 0.86 libras es un 1 €
 * * 1.28611 $ es un 1 €
 * * 129.852 yenes es un 1 €
 */
public class VectoresMatrices14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un monto en Euros");
        int euros = scanner.nextInt();
        scanner.nextLine();
        String moneda = "";

        do {
            System.out.println("Ingrese la moneda a la que desea convertir:");
            System.out.println("libras, dólares o yenes");
            moneda = scanner.nextLine();
        }while (!moneda.equals("dólares") && !moneda.equals("yenes") && !moneda.equals("libras"));


        convertir(euros, moneda);

    }

    public static void convertir(double euros, String moneda) {
        double[] valores = new double[3];
        valores[0] = 0.86;
        valores[1] = 1.28611;
        valores[2] = 129.852;

        switch (moneda) {
            case "libras":
                System.out.println("El cambio es de: " + valores[0]*euros);
                break;
            case "dólares":
                System.out.println("El cambio es de: " + valores[1]*euros);
                break;
            case "yenes":
                System.out.println("El cambio es de: " + valores[2]*euros);
                break;
            default:
                System.out.println("La moneda especificada no es válida");

        }

    }

}
