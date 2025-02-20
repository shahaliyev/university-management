import java.util.List;

public class PhDStudents extends Student{

    

    PhDStudents(String name, int id, int coursesCovered, double cgpa, String major, List<String> subjects,
        boolean onProbation, int semester) {
        super(name, id, coursesCovered, cgpa, major, subjects, onProbation, semester);
    }

    
}