package com.registro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int cantidadEstudiantes;
        String nombre;
        double nota;
        int opcion;
        try (Scanner sc = new Scanner(System.in)) {
            Map<String, Estudiante> estudiantes = new LinkedHashMap<>();

            do {
                System.out.print("Ingresa la cantidad de estudiantes (máximo 30): ");
                cantidadEstudiantes = sc.nextInt();
                System.out.println(" ");
                sc.nextLine();
            } while (cantidadEstudiantes > 30 || cantidadEstudiantes <= 0);

            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.print("Ingresa el NOMBRE del estudiante " + (i + 1) + ": ");
                nombre = sc.nextLine();
                System.out.print("Ingresa la nota del estudiante " + (i + 1) + ": ");
                nota = sc.nextDouble();
                sc.nextLine();
                Estudiante estudiante = new Estudiante(nombre, nota);
                estudiantes.put(nombre, estudiante);
            }
            do {
                System.out.println("""
                        Opciones:
                        1- Mostrar los estudiantes.
                        2- Buscar la nota de un estudiante por el nombre.
                        3- Nota mas alta.
                        4- Salir.
                        """);
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\n|| Lista de estudiantes y sus notas: ||");
                        Funciones.mostrarEstudiantes(estudiantes);
                        break;
                    case 2:
                        System.out.print("||Busqueda de estudiante por nombre|| \nIngresa el nombre del estudiante: ");
                        String nombreBusqueda = sc.nextLine();
                        Funciones.buscarNotaPorNombre(estudiantes, nombreBusqueda);
                        break;
                    case 3:
                        System.out.println("\n|| Estudiante con la nota más alta: || ");
                        Funciones.mostrarNotaMasAlta(estudiantes);
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } while (opcion != 4);

        }
    }
}