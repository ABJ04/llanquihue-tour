package data;

import model.GuiaTuristico;
import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length == 7) {
                    String nombreTour = datos[0];
                    String tipo = datos[1];
                    int duracionHoras = Integer.parseInt(datos[2]);
                    int precio = Integer.parseInt(datos[3]);

                    String nombreGuia = datos[4];
                    String especialidad = datos[5];
                    int experienciaAnios = Integer.parseInt(datos[6]);

                    GuiaTuristico guia = new GuiaTuristico(nombreGuia, especialidad, experienciaAnios);
                    Tour tour = new Tour(nombreTour, tipo, duracionHoras, precio, guia);

                    tours.add(tour);
                }
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}