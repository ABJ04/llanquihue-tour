# Llanquihue Tour App

## Descripción
Proyecto Java desarrollado para la actividad de la semana 4 de Desarrollo Orientado a Objetos I.
El programa lee datos desde un archivo `tours.txt`, crea objetos de la clase `Tour`, los almacena en un `ArrayList`, muestra todos los tours y filtra los tours de tipo gastronómico.

## Estructura de carpetas

```text
llanquihue-tour/
├── src/
│   ├── model/
│   │   └── Tour.java
│   ├── data/
│   │   └── GestorDatos.java
│   └── ui/
│       └── Main.java
├── resources/
│   └── tours.txt
└── README.md
```

## Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` esté dentro de la carpeta `resources`.
3. Ejecutar la clase `Main`, ubicada en `src/ui/Main.java`.

## Formato del archivo tours.txt

Cada línea tiene los datos separados por punto y coma:

```text
nombre;tipo;duracionHoras;precio
```

Ejemplo:

```text
Ruta Sabores del Lago;gastronomico;4;35000
```
