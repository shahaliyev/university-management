import java.util.ArrayList;
import java.util.List;

public class TeachingAssistant extends Staff {
    private List<String> assignedCourses;
    private static final int MAX_COURSES = 10;
    private Professor supervisor;

    public TeachingAssistant(String name, String department, double salary, String email, String phoneNumber,
            String officeNumber, Professor supervisor) {
        super(name, department, salary, "Active", "Teaching Assistant", email, phoneNumber, officeNumber);
        this.supervisor = supervisor;
        this.assignedCourses = new ArrayList<>();
    }

    public void assignToCourse(String course) {
        if (assignedCourses.size() < MAX_COURSES) {
            if (assignedCourses.contains(course)) {
                System.out.println(getName() + " is already assigned to " + course);
            } else {
                assignedCourses.add(course);
                System.out.println(getName() + " has been assigned to assist with the course: " + course);
            }
        } else {
            System.out.println("Cannot assign more courses. Maximum limit reached.");
        }
    }

    public void removeFromCourse(String course) {
        if (assignedCourses.remove(course)) {
            System.out.println(getName() + " has been removed from assisting with the course: " + course);
        } else {
            System.out.println(getName() + " was not assigned to " + course);
        }
    }

    public List<String> getAssignedCourses() {
        return new ArrayList<>(assignedCourses);
    }

    public void holdOfficeHours() {
        System.out.println(getName() + " is holding office hours.");
    }

    public void conductLab(String labName) {
        System.out.println(getName() + " is conducting the lab session: " + labName);
    }

    public void gradeStudent(Student student, double grade) {
        System.out.println(getName() + " (TA) graded student " + student.getFullName() + " with " + grade);
    }

    @Override
    public String toString() {
        return "Teaching Assistant: " + getName() + "\n" +
                "Department: " + getDepartment() + "\n" +
                "Salary: $" + getSalary() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone Number: " + getPhoneNumber() + "\n" +
                "Office Number: " + getOfficeNumber() + "\n" +
                "Supervisor: " + (supervisor != null ? supervisor.getName() : "None") + "\n" +
                "Assigned Courses: " + (assignedCourses.isEmpty() ? "None" : String.join(", ", assignedCourses)) + "\n";
    }
}
