# Llanquihue Tour App

## Descripción
Aplicación Java desarrollada para la agencia de turismo Llanquihue Tour.  
El sistema permite cargar información de tours desde un archivo externo, almacenarla en una colección dinámica y realizar búsquedas simples por consola.

## Funcionalidades
- Cargar datos desde archivo `tours.txt`.
- Almacenar objetos en un `ArrayList`.
- Mostrar todos los tours disponibles.
- Buscar tours por tipo.
- Buscar tours por precio máximo.
- Aplicar composición entre las clases `Tour` y `GuiaTuristico`.
- Organizar el proyecto en paquetes funcionales.

## Paquetes utilizados
- `model`: contiene las clases principales del dominio, como `Tour` y `GuiaTuristico`.
- `data`: contiene la clase `GestorDatos`, encargada de leer el archivo externo.
- `service`: contiene la clase `TourService`, encargada de mostrar y filtrar información.
- `ui`: contiene la clase `Main`, desde donde se ejecuta el programa.

## Clases implementadas
- `Tour`
- `GuiaTuristico`
- `GestorDatos`
- `TourService`
- `Main`

## Cómo ejecutar
1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` esté dentro de la carpeta `resources`.
3. Ejecutar la clase `Main`, ubicada en el paquete `ui`.
4. Usar el menú de consola para mostrar o buscar tours.

## Autor
Nombre estudiante: Alfredo Beltrán

## Declaración de integridad académica
Por la presente declaro que todo el trabajo presentado en esta actividad es de elaboración propia. Todas las fuentes utilizadas están citadas y referenciadas adecuadamente. Comprendo el valor y las consecuencias de la deshonestidad académica y me comprometo a defender los principios de integridad en todos mis esfuerzos académicos.