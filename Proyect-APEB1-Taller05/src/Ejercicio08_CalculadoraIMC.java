
import java.util.Scanner;

/**
 * Ejercicio 01: "Calcula el índice de masa corporal (IMC) de una persona 
 * y la clasifica en función de su valor (bajo peso, peso normal, sobrepeso, etc.) ."
 * @author Diego Loaiza, Andy Correa
 * @version 1.0
 */

public class Ejercicio08_CalculadoraIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Introduzca su altura en m: ");
        double altura = tcl.nextDouble();
        System.out.print("Introduzca su peso en kg: ");
        double peso = tcl.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println("Su indice de masa corporal esta por denajo de lo recomendado");
            System.out.println("Su IMC = " + String.format("%.2f", imc));
        }
        else {
            if (imc < 25) {
                System.out.println("Usted tiene un indice de masa corporal optimo");
                System.out.println("Su IMC = " + String.format("%.2f", imc));
            }
            else {
                System.out.println("Usted sobrepaso su indice de masa corporal recomendado");
                System.out.println("Su IMC = " + String.format("%.2f", imc));
            }
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
Introduzca su altura en m: 1.70
Introduzca su peso en kg: 60
Usted tiene un indice de masa corporal optimo
Su IMC = 20.76
BUILD SUCCESSFUL (total time: 7 seconds)
 */