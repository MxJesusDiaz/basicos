/**
 * Created by Jesús Alejandro on 30/08/2017.
 */
import java.util.Scanner;
public class Promedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cal1, cal2, cal3, cal4, suma, promedio; //Se declaran las variables de calfiicaciones, suma y promedio.
        String nombre;//Variable que almacena el nombre del Estudiante

        System.out.println("Introduce el nombre del estudiante");
        nombre = sc.next();//Pide el nombre del estudiante

        System.out.println("Introduce la calificacion del primer parcial");
        cal1 = sc.nextDouble();//Calificacion parcial 1
        System.out.println("introduce la califiacion del 2 parcial");
        cal2 = sc.nextDouble();//Calificacion parcial 2
        System.out.println("introduce la califiacion del 3 parcial");
        cal3 = sc.nextDouble();//Calificacion parcial 3
        System.out.println("introduce la califiacion del 4 parcial");
        cal4 = sc.nextDouble();//Calificacion parcial 4

        suma = cal1+cal2+cal3+cal4;//Suma de las califiaciones de los parciales

        promedio = (suma/4); //Sacando el promedio

        if(promedio>5) { //Imprimir el promedio si la calificacion es aprobatoria
            System.out.println("El alumno " + nombre + " aprobo el semestre con una calificacion de: " + promedio);
        }else {//Imprimir el promedio si la calificacion es insuficiente.
            System.out.println("El alumno " + nombre + " reprobo el semestre con una calificacion de: " + promedio);
        }
        }
    }


