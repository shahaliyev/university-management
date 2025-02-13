import java.util.List;

public class TeachingAssistant extends Staff {
    private List<String> assignedCourses;
    private Professor supervisor;

    public TeachingAssistant(String name, String department, double salary, String email, String phoneNumber, String officeNumber, Professor supervisor) {
        super(name, department, salary, "Active", "Teaching Assistant", email, phoneNumber, officeNumber);
        this.supervisor = supervisor;
    }

    public void assignToCourse(String course) {
        assignedCourses.add(course);
        System.out.println(this.getName() + " has been assigned to assist with the course: " + course);
    }

    public void holdOfficeHours() {
        System.out.println(this.getName() + " is holding office hours.");
    }

    public void conductLab(String labName) {
        System.out.println(this.getName() + " is conducting the lab session: " + labName);
    }

    public void gradeStudent(Student student, double grade) {
        System.out.println(this.getName() + " (TA) graded student " + student.getName() + " with " + grade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teaching Assistant: ").append(getName()).append("\n");
        sb.append("Department: ").append(getDepartment()).append("\n");
        sb.append("Salary: $").append(getSalary()).append("\n");
        sb.append("Email: ").append(getEmail()).append("\n");
        sb.append("Phone Number: ").append(getPhoneNumber()).append("\n");
        sb.append("Office Number: ").append(getOfficeNumber()).append("\n");
        sb.append("Supervisor: ").append(supervisor != null ? supervisor.getName() : "None").append("\n");
        sb.append("Assigned Courses: ").append(assignedCourses != null && !assignedCourses.isEmpty() ? String.join(", ", assignedCourses) : "None").append("\n");
        return sb.toString();
    }
}
