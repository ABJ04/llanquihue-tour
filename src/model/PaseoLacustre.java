package model;

public class PaseoLacustre extends Tour {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, String tipo, int duracionHoras, int precio,
                         GuiaTuristico guiaTuristico, String tipoEmbarcacion) {
        super(nombre, tipo, duracionHoras, precio, guiaTuristico);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Paseo Lacustre ===");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tipoEmbarcacion='" + tipoEmbarcacion + "'";
    }
}