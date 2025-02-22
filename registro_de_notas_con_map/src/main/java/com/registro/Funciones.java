package com.registro;

import java.util.Map;

public class Funciones {
    public static void mostrarEstudiantes(Map<String, Estudiante> lista) {
        for (Map.Entry<String, Estudiante> entry : lista.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}