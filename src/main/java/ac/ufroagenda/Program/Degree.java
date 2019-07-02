package ac.ufroagenda.Program;

import java.util.ArrayList;

public class Degree {

    private ArrayList<Subject> subjects;
    private final String name;
    private final int code;

    /**
     * Constructor de la clase Deggre.
     * @param name
     * @param code 
     */
    public Degree(String name, int code) {
        this.subjects = new ArrayList<>();
        this.name = name;
        this.code = code;
    }
    /**
     * Estrae el arreglo con las asignaturas de la carrera.
     * @return subjects
     */
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    /**
     * Al entregarle un número te devuelve la asignatura seleccionada.
     * @param n (Posicion de la asignatura)
     * @return Asignatura en la posicion n
     */
    public Subject getSubjects(int n) {
        return subjects.get(n-1);
    }
    /**
     * Agrega una asignatura a la lista de asignaturas de la carrera.
     * @param subject 
     */
    public void addSubjects(Subject subject) {
        this.subjects.add(subject);
    }
    /** 
     * Entrega en nombre de la asignatura.
     * @return nombre de la carrera.
     */
    public String getName() {
        return name;
    }
    /**
     * designa un string como nombre.
     * Sabes... La idea de morir no es tan descabella.
     * @param name
     * @return Codigo númerico de la carrera.
     */
    public int getCode() {
        return code;
    }
}