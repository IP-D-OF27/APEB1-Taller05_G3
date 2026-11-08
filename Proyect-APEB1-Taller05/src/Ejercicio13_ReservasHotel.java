
import java.util.Scanner;

/**
 * Ejercicio 01: "Texto del enunciado del ejercicio/problema...."
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio13_ReservasHotel {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dias;
        double precioDiario, subtotal, descuento, total;
        System.out.print("Ingrese el numero de dias de hospedaje: ");
        dias = tcl.nextInt();
        System.out.print("Ingrese el precio diario de la habitacion: ");
        precioDiario = tcl.nextDouble();
        subtotal = dias * precioDiario;
        if (dias > 15) 
            descuento = subtotal * 0.20;
         else if (dias > 10) 
            descuento = subtotal * 0.15;
         else if (dias > 5) 
            descuento = subtotal * 0.10;
         else 
            descuento = 0;
        
        total = subtotal - descuento;

        System.out.println("\n--- RESERVA HOTELERA ---");
        System.out.println("Dias de hospedaje: " + dias);
        System.out.printf("Precio diario: $%.2f%n", precioDiario);
        System.out.printf("Subtotal por pagar: $%.2f%n", subtotal);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("Total por pagar: $%.2f%n", total);
    }
}

/***
 * EVIDENCIA DEL RUN:
Ingrese el numero de dias de hospedaje: 16
Ingrese el precio diario de la habitacion: 12

--- RESERVA HOTELERA ---
Dias de hospedaje: 16
Precio diario: $12.00
Subtotal por pagar: $192.00
Descuento: $38.40
Total por pagar: $153.60
 */