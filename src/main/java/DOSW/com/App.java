package DOSW.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creacion de tecnicos y ajuste de cadena de responsabilidad
        TecnicoBasico basico = new TecnicoBasico();
        TecnicoIntermedio intermedio = new TecnicoIntermedio();
        TecnicoAvanzado avanzado = new TecnicoAvanzado();

        basico.setSiguiente(intermedio);
        intermedio.setSiguiente(avanzado);

        List<Ticket> tickets = new ArrayList<>();

        System.out.print("¿Cuántos tickets desea ingresar? ");
        int cantidad = sc.nextInt();

        //limpiamos el buffer
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("\nTicket #" + i);

            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();

            System.out.print("Nivel (BASICO / INTERMEDIO / AVANZADO): ");
            Nivel nivel = Nivel.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Prioridad (BAJA / MEDIA / ALTA): ");
            Prioridad prioridad = Prioridad.valueOf(sc.nextLine().toUpperCase());

            Ticket ticket = new Ticket(descripcion, nivel, prioridad);

            // Procesar inmediatamente el ticket
            basico.procesar(ticket);

            tickets.add(ticket);

            System.out.println("Resultado: " + ticket);
        }

        // Mostrar todos los tickets
        System.out.println("\n---------- RESUMEN FINAL -----------");
        System.out.println("\nListado de tickets:");
        tickets.forEach(System.out::println);

        sc.close();
    }
}

