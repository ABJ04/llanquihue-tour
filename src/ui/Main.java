package ui;

import data.GestorDatos;
import model.Tour;
import service.TourService;

import java.util.ArrayList;
import java.util.Scanner;
import data.GestorServicios;

public class Main {

    public static void main(String[] args) {
        GestorDatos gestorDatos = new GestorDatos();
        TourService tourService = new TourService();
        GestorServicios gestorServicios = new GestorServicios();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Tour> tours = gestorDatos.cargarTours("resources/tours.txt");

        int opcion;

        do {
            System.out.println("\n=== LLANQUIHUE TOUR ===");
            System.out.println("1. Mostrar todos los tours");
            System.out.println("2. Buscar tours por tipo");
            System.out.println("3. Buscar tours por precio maximo");
            System.out.println("4. Salir");
            System.out.println("5. Mostrar servicios Semana 7");
            System.out.print("Seleccione una opcion: ");


            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        tourService.mostrarTours(tours);
                        break;

                    case 2:
                        System.out.print("Ingrese tipo de tour: ");
                        String tipo = scanner.nextLine();
                        tourService.buscarPorTipo(tours, tipo);
                        break;

                    case 3:
                        System.out.print("Ingrese precio maximo: ");
                        int precioMaximo = Integer.parseInt(scanner.nextLine());
                        tourService.buscarPorPrecioMaximo(tours, precioMaximo);
                        break;

                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;

                    case 5:
                        gestorServicios.mostrarServiciosSemana7();
                        break;

                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error: debe ingresar un dato valido.");
                opcion = 0;
            }

        } while (opcion != 4);

        scanner.close();
    }
}