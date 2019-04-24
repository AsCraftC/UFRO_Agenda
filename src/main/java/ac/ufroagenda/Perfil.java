package ac.ufroagenda;

//@author AsCraft Contreras

import java.util.ArrayList;

public class Perfil {
    private String nombre;
    private Horario horario;
    private Carrera carrera;
    private ArrayList<Asignatura> asignaturas;

    public Perfil(String nombre, Horario horario, Carrera carrera, ArrayList<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.horario = horario;
        this.carrera = carrera;
        this.asignaturas = asignaturas;
    }
    public String getNombre() {
        return nombre;
    }
    public Horario getHorario() {
        return horario;
    }
    public Carrera getCarrera() {
        return carrera;
    }
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
}
