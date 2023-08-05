package ejerciciosTeorico;

import java.util.Scanner;

/**
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
 * Scanner.
 */
public class Teoric5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un booleano");
        boolean flag = scanner.nextBoolean();

        System.out.println("Ingrese un decimal");
        double number = scanner.nextDouble();

        System.out.println("Ingrese una letra");
        char letra = scanner.next().charAt(0);

        //System.out.println(flag + " , " + number + " , " + letra);
    }
}
