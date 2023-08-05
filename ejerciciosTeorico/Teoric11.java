package ejerciciosTeorico;

import java.util.Scanner;

/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
 * en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
 * reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
 * vocales acentuadas) se mantienen sin cambios.
 *
 *      a e i o u
 *      @ # $ % *
 *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
 * correspondiente. Utilice la estructura “según” para la transformación.
 * Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
 * La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 *
 */
public class Teoric11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";

        /**
         * En la condición del while, primero evalúo si la variable frase está vacía, porque sino
         * se está intentando obtener el último carácter de la cadena antes de verificar si la cadena tiene algún carácter,
         * por lo que me daría error.
         */

        while (frase.isEmpty() || !frase.substring(frase.length() - 1).equals(".")) {
            System.out.println("Ingrese una palabra o frase terminada en punto");
            frase = scanner.nextLine();
        }
        System.out.println(frase);

    }
/**
    public static String codificar(String frase) {
        String code;
        switch (frase) {
            case "a":




        }

    }
 */
}


