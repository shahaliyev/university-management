import java.util.List;

public class TeachingAssistant extends Staff {
    private String[] assignedCourses;
    private int courseCount;
    private static final int MAX_COURSES = 10;
    private Professor supervisor;

    public TeachingAssistant(String name, String department, double salary, String email, String phoneNumber, String officeNumber, Professor supervisor) {
        super(name, department, salary, "Active", "Teaching Assistant", email, phoneNumber, officeNumber);
        this.supervisor = supervisor;
    }

    /**
     * Assigns the teaching assistant to a course.
     *
     * @param course The course to be assigned.
     */
    public void assignToCourse(String course) {
        assignedCourses.add(course);
        System.out.println(this.getName() + " has been assigned to assist with the course: " + course);
    }

    /**
     * Holds office hours for the teaching assistant.
     */
    public void holdOfficeHours() {
        System.out.println(this.getFullName() + " is holding office hours.");
    }

    /**
     * Conducts a lab session.
     *
     * @param labName The name of the lab session.
     */
    public void conductLab(String labName) {
        System.out.println(this.getFullName() + " is conducting the lab session: " + labName);
    }

    /**
     * Grades a student.
     *
     * @param student The student to be graded.
     * @param grade   The grade to be assigned to the student.
     */
    public void gradeStudent(Student student, double grade) {
        System.out.println(this.getName() + " (TA) graded student " + student.getName() + " with " + grade);
    }
}
