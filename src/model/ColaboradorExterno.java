package model;

public class ColaboradorExterno implements Registrable {

    private String nombre;
    private String servicio;
    private String empresa;

    public ColaboradorExterno(String nombre, String servicio, String empresa) {
        this.nombre = nombre;
        this.servicio = servicio;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getServicio() {
        return servicio;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador externo: " + nombre +
                "\nServicio: " + servicio +
                "\nEmpresa: " + empresa;
    }

    @Override
    public String toString() {
        return "ColaboradorExterno{" +
                "nombre='" + nombre + '\'' +
                ", servicio='" + servicio + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}