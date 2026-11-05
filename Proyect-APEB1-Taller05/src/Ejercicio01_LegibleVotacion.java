import java.util.Scanner;
/**
 * Ejercicio 01: Edad para votar: Determinar si una persona es elegible para 
 * votar en función de su edad (mayor o igual a 16 años).
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme edad: ");
        int edad = tcl.nextInt();
        if (edad >= 16)
            System.out.println("Es legible para votar");
        else
            System.out.println("No es legible para votar");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */