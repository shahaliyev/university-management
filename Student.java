import java.util.List;

public class Student extends People {
    private int id;
    private String fullName;
    private String gender;
    
    private int age;
    private int coursesCovered;
    private double cgpa;
    private String major;
    private List<String> subjects;
    private String email;
    private boolean onProbation;
    private int semester = 1;
    private List<Course> courses;
    private String phoneNumber;

    public Student(String fullName, String gender, int age, int id, int coursesCovered, double cgpa, String major,
            List<String> subjects, String email, boolean onProbation, int semester, List<Course> courses,
            String phoneNumber) {
        super(fullName, gender, phoneNumber, email, id, age);
        if (id < 0 || cgpa < 0 || coursesCovered < 0) {
            throw new IllegalArgumentException("Negative values are not allowed for ID, CGPA, or coursesCovered.");
        }
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.coursesCovered = coursesCovered;
        this.cgpa = cgpa;
        this.major = major;
        this.subjects = subjects;
        this.email = email;
        this.onProbation = onProbation;
        this.semester = semester;
        this.courses = courses;
        this.phoneNumber = phoneNumber;
    }
    
    public boolean registerCourse(Course course) {
        if (courses == null) {
            throw new IllegalStateException("Courses list is not initialized.");
        }
        boolean checker = courses.add(course);
        if (checker) {
            System.out.println("Course added successfully!");
        } else {
            System.err.println("Error occurred.");
        }
        return checker;
    }
    
    public boolean withdrawFromCourse(Course course) {
        if (courses == null) {
            throw new IllegalStateException("Courses list is not initialized.");
        }
        boolean checker = courses.remove(course);
        if (checker) {
            System.out.println("Course deleted successfully!");
        } else {
            System.err.println("Error occurred.");
        }
        return checker;
    }
    
    // Add Course
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean addCourse(Course course) {
        if (course != null) {
            courses.add(course);
            System.out.println("Course added successfully: " + course.getName());
            return true;
        }
        System.err.println("Error: Course is invalid.");
        return false;
    }

    public boolean withdrawFromCourse(int courseId) {
        boolean removed = courses.removeIf(course -> course.getCourseCode() == courseId);
        if (removed) {
            System.out.println("Course removed successfully!");
            return true;
        }
        System.err.println("Error: Course not found.");
        return false;
    }

    public int getCoursesCovered() {
        return coursesCovered;
    }

    public void setCoursesCovered(int coursesCovered) {
        this.coursesCovered = coursesCovered;
    }

    public void updateSemester(double[] grades) {
        if (grades == null || grades.length == 0) {
            System.out.println("No grades provided.");
            return;
        }

        double newGpa = 0;
        for (double grade : grades) {
            newGpa += grade;
        }
        newGpa /= grades.length;
        this.cgpa = (this.cgpa * semester + newGpa) / (semester + 1);
        this.onProbation = this.cgpa < 2.5 && newGpa < 2.5;
        this.semester++;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public boolean isOnProbation() {
        return onProbation;
    }

    public void setOnProbation(boolean onProbation) {
        this.onProbation = onProbation;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

}
