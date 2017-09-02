import java.util.Scanner;

/**
 * Created by Jesús Alejandro on 05/08/2017.
 */
public class Teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre");
        String nombre = entrada.nextLine();

        System.out.println("¿Cuál es tu edad?");
        int edad = entrada.nextInt();

        System.out.println("Tu nombre es: " + nombre + " y tienes " + edad + " años");

    }
}
