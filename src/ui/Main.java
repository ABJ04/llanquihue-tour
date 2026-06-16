package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestorDatos = new GestorDatos();

        // Ruta del archivo txt dentro de la carpeta resources.
        String rutaArchivo = "resources/tours.txt";

        // Lee los datos y crea la colección de objetos Tour.
        ArrayList<Tour> tours = gestorDatos.leerTours(rutaArchivo);

        System.out.println("=== LISTADO COMPLETO DE TOURS ===");
        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\n=== TOURS FILTRADOS: TIPO GASTRONOMICO ===");
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("gastronomico")) {
                System.out.println(tour);
            }
        }
    }
}
