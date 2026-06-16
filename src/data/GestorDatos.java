package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> leerTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        // Lee el archivo línea por línea.
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Separa los datos usando punto y coma (;).
                String[] datos = linea.split(";");

                // Valida que cada línea tenga los 4 campos esperados.
                if (datos.length == 4) {
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int duracionHoras = Integer.parseInt(datos[2]);
                    int precio = Integer.parseInt(datos[3]);

                    // Crea el objeto Tour y lo agrega al ArrayList.
                    Tour tour = new Tour(nombre, tipo, duracionHoras, precio);
                    tours.add(tour);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en formato numérico del archivo: " + e.getMessage());
        }

        return tours;
    }
}
