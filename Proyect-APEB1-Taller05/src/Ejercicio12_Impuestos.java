
import java.util.Scanner;

/**
 * Ejercicio 01: "Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo)
 * imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
 * Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%"
 * @author Diego Loaiza, Andy Correa
 * @version 1.0
 */

public class Ejercicio12_Impuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String marca, pais;
        System.out.print("Introduzca el nombre de la marca: ");
        marca = tcl.nextLine();
        System.out.print("Introduzca el pais de origen: ");
        pais = tcl.nextLine();
        double costo, PImpuesto, impuesto, total;
        System.out.print("Introduzca el precio del automovil: $");
        costo = tcl.nextDouble();
        if (pais.equalsIgnoreCase("Alemania")) 
            impuesto = costo * 0.20;
        else if (pais.equalsIgnoreCase("Japon")) 
            impuesto = costo * 0.30;
        else if (pais.equalsIgnoreCase("Italia")) 
            impuesto = costo * 0.15;
        else if (pais.equalsIgnoreCase("USA")) 
            impuesto = costo * 0.08;
        else {
            impuesto = 0;
            System.out.println("Pais no reconocido.");
        }
        total = costo + impuesto;
        System.out.println("\n--- DATOS DEL AUTOMOVIL ---");
        System.out.println("Marca: " + marca);
        System.out.println("Pais: " + pais);
        System.out.printf("Costo: $%.2f%n", costo);
        System.out.printf("Impuesto a pagar: $%.2f%n", impuesto);
        System.out.printf("Precio de venta: $%.2f%n", total);
        }
    }


/***
 * EVIDENCIA DEL RUN:
Introduzca el nombre de la marca: Toyota
Introduzca el pais de origen: Alemania
Introduzca el precio del automovil: $1500

--- DATOS DEL AUTOMOVIL ---
Marca: Toyota
Pais: Alemania
Costo: $1500.00
Impuesto a pagar: $300.00
Precio de venta: $1800.00
 */