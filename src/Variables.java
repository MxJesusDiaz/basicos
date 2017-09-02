/**
 * Created by Jesús Alejandro on 05/08/2017.
 */
public class Variables {
    public static void main(String[] args) {
        int pizzas = 6;
        int personas = 3;

        int pizzasporpersona = pizzas/personas;

        System.out.printf("Si hay %d pizzas y %d personas, a cada una le tocan %d pizzas\n ", pizzas,
                personas,pizzasporpersona);

        String auto = "Ferrari";
        double velocidad =90.3;

        System.out.printf("El auto %s se desplaza a %f km/h\n", auto, velocidad);

        int precioHuevo = 22;
        double precioLeche = 45.50;
        int precioQueso = 40;

        double precioTotal = precioHuevo + precioQueso + precioLeche;

        System.out.printf("El precio total de su compra es: %f\n",precioTotal);

    }
}
