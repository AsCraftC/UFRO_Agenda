/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.ufroagenda;

//@author AsCraft Contreras

import java.util.Date;

public class Evaluacion {
    private String nombre;
    private Asignatura asignatura;
    private Date fechaRealizar;
    private int prioridad;
    private String planAccion;

    public Evaluacion(String nombre, Asignatura asignatura, Date fechaRealizar, int prioridad, String planAccion) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.fechaRealizar = fechaRealizar;
        this.prioridad = prioridad;
        this.planAccion = planAccion;
    }
    public String getNombre() {
        return nombre;
    }
    public Asignatura getAsignatura() {
        return asignatura;
    }
    public Date getFechaRealizar() {
        return fechaRealizar;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public String getPlanAccion() {
        return planAccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    public void setFechaRealizar(Date fechaRealizar) {
        this.fechaRealizar = fechaRealizar;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public void setPlanAccion(String planAccion) {
        this.planAccion = planAccion;
    }
    
    
}
