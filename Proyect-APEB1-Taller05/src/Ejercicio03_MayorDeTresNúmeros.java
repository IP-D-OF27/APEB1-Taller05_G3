import java.util.Scanner;
/**
 * Ejercicio 03: Dados tres números distintos, determinar cuál es el mayor.
 * @author Andy Correa y Diego Loaiza
 * @version 1.0
 */
public class Ejercicio03_MayorDeTresNúmeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println("El primer numero es el mayor: " + num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("El segundo numero es el mayor: " + num2);
        else if (num3 > num1 && num3 > num2)
            System.out.println("El tercer numero es el mayor: " + num3);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese el primer numero: 
8
Ingrese el segundo numero: 
52
Ingrese el tercer numero: 
20
El segundo numero es el mayor: 52
BUILD SUCCESSFUL (total time: 4 seconds)
 */