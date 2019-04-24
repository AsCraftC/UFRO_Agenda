package ac.ufroagenda;

//@author AsCraft Contreras

import java.util.ArrayList;

public class Lugar {
    private String nombre;
    private String dep;
    private int codigo;
    private boolean esSala;
    private Horario horario;
    private ArrayList<Asignatura> asiganturas;

    public Lugar(String nombre, String dep, int codigo, boolean esSala, Horario horario, ArrayList<Asignatura> asiganturas) {
        this.nombre = nombre;
        this.dep = dep;
        this.codigo = codigo;
        this.esSala = esSala;
        this.horario = horario;
        this.asiganturas = asiganturas;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDep() {
        return dep;
    }
    public int getCodigo() {
        return codigo;
    }
    public boolean isEsSala() {
        return esSala;
    }
    public Horario getHorario() {
        return horario;
    }
    public ArrayList<Asignatura> getAsiganturas() {
        return asiganturas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setEsSala(boolean esSala) {
        this.esSala = esSala;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    public void setAsiganturas(ArrayList<Asignatura> asiganturas) {
        this.asiganturas = asiganturas;
    }

    @Override
    public String toString() {
        return nombre+","+dep+","+codigo+","+esSala+","+horario+","+asiganturas;
    }
    
}
