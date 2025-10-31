package es.roberto.gestion_alumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositorioAlumnos {
    private List<Alumno> listaAlumnos = new ArrayList<>();

    public void add(Alumno a) {
        boolean existe = listaAlumnos.stream()
                .anyMatch(al -> al.getId() == a.getId());
        if (!existe) {
            listaAlumnos.add(a);
        }
    }

    public void clear() {
        listaAlumnos.clear();
    }

    public boolean delete(int id) {
        return listaAlumnos.removeIf(a -> a.getId() == id);
    }

    public List<Alumno> findAll() {
        return listaAlumnos;
    }

    public Optional<Alumno> findById(int id) {
        return listaAlumnos.stream().filter(a -> a.getId() == id).findFirst();
    }
}
