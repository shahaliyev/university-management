import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private final String name;
    private final String department;
    private String email;
    private final List<String> courses;

    public Faculty(String name, String department, String email) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println(name + " is not teaching any courses.");
        } else {
            System.out.println(name + " is teaching the following courses:");
            courses.forEach(course -> System.out.println("- " + course));
        }
    }

    public void updateEmail(String newEmail) {
        System.out.println("Updating email from " + this.email + " to " + newEmail);
        this.email = newEmail;
        System.out.println("Email updated successfully!");
    }

    public void displayFacultyInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Faculty Name: ").append(name).append("\n")
          .append("Department: ").append(department).append("\n")
          .append("Email: ").append(email).append("\n");
          
        if (courses.isEmpty()) {
            sb.append(name).append(" is not teaching any courses.\n");
        } else {
            sb.append(name).append(" is teaching the following courses:\n");
            courses.forEach(course -> sb.append("- ").append(course).append("\n"));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Turkana Aliyeva", "Student Services", "taliyeva13549@ada.edu.az");

        faculty1.addCourse("Data Structures");
        faculty1.addCourse("Algorithms");
        System.out.println(faculty1);

        faculty1.removeCourse("Algorithms");
        System.out.println(faculty1);

        faculty1.updateEmail("turkana.47@mail.ru");
        System.out.println(faculty1);
    }
}
