
import java.util.Scanner;

/**
 * Ejercicio 01: "Dados tres números, ordenarlos en orden ascendente."
 * @author Diego Loaiza, Andy Correa
 * @version 1.0
 */

public class Ejercicio09_OrdenNuemeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca el primer valor: ");
        n1 = tcl.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        n2 = tcl.nextInt();
        System.out.print("Introduzca el tercer valor: ");
        n3 = tcl.nextInt();
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3)
                System.out.println(n1 + ", " + n2 + ", " + n3);
            else
                System.out.println(n1 + ", " + n3 + ", " + n2);
        }
        else
            if (n2 > n3) {
                if (n3 > n1)
                    System.out.println(n2 + ", " + n3 + ", " + n1);
                else
                    System.out.println(n2 + ", " + n1 + ", " + n3);
            }
            else {
            if (n2 > n1) 
                System.out.println(n3 + ", " + n2 + ", " + n1);
            else
                    System.out.println(n3 + ", " + n1 + ", " + n2);
            }

    }
}

/***
 * EVIDENCIA DEL RUN:
Introduzca el primer valor: 2
Introduzca el segundo valor: 4
Introduzca el tercer valor: 1
4, 2, 1
BUILD SUCCESSFUL (total time: 5 seconds)
 */