package ejerciciosTeorico;

/**
 * Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo:
 *        operadores unarios, operadores aritméticos y operadores de igualdad y relación
 */
public class Teoric3 {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 52;

        int suma = num1 + num2;
        int resta = num1 - num2;

        boolean flag = num2 <= num1;
        boolean flag2 = num1 != num2;

        num1++;
        num2--;

        System.out.println("Incremento: " + num1 + " Decremento: " + num2);
        System.out.println("Suma: " + suma + " Resta: " + resta);
        System.out.println("¿Num2 es menor o igual que num1?: " + flag);
        System.out.println("¿Num1 es diferente a num2?: " + flag2);




    }
}
