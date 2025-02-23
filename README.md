# Registro de Estudiantes en Java 🎓📊

Este programa en Java permite gestionar un registro de estudiantes, almacenando sus nombres y notas. El usuario puede agregar estudiantes, mostrar la lista completa, buscar la nota de un estudiante por su nombre y encontrar al estudiante con la nota más alta.

## Características principales ✨

- **Agregar estudiantes**: Permite al usuario ingresar el nombre y la nota de cada estudiante (máximo 30).
- **Mostrar estudiantes**: Muestra la lista completa de estudiantes con sus notas.
- **Buscar nota por nombre**: Permite buscar la nota de un estudiante específico.
- **Nota más alta**: Muestra al estudiante con la nota más alta.
- **Validación de entradas**: Asegura que las entradas del usuario sean válidas.

## ¿Cómo funciona? ⚙️

1. El programa solicita al usuario que ingrese la cantidad de estudiantes (máximo 30).
2. Para cada estudiante, se pide el nombre y la nota.
3. Los datos se almacenan en un `LinkedHashMap<String, Estudiante>`, que mantiene el orden de inserción.
4. El programa muestra un menú con las siguientes opciones:
   - **Mostrar los estudiantes**: Muestra la lista completa de estudiantes y sus notas.
   - **Buscar la nota de un estudiante por el nombre**: Permite buscar la nota de un estudiante específico.
   - **Nota más alta**: Muestra al estudiante con la nota más alta.
   - **Salir**: Termina la ejecución del programa.

## Ejemplo de uso 🖥️

### Agregar estudiantes:

````bash
Ingresa la cantidad de estudiantes (máximo 30): 3

Ingresa el NOMBRE del estudiante 1: Juan
Ingresa la nota del estudiante 1: 8.5

Ingresa el NOMBRE del estudiante 2: María
Ingresa la nota del estudiante 2: 9.0

Ingresa el NOMBRE del estudiante 3: Pedro
Ingresa la nota del estudiante 3: 7.8
````

### Menú de opciones:
````bash
Opciones:
1- Mostrar los estudiantes.
2- Buscar la nota de un estudiante por el nombre.
3- Nota mas alta.
4- Salir.
````

### Mostrar estudiantes:
````bash
|| Lista de estudiantes y sus notas: ||

Juan: 8.5

María: 9.0

Pedro: 7.8
````

### Buscar nota por nombre:
````bash
|| Busqueda de estudiante por nombre ||
Ingresa el nombre del estudiante: María
La nota de María es: 9.0
````

### Nota más alta:
````bash
|| Estudiante con la nota más alta: ||

María: 9.0
````

### Salir:
````bash
Saliendo...
````

## Requisitos 📋

- **Java JDK**: Asegúrate de tener Java JDK instalado (versión 8 o superior).
- **IDE o editor de texto**: Puedes usar IntelliJ, Eclipse, VS Code o cualquier editor de tu preferencia.

## ¿Cómo ejecutar el programa? �

1. Clona este repositorio o copia el código en tu entorno de desarrollo.
2. Compila y ejecuta el archivo `Main.java`.
3. Sigue las instrucciones en la consola para gestionar el registro de estudiantes.

## Estructura del proyecto 🗂️

- **Main.java**: Contiene el menú principal y la lógica de interacción con el usuario.
- **Estudiante.java**: Representa la clase `Estudiante` con atributos `nombre` y `nota`.
- **Funciones.java**: Contiene las funciones para mostrar estudiantes, buscar notas y encontrar la nota más alta.

## Contribuciones 🤝

Si encuentras algún error o tienes alguna mejora, ¡no dudes en abrir un issue o enviar un pull request! Todas las contribuciones son bienvenidas.

---

## �‍💻 **Autor**
* [AyelmerCorzoB](https://github.com/AyelmerCorzoB)

---
