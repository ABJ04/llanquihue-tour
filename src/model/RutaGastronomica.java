package model;

public class RutaGastronomica extends Tour {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, String tipo, int duracionHoras, int precio,
                            GuiaTuristico guiaTuristico, int numeroDeParadas) {
        super(nombre, tipo, duracionHoras, precio, guiaTuristico);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numeroDeParadas=" + numeroDeParadas;
    }
}