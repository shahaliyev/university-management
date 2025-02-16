import java.util.ArrayList;

class StudentService {
    private ArrayList<Student> students;
    private ArrayList<Course> availableCourses;
    
    public StudentService() {
        this.students = new ArrayList<>();
        this.availableCourses = new ArrayList<>();
    }
    
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        System.err.println("Student not found!");
        return null;
    }
    
    public void enrollStudentInCourse(int studentId, int courseIndex) {
        Student student = getStudentById(studentId);
        if (student != null && courseIndex >= 0 && courseIndex < availableCourses.size()) {
            student.addCourse(availableCourses.get(courseIndex));
            System.out.println("Successfully enrolled in the course!");
        } else {
            System.err.println("Invalid choice!");
        }
    }
    
    public boolean removeStudentById(int studentId) {
        return students.removeIf(student -> student.getId() == studentId);
    }
    
    public void addAvailableCourse(Course course) {
        availableCourses.add(course);
    }
}