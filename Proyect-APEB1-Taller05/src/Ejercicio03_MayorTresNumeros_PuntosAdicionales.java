import java.util.Scanner;
/**
 * Ejercicio 03: Dados tres números distintos, determinar cuál es el mayor.
 * @author Andy Correa
 * @version 1.0
 */
public class Ejercicio03_MayorTresNumeros_PuntosAdicionales {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();
        if (num1 > num2)
            if (num1 > num3)
                System.out.println("El mayor es: " + num1);
        else
                System.out.println("El mayor es: " + num3);
        else if (num2 > num3)
            System.out.println("El mayor es: " + num2);
        else
            System.out.println("El mayor es: " + num3);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese el primer numero: 12
Ingrese el segundo numero: 45
Ingrese el tercer numero: 35
El mayor es: 45
BUILD SUCCESSFUL (total time: 3 seconds)
 */