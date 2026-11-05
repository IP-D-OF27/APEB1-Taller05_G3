
import java.util.Scanner;

/**
 * Ejercicio 01: "Día de la semana: Mostrar el nombre del día de la semana en función del número
 * ingresado (1 para lunes, 2 para martes, etc.) ."
 * @author Diego Loaiza, Andy Correa
 * @version 1.0
 */

public class Ejercicio02_DiaSemana {
    public static void main(String[] args) {
        String nombreDia;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme numero de dia: ");
        int Ndia = tcl.nextInt();
        switch (Ndia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Error";
        }
        System.out.println("El nro del dia " + Ndia + " corresponde a " + nombreDia);
    }
}

/***
 * EVIDENCIA DEL RUN:
Deme numero de dia: 4
El nro del dia 4 corresponde a Jueves
BUILD SUCCESSFUL (total time: 2 seconds)
 */