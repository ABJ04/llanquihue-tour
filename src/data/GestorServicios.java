package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    public void mostrarServiciosSemana7() {

        List<Tour> servicios = new ArrayList<>();

        GuiaTuristico guia1 = new GuiaTuristico("María Soto", "Gastronomía local", 4);
        GuiaTuristico guia2 = new GuiaTuristico("Carlos Muñoz", "Paseos lacustres", 5);
        GuiaTuristico guia3 = new GuiaTuristico("Pedro Vargas", "Historia y naturaleza", 7);

        servicios.add(new RutaGastronomica(
                "Tour Gastronómico Frutillar",
                "gastronomico",
                3,
                28000,
                guia1,
                4));

        servicios.add(new RutaGastronomica(
                "Ruta Sabores del Sur",
                "gastronomico",
                4,
                32000,
                guia1,
                5));

        servicios.add(new PaseoLacustre(
                "Ruta del Lago Llanquihue",
                "lacustre",
                4,
                35000,
                guia2,
                "Catamarán"));

        servicios.add(new PaseoLacustre(
                "Paseo en Kayak",
                "lacustre",
                5,
                40000,
                guia2,
                "Kayak"));

        servicios.add(new ExcursionCultural(
                "Excursión Volcán Osorno",
                "cultural",
                6,
                45000,
                guia3,
                "Volcán Osorno"));

        servicios.add(new ExcursionCultural(
                "Ruta Patrimonial Puerto Varas",
                "cultural",
                2,
                20000,
                guia3,
                "Puerto Varas"));

        for (Tour servicio : servicios) {
            servicio.mostrarInformacion();
            System.out.println();
        }
    }
}