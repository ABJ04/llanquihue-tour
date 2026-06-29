package data;

import model.*;

public class GestorServicios {

    public void mostrarServiciosSemana6() {

        GuiaTuristico guia1 = new GuiaTuristico("María Soto", "Gastronomía local", 4);
        GuiaTuristico guia2 = new GuiaTuristico("Carlos Muñoz", "Paseos lacustres", 5);
        GuiaTuristico guia3 = new GuiaTuristico("Pedro Vargas", "Historia y naturaleza", 7);

        RutaGastronomica rg1 = new RutaGastronomica("Tour Gastronómico Frutillar", "gastronomico", 3, 28000, guia1, 4);
        RutaGastronomica rg2 = new RutaGastronomica("Ruta Sabores del Sur", "gastronomico", 4, 32000, guia1, 5);

        PaseoLacustre pl1 = new PaseoLacustre("Ruta del Lago Llanquihue", "lacustre", 4, 35000, guia2, "Catamarán");
        PaseoLacustre pl2 = new PaseoLacustre("Paseo en Kayak", "lacustre", 5, 40000, guia2, "Kayak");

        ExcursionCultural ec1 = new ExcursionCultural("Excursión Volcán Osorno", "cultural", 6, 45000, guia3, "Volcán Osorno");
        ExcursionCultural ec2 = new ExcursionCultural("Ruta Patrimonial Puerto Varas", "cultural", 2, 20000, guia3, "Puerto Varas");

        System.out.println(rg1);
        System.out.println(rg2);
        System.out.println(pl1);
        System.out.println(pl2);
        System.out.println(ec1);
        System.out.println(ec2);
    }
}