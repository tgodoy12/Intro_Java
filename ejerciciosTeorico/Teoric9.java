package ejerciciosTeorico;

import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
 * bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
 * resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
 * Nota: recordar el uso de la sentencia break.
 */
public class Teoric9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int i = 0;
        do {
            System.out.println("Ingrese un número");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Se capturó el número 0");
                break;
            }else if(num > 0){
                suma += num;
            }

            i++;

        }while (i<20);

        System.out.println("La suma es: " + suma);
    }
}
