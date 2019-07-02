package ac.ufroagenda.Program;

import java.util.Date;

public class Homework {
    
    private static final int NORMAL = 0;
    private static final int MEDIUM = 1;
    private static final int HIGH = 2;
    private Subject subject;
    private String title;
    private String description;
    private Date dueDate;
    private int priority;
    
    /**
     * Constructor sin parámetros.
     */
    public Homework(){
        subject=null;
        title="";
        description="";
        dueDate=null;
        priority=Homework.NORMAL;
    }
    /**
     * Constructor de la clase Homrework
     * @param subject
     * @param title
     * @param description
     * @param dueDate
     * @param priority 
     */
    public Homework(Subject subject, String title, String description, Date dueDate, int priority) {
        this.subject = subject;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }
    /**
     * Devuelve la asignatura a al que pertenece la tarea.
     * @return Asignatura ligada a la tarea.
     */
    public Subject getSubject() {
        return subject;
    }
    /**
     * Reasigna una asignatura a la tarea.
     * @param subject 
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    /**
     * Extrae el nombre de la actividad.
     * @return titulo de la actividad.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Reasignar o editar el titulo de la actividad.
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Devuelve la descripcion de la actividad.
     * @return description de la actividad.
     */
    public String getDescription() {
        return description;
    }
    /**
     * Editar la descipción de la actividad.
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * retorna el objeto dueDate de la clase Homework.
     * @return 
     */
    public Date getDueDate() {
        return dueDate;
    }
    /**
     * Edita la fecha de entrega de tarea
     * @param dueDate 
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    /**
     * Obtiene la prioridad de la tarea.
     * @return int con la prioridad.
     */
    public int getPriority() {
        return priority;
    }
    /**
     * Cambiar la prioridad de la tarea.
     * @param priority 
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }    
}