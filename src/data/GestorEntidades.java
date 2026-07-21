package data;

import exceptions.DatoInvalidoException;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

public class GestorEntidades {

```
    private final ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public void agregarGuia(GuiaTuristico guia) throws DatoInvalidoException {

        if (guia.getNombre() == null || guia.getNombre().isBlank()) {
            throw new DatoInvalidoException(
                    "El nombre del guía no puede estar vacío."
            );
        }

        if (guia.getExperienciaAnios() < 0) {
            throw new DatoInvalidoException(
                    "Los años de experiencia no pueden ser negativos."
            );
        }

        entidades.add(guia);
    }

    public void agregarVehiculo(Vehiculo vehiculo) throws DatoInvalidoException {

        if (vehiculo.getPatente() == null || vehiculo.getPatente().isBlank()) {
            throw new DatoInvalidoException(
                    "La patente no puede estar vacía."
            );
        }

        if (vehiculo.getModelo() == null || vehiculo.getModelo().isBlank()) {
            throw new DatoInvalidoException(
                    "El modelo no puede estar vacío."
            );
        }

        if (vehiculo.getCapacidad() <= 0) {
            throw new DatoInvalidoException(
                    "La capacidad debe ser mayor que cero."
            );
        }

        entidades.add(vehiculo);
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
```

}
