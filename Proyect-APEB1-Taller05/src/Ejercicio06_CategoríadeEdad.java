import java.util.Scanner;
/**
 * Ejercicio 06: Clasificar a una persona en una categoría de edad 
 * (niño, adolescente, adulto) en función de su edad.
 * @author Andy Correa y Diego Loaiza
 * @version 1.0
 */
public class Ejercicio06_CategoríadeEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad >= 0 && edad < 12)
            System.out.println("Usted es un niño: ");
        else if (edad >= 12 && edad < 18)
            System.out.println("Usted es adolescente: ");
        else
            System.out.println("Usted es adulto");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese su edad: 
20
Usted es adulto
BUILD SUCCESSFUL (total time: 1 second)
 */