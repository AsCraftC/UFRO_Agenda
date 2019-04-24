/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.ufroagenda;

//@author AsCraft Contreras

import java.util.Date;

public class Tarea {
    private String nombre;
    private Asignatura asignatura;
    private Date fechaEntrega;
    private String Descripcion;

    public String getNombre() {
        return nombre;
    }
    public Asignatura getAsignatura() {
        return asignatura;
    }
    public Date getFechaEntrega() {
        return fechaEntrega;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
