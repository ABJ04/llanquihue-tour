package service;

import model.Tour;

import java.util.ArrayList;

public class TourService {

    public void mostrarTours(ArrayList<Tour> tours) {
        if (tours.isEmpty()) {
            System.out.println("No hay tours registrados.");
            return;
        }

        System.out.println("=== LISTA DE TOURS ===");
        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    public void buscarPorTipo(ArrayList<Tour> tours, String tipoBuscado) {
        boolean encontrado = false;

        System.out.println("=== BUSQUEDA POR TIPO: " + tipoBuscado + " ===");

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase(tipoBuscado)) {
                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours del tipo: " + tipoBuscado);
        }
    }

    public void buscarPorPrecioMaximo(ArrayList<Tour> tours, int precioMaximo) {
        boolean encontrado = false;

        System.out.println("=== TOURS CON PRECIO MENOR O IGUAL A $" + precioMaximo + " ===");

        for (Tour tour : tours) {
            if (tour.getPrecio() <= precioMaximo) {
                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours con ese precio.");
        }
    }
}