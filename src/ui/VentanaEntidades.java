package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.*;

public class VentanaEntidades {

    private final GestorEntidades gestorEntidades;
    private final JFrame ventanaPrincipal;

    public VentanaEntidades() {
        gestorEntidades = new GestorEntidades();

        ventanaPrincipal = new JFrame();
        ventanaPrincipal.setAlwaysOnTop(true);
        ventanaPrincipal.setLocationRelativeTo(null);
    }

    public void mostrarMenu() {

        int opcion;

        do {
            String menu = """
                    === GESTIÓN DE ENTIDADES ===

                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Registrar colaborador externo
                    4. Mostrar entidades registradas
                    5. Salir
                    """;

            String entrada = JOptionPane.showInputDialog(
                    ventanaPrincipal,
                    menu,
                    "Llanquihue Tour",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                opcion = 5;
                continue;
            }

            try {
                opcion = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1:
                        registrarGuia();
                        break;

                    case 2:
                        registrarVehiculo();
                        break;

                    case 3:
                        registrarColaborador();
                        break;

                    case 4:
                        mostrarEntidades();
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(
                                ventanaPrincipal,
                                "Saliendo de la gestión de entidades."
                        );
                        break;

                    default:
                        JOptionPane.showMessageDialog(
                                ventanaPrincipal,
                                "Opción no válida."
                        );
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        ventanaPrincipal,
                        "Debe ingresar una opción válida."
                );
                opcion = 0;
            }

        } while (opcion != 5);
    }

    private void registrarGuia() {

        String nombre = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese nombre del guía:"
        );

        if (nombre == null) {
            return;
        }

        String especialidad = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese especialidad:"
        );

        if (especialidad == null) {
            return;
        }

        String entradaExperiencia = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese años de experiencia:"
        );

        if (entradaExperiencia == null) {
            return;
        }

        try {
            int experiencia = Integer.parseInt(entradaExperiencia);

            GuiaTuristico guia = new GuiaTuristico(
                    nombre,
                    especialidad,
                    experiencia
            );

            gestorEntidades.agregarEntidad(guia);

            JOptionPane.showMessageDialog(
                    ventanaPrincipal,
                    "Guía turístico registrado correctamente."
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    ventanaPrincipal,
                    "Los años de experiencia deben ser un número."
            );
        }
    }

    private void registrarVehiculo() {

        String patente = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese patente:"
        );

        if (patente == null) {
            return;
        }

        String modelo = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese modelo:"
        );

        if (modelo == null) {
            return;
        }

        String entradaCapacidad = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese capacidad de pasajeros:"
        );

        if (entradaCapacidad == null) {
            return;
        }

        try {
            int capacidad = Integer.parseInt(entradaCapacidad);

            Vehiculo vehiculo = new Vehiculo(
                    patente,
                    modelo,
                    capacidad
            );

            gestorEntidades.agregarEntidad(vehiculo);

            JOptionPane.showMessageDialog(
                    ventanaPrincipal,
                    "Vehículo registrado correctamente."
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    ventanaPrincipal,
                    "La capacidad debe ser un número."
            );
        }
    }

    private void registrarColaborador() {

        String nombre = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese nombre del colaborador:"
        );

        if (nombre == null) {
            return;
        }

        String servicio = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese servicio:"
        );

        if (servicio == null) {
            return;
        }

        String empresa = JOptionPane.showInputDialog(
                ventanaPrincipal,
                "Ingrese empresa:"
        );

        if (empresa == null) {
            return;
        }

        ColaboradorExterno colaborador = new ColaboradorExterno(
                nombre,
                servicio,
                empresa
        );

        gestorEntidades.agregarEntidad(colaborador);

        JOptionPane.showMessageDialog(
                ventanaPrincipal,
                "Colaborador externo registrado correctamente."
        );
    }

    private void mostrarEntidades() {

        JTextArea areaTexto = new JTextArea(
                gestorEntidades.mostrarTodasLasEntidades()
        );

        areaTexto.setEditable(false);
        areaTexto.setRows(15);
        areaTexto.setColumns(40);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(areaTexto);

        JOptionPane.showMessageDialog(
                ventanaPrincipal,
                scrollPane,
                "Entidades registradas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}