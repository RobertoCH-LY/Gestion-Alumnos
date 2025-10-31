package es.roberto.gestion_alumnos;

import java.util.List;

public class ListAlumnoApp {
    private RepositorioAlumnos repositorio;

    public void setRepositorio(RepositorioAlumnos repositorio) {
        this.repositorio = repositorio;
    }

    public void listarAlumnos() {
        List<Alumno> alumnos = repositorio.findAll();
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            alumnos.forEach(System.out::println);
        }
    }
}
