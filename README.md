# Llanquihue Tour App

## Descripción

Aplicación Java desarrollada para la agencia de turismo Llanquihue Tour.

El sistema permite gestionar información relacionada con servicios turísticos y diferentes entidades de la agencia. El proyecto integra conceptos de programación orientada a objetos como composición, herencia, polimorfismo, interfaces, colecciones genéricas y clasificación de objetos mediante `instanceof`.

En esta versión se incorporó una interfaz común llamada `Registrable`, implementada por distintos tipos de entidades, además de una interfaz gráfica desarrollada con Java Swing para registrar y visualizar información.

## Objetivo

Integrar los conceptos fundamentales de programación orientada a objetos mediante el uso de interfaces, herencia, polimorfismo, colecciones genéricas, `instanceof` e interfaz gráfica.

El sistema permite almacenar distintos tipos de objetos dentro de una colección común, identificar su tipo en tiempo de ejecución y mostrar la información correspondiente de cada entidad.

## Funcionalidades

- Cargar datos de tours desde el archivo `tours.txt`.
- Almacenar objetos `Tour` en un `ArrayList`.
- Mostrar todos los tours disponibles.
- Buscar tours por tipo.
- Buscar tours por precio máximo.
- Aplicar composición entre las clases `Tour` y `GuiaTuristico`.
- Implementar herencia mediante la clase base `Tour`.
- Utilizar las subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.
- Aplicar polimorfismo mediante una colección `List<Tour>`.
- Recorrer servicios turísticos mediante referencias de la clase base.
- Implementar la interfaz común `Registrable`.
- Implementar `Registrable` en las clases `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno`.
- Utilizar una colección `ArrayList<Registrable>` para almacenar diferentes tipos de entidades.
- Clasificar objetos mediante el operador `instanceof`.
- Utilizar `instanceof` con `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno`.
- Registrar entidades mediante una interfaz gráfica.
- Mostrar las entidades registradas mediante una interfaz gráfica.
- Utilizar componentes de Java Swing como `JOptionPane`, `JTextArea` y `JScrollPane`.
- Organizar el proyecto mediante paquetes funcionales.

## Interfaz Registrable

La interfaz `Registrable` define el método:

```java
String mostrarResumen();
```

Este método permite establecer un comportamiento común para diferentes tipos de entidades.

Las clases que implementan la interfaz son:

- `GuiaTuristico`
- `Vehiculo`
- `ColaboradorExterno`

Cada clase implementa su propia versión del método `mostrarResumen()`.

## Herencia y polimorfismo

La clase `Tour` funciona como clase base de la jerarquía de servicios turísticos.

Las siguientes clases heredan de `Tour`:

- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`

Las subclases utilizan `super()` en sus constructores y sobrescriben métodos de la clase base.

Además, se utiliza una colección:

```java
List<Tour>
```

para almacenar diferentes tipos de servicios turísticos y recorrerlos mediante referencias de la clase base.

## Colección de entidades

Para almacenar distintos tipos de entidades se utiliza:

```java
ArrayList<Registrable>
```

Esta colección permite almacenar objetos de las clases:

- `GuiaTuristico`
- `Vehiculo`
- `ColaboradorExterno`

Los objetos son clasificados mediante el operador `instanceof` para identificar su tipo real y mostrar la información correspondiente.

## Interfaz gráfica

La aplicación incluye una interfaz gráfica desarrollada con Java Swing.

Desde la opción de gestión de entidades es posible:

1. Registrar un guía turístico.
2. Registrar un vehículo.
3. Registrar un colaborador externo.
4. Mostrar todas las entidades registradas.
5. Salir de la gestión de entidades.

La interfaz utiliza componentes como:

- `JOptionPane`
- `JTextArea`
- `JScrollPane`
- `JFrame`

## Paquetes utilizados

### `model`

Contiene las clases e interfaces principales del dominio:

- `Tour`
- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`
- `GuiaTuristico`
- `Vehiculo`
- `ColaboradorExterno`
- `Registrable`

### `data`

Contiene las clases encargadas de la gestión de datos y colecciones:

- `GestorDatos`
- `GestorServicios`
- `GestorEntidades`

### `service`

Contiene la lógica relacionada con la búsqueda y visualización de tours:

- `TourService`

### `ui`

Contiene las clases relacionadas con la interacción con el usuario:

- `Main`
- `VentanaEntidades`

## Clases e interfaces implementadas

- `Tour`
- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`
- `GuiaTuristico`
- `Vehiculo`
- `ColaboradorExterno`
- `Registrable`
- `GestorDatos`
- `GestorServicios`
- `GestorEntidades`
- `TourService`
- `VentanaEntidades`
- `Main`

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.
3. Ejecutar la clase `Main`, ubicada en el paquete `ui`.
4. Utilizar el menú principal para acceder a las funcionalidades del sistema.

### Opciones principales

- **Opción 1:** Mostrar todos los tours.
- **Opción 2:** Buscar tours por tipo.
- **Opción 3:** Buscar tours por precio máximo.
- **Opción 4:** Salir del sistema.
- **Opción 5:** Mostrar servicios utilizando polimorfismo.
- **Opción 6:** Abrir la gestión de entidades mediante interfaz gráfica.

En la opción **6** se pueden registrar guías turísticos, vehículos y colaboradores externos, además de visualizar todas las entidades registradas.

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos
- Java Swing
- IntelliJ IDEA
- Git y GitHub

## Autor

**Nombre estudiante:** Alfredo Beltrán
