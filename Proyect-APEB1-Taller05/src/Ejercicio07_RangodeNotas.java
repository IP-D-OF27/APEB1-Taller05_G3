import java.util.Scanner;
/**
 * Ejercicio 07: Asignar una letra (A, B, C, D) a una calificación en función 
 * de su rango (A para 90-100, B para 80-89, etc.).
 * @author Andy Correa y Diego Loaiza
 * @version 1.0
 */
public class Ejercicio07_RangodeNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese la calificacion obtenida: ");
        calificacion = tcl.nextDouble();
        if (calificacion >= 90 && calificacion <= 100)
            System.out.println("Letra asignada: " + "A");
        else if (calificacion >= 80 && calificacion <= 89)
            System.out.println("Letra asignada: " + "B");
        else if (calificacion >= 70 && calificacion <= 79)
            System.out.println("Letra asignada: " + "C");
        else 
            System.out.println("Letra asignada: " + "D");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese la calificacion obtenida: 
69
Letra asignada: D
BUILD SUCCESSFUL (total time: 2 seconds)
 */