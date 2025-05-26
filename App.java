

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ClinicaFisioterapia clinica = new ClinicaFisioterapia();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar cita");
            System.out.println("2. Mostrar citas");
            System.out.println("3. Eliminar cita");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del paciente: ");
                    String paciente = scanner.nextLine();
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fecha = scanner.nextLine();
                    System.out.print("Hora (hh:mm): ");
                    String hora = scanner.nextLine();
                    clinica.agregarCita(new Cita(paciente, fecha, hora));
                    break;
                case 2:
                    clinica.mostrarCitas();
                    break;
                case 3:
                    System.out.print("Nombre del paciente a eliminar: ");
                    String pacienteEliminar = scanner.nextLine();
                    clinica.eliminarCita(pacienteEliminar);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
}