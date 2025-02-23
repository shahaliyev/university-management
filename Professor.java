import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Faculty {
    private List<String> researchPapers;
    private List<Student> assignedStudents;


    public Professor(int facultyID, String firstName, String secondName, String email, String phoneNumber, String department,String position, String officeLocation, List<String> coursesTaught, List<String> researchPapers, List<Student> assignedStudents ) {
        super(firstName, secondName, email, phoneNumber, department, position, officeLocation, coursesTaught);
        this.researchPapers = researchPapers;
        this.assignedStudents = assignedStudents;
    }s

    public void teachCourse(String course) {
        if (course != null && !course.isEmpty()) {
            coursesTaught.add(course);
            System.out.println(getFullName() + " is now teaching: " + course);
        } else {
            System.out.println("Error: Course name cannot be empty.");
        }
    }

    public void publishResearch(String paperTitle) {
        if (paperTitle != null && !paperTitle.isEmpty()) {
            researchPapers.add(paperTitle);
            System.out.println(getFullName() + " published a new research paper: " + paperTitle);
        } else {
            System.out.println("Error: Research paper title cannot be empty.");
        }
    }

    public void assignTA(TeachingAssistant ta, String course) {
        if (ta != null && course != null && !course.isEmpty()) {
            System.out.println("Professor " + getFullName() + " assigned " + ta.getFullName() + " as a TA for " + course);
            ta.assignToCourse(course);
        } else {
            System.out.println("Error: TA or course is invalid.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCourses Taught: " + coursesTaught;
    }
}
