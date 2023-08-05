package ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
 * pantalla el siguiente menú:
 *
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * Elija opción:
 *
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
 * y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
 * desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
 * programa, caso contrario se vuelve a mostrar el menú.
 */
public class Bucles11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = scanner.nextInt();

        menu(scanner, num1, num2);


    }

    public static void menu(Scanner scanner, int num1, int num2) {
        boolean exit = false;
        String salir = "";



        do {
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");


            int seleccion = scanner.nextInt();
            scanner.nextLine(); // tengo que utilizarlo posterior al scanner.nextInt para que me lea el caracater S/N más adelante

            switch (seleccion) {
                case 1:
                    int suma = sumar(num1, num2);
                    System.out.println("RESULTADO: " + suma);
                    break;
                case 2:
                    int resta = restar(num1, num2);
                    System.out.println("RESULTADO: " + resta);
                    break;
                case 3:
                    int producto = multiplicar(num1, num2);
                    System.out.println("RESULTADO: " + producto);
                    break;
                case 4:
                    double cociente = dividir(num1, num2);
                    System.out.println("RESULTADO: " + cociente);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                    salir = scanner.nextLine();

                    if (salir.equalsIgnoreCase("s")) {   //funciona a la primera; arreglar el problema
                        exit = true;
                        break;

                    }else if (salir.equalsIgnoreCase("n")) {
                        break;
                    }else {
                        System.out.println("Respuesta inválida");
                        break;
                    }
                default:
                    System.out.println("Respuesta inválida");
                    break;

            }
            System.out.println(salir);
            System.out.println(exit);

        } while (!exit);
    }

    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int producto = num1 * num2;
        return producto;
    }

    public static double dividir(int num1, int num2) {
        double cociente = num1 / num2;
        return cociente;
    }

}
