# Llanquihue Tour App

## Descripción
Aplicación Java desarrollada para la agencia de turismo Llanquihue Tour.

El sistema permite cargar información de tours desde un archivo externo, almacenarla en una colección dinámica y realizar búsquedas por consola. Además, en esta versión se implementó una jerarquía de clases mediante herencia simple para representar distintos tipos de servicios turísticos, reutilizando atributos y métodos de una clase base.

## Objetivo
Implementar una jerarquía de clases utilizando herencia simple, aplicando el uso de `super()` en los constructores, la sobrescritura del método `toString()` y la creación de distintos tipos de servicios turísticos.

## Funcionalidades
- Cargar datos desde el archivo `tours.txt`.
- Almacenar objetos en un `ArrayList`.
- Mostrar todos los tours disponibles.
- Buscar tours por tipo.
- Buscar tours por precio máximo.
- Aplicar composición entre las clases `Tour` y `GuiaTuristico`.
- Implementar herencia simple mediante la clase base `Tour`.
- Crear las subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.
- Utilizar `super()` en los constructores de las subclases.
- Sobrescribir el método `toString()` para mostrar la información completa de cada servicio turístico.
- Mostrar por consola instancias de cada subclase.
- Organizar el proyecto en paquetes funcionales.

## Paquetes utilizados
- `model`: contiene las clases principales del dominio (`Tour`, `RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural` y `GuiaTuristico`).
- `data`: contiene las clases `GestorDatos` y `GestorServicios`.
- `service`: contiene la clase `TourService`.
- `ui`: contiene la clase `Main`.

## Clases implementadas
- `Tour`
- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`
- `GuiaTuristico`
- `GestorDatos`
- `GestorServicios`
- `TourService`
- `Main`

## Cómo ejecutar
1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.
3. Ejecutar la clase `Main`, ubicada en el paquete `ui`.
4. Utilizar las opciones del menú para mostrar y buscar tours.
5. Seleccionar la opción **5** para visualizar los servicios turísticos implementados mediante herencia.

## Autor
**Nombre estudiante:** Alfredo Beltrán

## Declaración de integridad académica
Por la presente declaro que todo el trabajo presentado en esta actividad es de elaboración propia. Todas las fuentes utilizadas están citadas y referenciadas adecuadamente. Comprendo el valor y las consecuencias de la deshonestidad académica y me comprometo a defender los principios de integridad en todos mis esfuerzos académicos.