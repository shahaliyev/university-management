
import java.util.List;

public class Student extends Person {
    private String name;
    private int id;
    private String email;
    private String phoneNumber;
    private int coursesCovered;
    private static double cgpa;
    private String major;
    private List<String> subjects;
    private boolean onProbation;
    private double[] gpas ;
    private int semester;
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getEmail() {
        return email;
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



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoursesCovered() {
        return coursesCovered;
    }

    public void setCoursesCovered(int coursesCovered) {
        this.coursesCovered = coursesCovered;
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public boolean isOnProbation() {
        return onProbation;
    }

    public void setOnProbation(boolean onProbation) {
        this.onProbation = onProbation;
    }

    public double[] getGpas() {
        return gpas;
    }

    public void setGpas(double[] gpas) {
        this.gpas = gpas;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }


    Student(String name, int id, int coursesCovered, double cgpa, String major, List<String> subjects, boolean onProbation, int semester) {
        this.name = name;
        this.id = id;
        this.coursesCovered = coursesCovered;
        this.cgpa = cgpa;
        this.major = major;
        this.subjects = subjects;
        this.onProbation = onProbation;
        this.semester = semester;
    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void GetStudentInfo() {
        System.out.println("Name: " + this.name +
                "\nId: " + this.id +
                "\nGPA: " + this.gpas +
                "\nAge: " + this.age +
                "\nEmail: " + this.email);
        System.out.println("Courses: ");

        for (Course course : this.courses) {
            System.out.println("\n_________________\n");
            course.getCourses();

        }
    }

    public boolean AddCourse(Course course) {
        boolean checker = this.courses.add(course);
        if (checker) {
            System.out.println("Course added succcesfully!!");
            return checker;
        }
        System.err.println("Error occured((");
        return checker;

    }

    //didnt really get the logic behind
//    public boolean withdrawFromCourse(int id) {
//        boolean checker = this.courses.removeIf((course) -> course.getId() == id);
//        if (checker) {
//            System.out.println("Course deleted succcesfully!!");
//            return checker;
//        }
//        System.err.println("Error occured((");
//        return checker;
//    }


    public float CalculateGPA() {
        int size = this.courses.size();
        float overallGpa = 0;
        for (Course course : this.courses) {
            overallGpa += course.findValue();
        }
        overallGpa = overallGpa / (float) size;
        return overallGpa;
    }
            public void displayStudentInfo() {

                    System.out.println("Student ID: " + getId());
                    System.out.println("Name: " + getName());
                    System.out.println("Email: " + getEmail());
                    System.out.println("Phone: " + getPhoneNumber());
                    System.out.println("GPA: " + getGpas());
                    System.out.println("Honor Student: " + (Student.isHonorStudent() ? "Yes" : "No"));
                }
        private static boolean isHonorStudent() {
            if(Student.cgpa>3.0){
                return true;
            }
            return false;
        }



            }






