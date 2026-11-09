import java.util.Scanner;
/**
 * Ejercicio 05: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, 
 * mostrar un mensaje especial.
 * @author Andy Correa y Diego Loaiza
 * @version 1.0
 */
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int anio, anioBisiesto;
        System.out.println("Ingrese un año: ");
        anio = tcl.nextInt();
        if (anio %4 == 0){
            anioBisiesto = anio;
            System.out.println("¡Este año tiene 366 días y una oportunidad "
                    + "extra para vivir nuevas experiencias! "
                    + "Es un año bisiesto.");
        }
        else
            System.out.println("No es un año bisiesto");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese un año: 
2032
�Este año tiene 366 días y una oportunidad extra para vivir nuevas experiencias! Es un año bisiesto.
BUILD SUCCESSFUL (total time: 1 second)
 */