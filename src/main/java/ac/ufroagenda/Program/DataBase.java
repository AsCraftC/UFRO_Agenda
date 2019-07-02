package ac.ufroagenda.Program;

import java.util.ArrayList;
import ac.ufroagenda.DataManaging.DataReader;

public class DataBase {

    private static ArrayList<Subject> subjects;
    private static ArrayList<Degree> Degrees;
    private static ArrayList<Profile> Profiles;
    
    public void makeSubjects() {
    	DataReader reader = new DataReader("Data/Subjects.txt");
        String[] SubjectsData = reader.readFile().split("\n");
        for(String e: SubjectsData){
            
        }
    }
    
    public void makeDegrees() {
        
    }

    public void makeTeachers(){
    
    }
    
    public void makeProfiles() {
	
    }

}