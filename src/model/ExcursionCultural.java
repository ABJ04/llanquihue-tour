package model;

public class ExcursionCultural extends Tour {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, String tipo, int duracionHoras, int precio,
                             GuiaTuristico guiaTuristico, String lugarHistorico) {
        super(nombre, tipo, duracionHoras, precio, guiaTuristico);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", lugarHistorico='" + lugarHistorico + "'";
    }
}