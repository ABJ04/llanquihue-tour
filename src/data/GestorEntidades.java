package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public String mostrarTodasLasEntidades() {

        if (entidades.isEmpty()) {
            return "No hay entidades registradas.";
        }

        StringBuilder resultado = new StringBuilder();

        for (Registrable entidad : entidades) {

            if (entidad instanceof GuiaTuristico) {
                resultado.append("=== GUÍA TURÍSTICO ===\n");

            } else if (entidad instanceof Vehiculo) {
                resultado.append("=== VEHÍCULO ===\n");

            } else if (entidad instanceof ColaboradorExterno) {
                resultado.append("=== COLABORADOR EXTERNO ===\n");
            }

            resultado.append(entidad.mostrarResumen());
            resultado.append("\n\n");
        }

        return resultado.toString();
    }

    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }
}