
import java.util.Scanner;

/**
 * Ejercicio 01: "Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, 
 * la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%."
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo, cantidad, total, descuento;
        descuento = 0.85;
        System.out.print("Introduzca el valor del producto: $");
        costo = tcl.nextDouble();
        System.out.print("Introduzca la cantidad de productos: ");
        cantidad = tcl.nextDouble();
        if (cantidad > 50) {
            total = (cantidad * costo) * descuento;
            System.out.println("Su total a pagar es de $" + total);
        }
        else {
            total = (cantidad * costo);
            System.out.println("Su total a pagar es de $" + total);
        }
            
    }
}

/***
 * EVIDENCIA DEL RUN:
Introduzca el valor del producto: $15
Introduzca la cantidad de productos: 70
Su total a pagar es de $892.5
 */