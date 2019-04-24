/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.ufroagenda;

//@author AsCraft Contreras
public class Profesor {
    private String nombre;
    private String apellido;
    private String dep;
    private Lugar oficina;

    public Profesor(String nombre, String apellido, String dep, Lugar oficina) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dep = dep;
        this.oficina = oficina;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDep() {
        return dep;
    }
    public Lugar getOficina() {
        return oficina;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    public void setOficina(Lugar oficina) {
        this.oficina = oficina;
    }

    @Override
    public String toString() {
        return nombre+","+apellido+","+dep+","+oficina;
    }
    
}
