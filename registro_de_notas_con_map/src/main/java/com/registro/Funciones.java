package com.registro;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

public class Funciones {
    public static void mostrarEstudiantes(Map<String, Estudiante> estudiantes) {
        estudiantes.values().forEach(System.out::println);
    }
    public static void buscarNotaPorNombre(Map<String, Estudiante> estudiantes, String nombre) {
        Estudiante estudiante = estudiantes.get(nombre);
        if (estudiante != null) {
            System.out.println("La nota de " + nombre + " es: " + estudiante.getNota());
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
    public static void mostrarNotaMasAlta(Map<String, Estudiante> estudiantes) {
        Optional<Estudiante> estudianteConNotaMasAlta = estudiantes.values().stream()
                .max(Comparator.comparingDouble(Estudiante::getNota));
        estudianteConNotaMasAlta.ifPresent(estudiante ->
                System.out.println("El estudiante con la nota más alta es: " + estudiante));
    }
}