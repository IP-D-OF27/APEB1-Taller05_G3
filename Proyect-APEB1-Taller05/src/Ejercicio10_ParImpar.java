
import java.util.Scanner;

/**
 * Ejercicio 01: "Dado un valor entero ingresado por teclado (positivo o negativo), determinar si se trata de un valor par o impar."
 * @author Diego Loaiza, Andy Correa
 * @version 1.0
 */

public class Ejercicio10_ParImpar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Introduzca un valor: ");
        int valor = tcl.nextInt();
        int Par;
        Par = valor % 2;
        if (Par == 0)
            System.out.println("El numero dado es par");
        else
            System.out.println("El numero dado es impar");
    }
}

/***
 * EVIDENCIA DEL RUN:
Introduzca un valor: 15
El numero dado es impar
BUILD SUCCESSFUL (total time: 6 seconds)

 */