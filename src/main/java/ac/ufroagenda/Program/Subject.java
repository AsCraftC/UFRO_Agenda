package ac.ufroagenda.Program;

public class Subject {

    private Teacher teacher;
    private final String name;
    private final String department;
    private final int code;
    private final int module;
    private boolean[][] subjectCalendar;
    
    /**
     * Constructor de la clase Subject.
     * @param name
     * @param department
     * @param code
     * @param module 
     * @param schedule 
     */
    public Subject(String name, String department, int code, int module,int[][] schedule) {
        this.teacher=null;
        this.name = name;
        this.department = department;
        this.code = code;
        this.module = module;
        this.subjectCalendar=createSubjectCalendar(schedule);
    }
    /**
     * retorna al profesor que realiza la asignatura.
     * @return teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }
    /**
     * Asigna un maestro a la asignatura.
     * @param teacher 
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    /**
     * Retorna el nombre de la asignatura.
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * Retorna el departamento encargado de la asignatura
     * @return departamento de la asignatura.
     */
    public String getDepartment() {
        return department;
    }
    /**
     * Retorna el código identificador númerico de la asignatura.
     * @return code
     */
    public int getCode() {
        return code;
    }
    /**
     * Retorna el modulo de la asignatura en cuestion
     * @return modulo de la asignatura.
     */
    public int getModule() {
        return module;
    }
    /**
     * Entrega la matriz del horario
     * @return subjectCalendar
     */
    public boolean[][] getSubjectCalendar() {
        return subjectCalendar;
    }
    /**
     * Crea un arreglo de boleanos para crear el horario a partir de un arreglo de int con coordenadas.
     * @param schedule
     * @return subjectCalendar creado
     */
    private boolean[][] createSubjectCalendar(int[][] schedule) {
        boolean[][] bSchedule = new boolean[6][10];
        for(int i=0;i<bSchedule.length;i++){
            for(int j=0;j<bSchedule[i].length;j++){
                bSchedule[i][j]=false;
                for(int k=0;k<schedule.length;k++){
                    if(schedule[k][0]==i && schedule[k][1]==1){
                        bSchedule[i][j]=true;
                    }
                }
            }
        }
        return bSchedule;
    }
}