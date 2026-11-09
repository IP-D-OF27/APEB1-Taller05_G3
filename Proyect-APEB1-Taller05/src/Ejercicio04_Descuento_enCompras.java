import java.util.Scanner;
/**
 * Ejercicio 04: Calcular el precio final de un producto con un descuento del 
 * 10% si el precio original es mayor de $100; de lo contrario, no hay 
 * descuento.
 * @author Andy Correa y Diego Loaiza
 * @version 1.0
 */
public class Ejercicio04_Descuento_enCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precioO, precioF;
        System.out.println("Ingrese el precio del producto: ");
        precioO = tcl.nextDouble();
        if (precioO > 100)
            precioF = precioO * 0.90;
        else
            precioF = precioO;
        System.out.println("Precio Final del producto: " + precioF);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese el precio del producto: 
120
Precio Final del producto: 108.0
BUILD SUCCESSFUL (total time: 3 seconds)
 */