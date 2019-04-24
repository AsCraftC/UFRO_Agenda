/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.ufroagenda;

//@author AsCraft Contreras
public class Asignatura {
    private String nombre;
    private String dep;
    private int codigo;
    private int modulo;

    public Asignatura(String nombre, String dep, int codigo, int modulo) {
        this.nombre = nombre;
        this.dep = dep;
        this.codigo = codigo;
        this.modulo = modulo;
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
    public int getModulo() {
        return modulo;
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
    public void setModulo(int modulo) {
        this.modulo = modulo;
    }
    
}
