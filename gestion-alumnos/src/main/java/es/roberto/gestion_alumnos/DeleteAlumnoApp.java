package es.roberto.gestion_alumnos;

public class DeleteAlumnoApp {
    private final RepositorioAlumnos repositorio;

    public DeleteAlumnoApp(RepositorioAlumnos repositorio) {
        this.repositorio = repositorio;
    }

    public void borrarAlumno(int id) {
        boolean eliminado = repositorio.delete(id);
        if (eliminado) {
            System.out.println("\nAlumno con ID " + id + " eliminado.");
        } else {
            System.out.println("\nAlumno con ID " + id + " no encontrado.");
        }
    }
}
