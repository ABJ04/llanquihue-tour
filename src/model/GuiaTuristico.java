package model;

public class GuiaTuristico {
    private String nombre;
    private String especialidad;
    private int experienciaAnios;

    public GuiaTuristico() {
    }

    public GuiaTuristico(String nombre, String especialidad, int experienciaAnios) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experienciaAnios = experienciaAnios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getExperienciaAnios() {
        return experienciaAnios;
    }

    public void setExperienciaAnios(int experienciaAnios) {
        this.experienciaAnios = experienciaAnios;
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", experienciaAnios=" + experienciaAnios +
                '}';
    }
}