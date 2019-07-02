/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.ufroagenda.Program;

//@author AsCraft Contreras

import java.util.ArrayList;

public class Teacher {
    
    private ArrayList<Subject> subjects;
    private final String name;
    private final String surname;
    private final String department;
    private Subject[][] teacherCalendar;

    /**
     * Constructor del la Clase Teacher
     * @param name
     * @param surname
     * @param department 
     */
    public Teacher(String name, String surname, String department) {
        this.subjects = new ArrayList<>();
        this.name = name;
        this.surname = surname;
        this.department = department;
    }
    /**
     * Agrega una asignatura a arreglo de asiganturas y acturaliza el horario.
     * @param subject 
     */
    public void addSubject(Subject subject){
        subjects.add(subject);
        createTeacherCalendar();
    }
    /**
     * Entrega en nombre del profesor
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Retorna el apellido del profesor
     * @return surname
     */
    public String getSurname() {
        return surname;
    }
    /**
     * Devueve el nombre del departamento al que pertenece.
     * @return department
     */
    public String getDepartment() {
        return department;
    }
    /**
     * Retorna el calendario del profesor.
     * @return teacherCalendar
     */
    public Subject[][] getTeacherCalendar() {
        return teacherCalendar;
    }
    /**
     * Crea el calendario con las asignaturas en el arrayList de subjects.
     */
    private void createTeacherCalendar() {
        teacherCalendar=new Subject[6][10];
        for(int i=0;i<teacherCalendar.length;i++){
            for(int j=0;j<teacherCalendar[i].length;i++){
                for(Subject e: subjects){
                    if(e.getSubjectCalendar()[i][j]){
                        teacherCalendar[i][j]=e;
                    }
                }
            }
        }
    }
       
}
