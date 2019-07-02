package ac.ufroagenda.Program;

import java.util.Date;

public class Test {

    private Subject subject;
    private String title;
    private Date dueDate;
    private String topics;
    
    /**
     * Constuctor vacio.
     */
    public Test(){
        subject=null;
        title="";
        dueDate=null;
        topics="";
    }
    /**
     * Constructor con todos los parámetros.
     * @param subject
     * @param title
     * @param dueDate
     * @param topics 
     */
    public Test(Subject subject, String title, Date dueDate, String topics){
        this.subject=subject;
        this.title=title;
        this.dueDate=dueDate;
        this.topics=topics;
    }
    /**
     * Extrae la asignatura relacionada con la prueba.
     * @return subject 
     */
    public Subject getSubject() {
        return subject;
    }
    /**
     * Reasigna una asignatura a la Prueba.
     * @param subject 
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    /**
     * Adquiere el titulo de la prueba.
     * @return titulo de la prueba
     */
    public String getTitle() {
        return title;
    }
    /**
     * Edita el titulo de la prueba.
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Entrega la fecha de realizacion de la prueba.
     * @return dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }
    /**
     * Edita la fecha de realizacion de una prueba.
     * @param dueDate 
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    /**
     * Regresa el String con los topicos de la prueba.
     * @return topics
     */
    public String getTopics() {
        return topics;
    }
    /**
     * Edita de los topicos de la prueba registrada.
     * @param topics 
     */
    public void setTopics(String topics) {
        this.topics = topics;
    }
}