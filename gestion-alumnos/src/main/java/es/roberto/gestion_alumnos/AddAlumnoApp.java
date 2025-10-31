package es.roberto.gestion_alumnos;

public class AddAlumnoApp {
    private RepositorioAlumnos repositorio;

    public void setRepositorio(RepositorioAlumnos repositorio) {
        this.repositorio = repositorio;
    }

    public void agregarAlumnos() {
        repositorio.add(new Alumno(1, "Roberto", "roberto@ejemplo.com"));
        repositorio.add(new Alumno(2, "Ana", "ana@ejemplo.com"));
        repositorio.add(new Alumno(3, "Alex", "alex@ejemplo.com"));
        System.out.println("Alumnos agregados.\n");
    }

}
