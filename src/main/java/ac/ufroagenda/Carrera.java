/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.ufroagenda;

//@author AsCraft Contreras
public class Carrera {
    private String Nombre;
    private Asignatura[] asignaturas;

    public Carrera(String Nombre, Asignatura[] asignaturas) {
        this.Nombre = Nombre;
        this.asignaturas = asignaturas;
    }
    public String getNombre() {
        return Nombre;
    }
    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return Nombre + "," + asignaturas;
    }
    
    
}
