package ac.ufroagenda.Program;

import java.util.*;

public class Profile {

    private ArrayList<Subject> subjects;
    private Degree degree;
    private ArrayList<Homework> homeworks;
    private ArrayList<Test> tests;
    private String name;
    private final String enrollment;
    private Subject[][] profileCalendar;

    /**
     * Constructor que se ejecutará cuando se extraiga la informacion de un archivo guardado.
     * @param subjects Arreglo creado en clase DataBase
     * @param degree Degree seleccionado en DataBase
     * @param homeworks Arreglo creado en DataBase
     * @param tests Arreglo creado en DataBase
     * @param name String directo de la base de datos
     * @param enrollment String directo de la base de datos.
     */
    public Profile(ArrayList<Subject> subjects, Degree degree, ArrayList<Homework> homeworks, ArrayList<Test> tests, String name, String enrollment) {
        this.subjects = subjects;
        this.degree = degree;
        this.homeworks = homeworks;
        this.tests = tests;
        this.name = name;
        this.enrollment = enrollment;
        makeProfileCalendar();
    }
    /**
     * Constructor para creacion de perfiles dentro de la app.
     * @param degree
     * @param name
     * @param enrollment 
     */
    public Profile(Degree degree, String name, String enrollment){
        this.subjects=new ArrayList<>();
        this.degree=degree;
        this.homeworks=new ArrayList<>();
        this.tests=new ArrayList<>();
        this.name=name;
        this.enrollment=enrollment;
    }
    /**
     * Entrega el arreglo de asignaturas actuales.
     * @return subjects
     */
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    /**
     * Agrega una asignatura al perfil y actualiza el horario.
     * @param subject 
     */
    public void addSubjects(Subject subject) {
        subjects.add(subject);
        makeProfileCalendar();
    }
    /**
     * Remueve una asignatura de arreglo de asignaturas y actualiza el horario.
     * @param subject 
     */
    public void removeSubject(Subject subject){
        subjects.remove(subject);
        makeProfileCalendar();
    }
    /**
     * Devuelve la carrera del perfil.
     * @return degree
     */
    public Degree getDegree() {
        return degree;
    }
    /**
     * Cambia la carrera de un perfil borrando las tareas, pruebas, asignaturas y horario anteriormente registrado.
     * @param degree 
     */
    public void setDegree(Degree degree) {
        this.degree = degree;
        subjects.removeAll(subjects);
        tests.removeAll(tests);
        homeworks.removeAll(homeworks);
        profileCalendar=new Subject[6][10];
    }
    /**
     * Retorna la lista de tareas registradas.
     * @return homeworks
     */
    public ArrayList<Homework> getHomeworks() {
        return homeworks;
    }
    /**
     * Agrega una tarea al arreglo de tareas del perfil.
     * @param homework 
     */
    public void addHomework(Homework homework) {
        this.homeworks.add(homework);
    }
    /**
     * Elimina una tarea del arreglo de tareas.
     * @param homework Tarea a eliminar.
     */
    public void deleteHomework(Homework homework){
        homeworks.add(homework);
    }
    /**
     * Entrega el arreglo de pruebas registradas en el perfil.
     * @return Tests
     */
    public ArrayList<Test> getTests() {
        return tests;
    }
    /**
     * Agrega una prueba al arreglo de pruebas.
     * @param test prueba a agregar
     */
    public void addTest(Test test) {
        this.tests.add(test);
    }
    /**
     * Remueve la prueba que se pasa por parámetro.
     * @param test Prueba a eliminar
     */
    public void removeTest (Test test){
        this.tests.remove(test);
    }
    /**
     * Retorna el nombre del perfil.
     * @return nombre del perfil.
     */
    public String getName() {
        return name;
    }
    /**
     * Edita el nombre del perfil del usuario.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Adquiere la matricula del perfil.
     * @return enrollment
     */
    public String getEnrollment() {
        return enrollment;
    }
    /**
     * Adquiere el horario del perfil.
     * @return profileCalendar
     */
    public Subject[][] getProfileCalendar() {
        return profileCalendar;
    }
    /**
     * Crea el horario del perfil a travez de las asignaturas inscritas.
     */
    public void makeProfileCalendar() {
        profileCalendar=new Subject[6][10];
        for(int i=0;i<profileCalendar.length;i++){
            for(int j=0;j<profileCalendar[i].length;i++){
                for(Subject e: subjects){
                    if(e.getSubjectCalendar()[i][j]){
                        profileCalendar[i][j]=e;
                    }
                }
            }
        }
    }
}