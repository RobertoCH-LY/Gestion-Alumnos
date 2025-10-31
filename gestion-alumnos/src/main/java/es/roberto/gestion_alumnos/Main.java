package es.roberto.gestion_alumnos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        RepositorioAlumnos repositorio = (RepositorioAlumnos) context.getBean("repositorioAlumnos");
        repositorio.clear(); // Limpieza para evitar duplicados

        AddAlumnoApp addApp = (AddAlumnoApp) context.getBean("addAlumnoApp");
        addApp.agregarAlumnos();

        System.out.println("Listado inicial de alumnos:");
        List<Alumno> alumnosInicial = repositorio.findAll();
        alumnosInicial.forEach(System.out::println);

        DeleteAlumnoApp deleteApp = (DeleteAlumnoApp) context.getBean("deleteAlumnoApp");
        deleteApp.borrarAlumno(3);

        System.out.println("\nListado de alumnos tras eliminación:");
        List<Alumno> alumnosFinal = repositorio.findAll();
        alumnosFinal.forEach(System.out::println);

        System.out.println("\nListado final de alumnos:");
        ListAlumnoApp listApp = (ListAlumnoApp) context.getBean("listAlumnoApp");
        listApp.listarAlumnos();
    }
}
