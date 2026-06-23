package model;

public class Tour {
    private String nombre;
    private String tipo;
    private int duracionHoras;
    private int precio;
    private GuiaTuristico guiaTuristico;

    public Tour() {
    }

    public Tour(String nombre, String tipo, int duracionHoras, int precio, GuiaTuristico guiaTuristico) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracionHoras = duracionHoras;
        this.precio = precio;
        this.guiaTuristico = guiaTuristico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public GuiaTuristico getGuiaTuristico() {
        return guiaTuristico;
    }

    public void setGuiaTuristico(GuiaTuristico guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", duracionHoras=" + duracionHoras +
                ", precio=" + precio +
                ", guiaTuristico=" + guiaTuristico +
                '}';
    }
}