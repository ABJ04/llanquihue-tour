# Llanquihue Tour

## Descripción

Llanquihue Tour es una aplicación desarrollada en Java que permite gestionar los servicios turísticos de una agencia de turismo mediante la aplicación de los principales conceptos de Programación Orientada a Objetos (POO).

El sistema administra distintos tipos de tours, permite cargar información desde un archivo de texto, realizar búsquedas, registrar entidades mediante una interfaz gráfica desarrollada con Java Swing y validar los datos ingresados utilizando una excepción personalizada.

---

# Objetivo

Desarrollar un sistema orientado a objetos que integre los principales conceptos de la POO, tales como:

- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Composición.
- Interfaces.
- Colecciones genéricas.
- Sobrescritura de métodos.
- Manejo de excepciones.
- Lectura de archivos.
- Interfaz gráfica.

---

# Funcionalidades

El sistema permite:

- Cargar tours desde el archivo `tours.txt`.
- Almacenar objetos `Tour` en una colección `ArrayList`.
- Mostrar todos los tours disponibles.
- Buscar tours por tipo.
- Buscar tours por precio máximo.
- Aplicar composición entre `Tour` y `GuiaTuristico`.
- Implementar herencia mediante la clase base `Tour`.
- Utilizar las clases derivadas:
    - `RutaGastronomica`
    - `PaseoLacustre`
    - `ExcursionCultural`
- Aplicar polimorfismo utilizando una colección `List<Tour>`.
- Implementar la interfaz `Registrable`.
- Registrar:
    - Guías turísticos.
    - Vehículos.
    - Colaboradores externos.
- Almacenar entidades en una colección `ArrayList<Registrable>`.
- Clasificar objetos utilizando `instanceof`.
- Registrar entidades mediante una interfaz gráfica desarrollada con Java Swing.
- Mostrar todas las entidades registradas.

---

# Programación Orientada a Objetos aplicada

## Encapsulamiento

Todas las clases utilizan atributos privados (`private`) y métodos getters y setters para controlar el acceso a la información.

---

## Herencia

La clase base del sistema es:

- `Tour`

De ella heredan:

- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`

---

## Polimorfismo

Los diferentes tipos de tours son almacenados dentro de una colección:

```java
List<Tour>
```

permitiendo recorrerlos mediante referencias de la clase padre.

---

## Composición

La clase `Tour` contiene un objeto de tipo:

```java
GuiaTuristico
```

estableciendo una relación de composición.

---

## Interfaces

Se implementa la interfaz:

```java
Registrable
```

La cual define el método:

```java
String mostrarResumen();
```

Esta interfaz es implementada por:

- `GuiaTuristico`
- `Vehiculo`
- `ColaboradorExterno`

---

## Colecciones Genéricas

El sistema utiliza:

```java
ArrayList<Tour>
```

para almacenar los tours.

Además utiliza:

```java
ArrayList<Registrable>
```

para almacenar distintos tipos de entidades.

---

## instanceof

Para identificar el tipo real de cada objeto almacenado en la colección de entidades se utiliza el operador:

```java
instanceof
```

permitiendo diferenciar:

- Guías turísticos.
- Vehículos.
- Colaboradores externos.

---

# Manejo de excepciones

El proyecto incorpora una excepción personalizada llamada:

```java
DatoInvalidoException
```

Esta excepción permite validar la información ingresada por el usuario antes de registrar una entidad.

Las validaciones implementadas incluyen:

### Guías turísticos

- El nombre no puede estar vacío.
- Los años de experiencia no pueden ser negativos.

### Vehículos

- La patente no puede estar vacía.
- El modelo no puede estar vacío.
- La capacidad debe ser mayor que cero.

### Colaboradores externos

- El nombre no puede estar vacío.
- El servicio no puede estar vacío.
- La empresa no puede estar vacía.

Cuando una validación falla, el sistema informa el error mediante un `JOptionPane` y evita registrar el objeto.

---

# Lectura de archivos

Los tours se cargan automáticamente desde el archivo:

```text
resources/tours.txt
```

La lectura del archivo permite crear objetos `Tour` y almacenarlos en memoria para su posterior consulta.

---

# Interfaz gráfica

El proyecto incorpora una interfaz desarrollada con Java Swing.

Desde ella es posible:

1. Registrar un guía turístico.
2. Registrar un vehículo.
3. Registrar un colaborador externo.
4. Mostrar todas las entidades registradas.
5. Salir del sistema.

La interfaz utiliza componentes como:

- JFrame
- JOptionPane
- JTextArea
- JScrollPane

---

# Organización del proyecto

## model

Contiene las clases del dominio del sistema.

- Tour
- RutaGastronomica
- PaseoLacustre
- ExcursionCultural
- GuiaTuristico
- Vehiculo
- ColaboradorExterno
- Registrable

---

## data

Contiene las clases responsables del almacenamiento y administración de los datos.

- GestorDatos
- GestorServicios
- GestorEntidades

---

## service

Contiene la lógica de negocio del sistema.

- TourService

---

## ui

Contiene las clases relacionadas con la interacción con el usuario.

- Main
- VentanaEntidades

---

## exceptions

Contiene las excepciones personalizadas del sistema.

- DatoInvalidoException

---

# Clases implementadas

- Tour
- RutaGastronomica
- PaseoLacustre
- ExcursionCultural
- GuiaTuristico
- Vehiculo
- ColaboradorExterno
- Registrable
- GestorDatos
- GestorServicios
- GestorEntidades
- TourService
- VentanaEntidades
- Main
- DatoInvalidoException

---

# Cómo ejecutar el proyecto

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.
3. Ejecutar la clase `Main`.
4. Utilizar el menú principal del sistema.

---

# Menú principal

1. Mostrar todos los tours.
2. Buscar tours por tipo.
3. Buscar tours por precio máximo.
4. Salir.
5. Mostrar tours utilizando polimorfismo.
6. Abrir la gestión de entidades mediante interfaz gráfica.

Dentro de la opción **6** es posible registrar guías turísticos, vehículos y colaboradores externos, además de visualizar todas las entidades registradas.

---

# Tecnologías utilizadas

- Java
- Java Swing
- IntelliJ IDEA
- Programación Orientada a Objetos
- Colecciones Genéricas
- Manejo de Excepciones
- Lectura de archivos TXT
- Git
- GitHub

---

# Autor

**Nombre:** Alfredo Beltrán

**Asignatura:** Desarrollo Orientado a Objetos I