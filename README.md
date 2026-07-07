# Llanquihue Tour App

## Descripción

Aplicación Java desarrollada para la agencia de turismo Llanquihue Tour.

El sistema permite cargar información de tours desde un archivo externo, almacenarla en una colección dinámica y realizar búsquedas por consola. Además, en esta versión se incorporó el uso de polimorfismo y colecciones genéricas, permitiendo almacenar distintos tipos de servicios turísticos en una misma colección y recorrerlos mediante referencias de la clase base.

## Objetivo

Implementar polimorfismo y colecciones genéricas sobre la jerarquía de clases desarrollada anteriormente, utilizando una colección de tipo `List<Tour>`, sobrescribiendo el método `mostrarInformacion()` y recorriendo los objetos mediante referencias de la superclase.

## Funcionalidades

* Cargar datos desde el archivo `tours.txt`.
* Almacenar objetos en un `ArrayList`.
* Mostrar todos los tours disponibles.
* Buscar tours por tipo.
* Buscar tours por precio máximo.
* Aplicar composición entre las clases `Tour` y `GuiaTuristico`.
* Implementar herencia simple mediante la clase base `Tour`.
* Crear las subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.
* Utilizar `super()` en los constructores de las subclases.
* Sobrescribir el método `toString()` en las subclases.
* Implementar el método `mostrarInformacion()` en la clase base `Tour`.
* Sobrescribir `mostrarInformacion()` en cada subclase.
* Crear una colección polimórfica `List<Tour>` con distintos tipos de servicios turísticos.
* Recorrer la colección utilizando un ciclo `for-each`.
* Aplicar polimorfismo llamando al método `mostrarInformacion()` desde referencias de la clase base.
* Organizar el proyecto en paquetes funcionales.

## Paquetes utilizados

* `model`: contiene las clases `Tour`, `RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural` y `GuiaTuristico`.
* `data`: contiene las clases `GestorDatos` y `GestorServicios`.
* `service`: contiene la clase `TourService`.
* `ui`: contiene la clase `Main`.

## Clases implementadas

* `Tour`
* `RutaGastronomica`
* `PaseoLacustre`
* `ExcursionCultural`
* `GuiaTuristico`
* `GestorDatos`
* `GestorServicios`
* `TourService`
* `Main`

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.
3. Ejecutar la clase `Main`, ubicada en el paquete `ui`.
4. Utilizar las opciones del menú para mostrar, buscar y gestionar los tours.
5. Seleccionar la opción **5** para visualizar la colección de servicios turísticos aplicando polimorfismo.

## Autor

**Nombre estudiante:** Alfredo Beltrán
