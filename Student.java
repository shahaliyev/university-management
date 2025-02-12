import java.util.ArrayList;


public class Student {
    private String[] name = new String[2];
    private int id; 
    private int coursesCovered;
    private double gpa; //added gpa to resolve unworking methods
    private int age; //added age to resolve unworking methods
    private String email; //added email to resolve unworking methods
    private double cgpa; 
    private String major;
    private ArrayList<Course> subjects; 
    private boolean onProbation; 
    private double[] gpas = new double[12];
    private int semester = 0;
    private String phoneNumber;

    // Constructor
    Student(String[] name, int id, int coursesCovered, double cgpa, double gpa, int age, String email, String major,
             ArrayList<Course> subjects, boolean onProbation, double[] gpas, int semester, String phoneNumber) {
        if (id < 0|| cgpa < 0 || coursesCovered < 0) {
            System.out.println("Negative values are not allowed for ID, GPA, CGPA, or coursesCovered.");
        }
        this.name = name; 
        this.id = id;
        this.coursesCovered = coursesCovered;
        this.cgpa = cgpa;
        this.gpa = gpa;
        this.age = age;
        this.email = email;
        this.major = major;
        this.subjects = subjects;
        this.onProbation = onProbation;
        this.gpas = gpas;
        this.semester = semester;
        this.phoneNumber = phoneNumber;
    }

    //Set methods 

    public void setName(String[] name) { this.name = name; }
    public void setOnProbation(boolean onProbation) { this.onProbation = onProbation; }
    public void setId(int id) { this.id = id; }
    public void setCoursesCovered(int coursesCovered) { this.coursesCovered = coursesCovered; }
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) { 
            this.cgpa = cgpa;
        }
    }
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) { 
            this.gpa = gpa;
            setOnProbation(gpa <= 2.5);
        }
        else {
            System.out.println("Invalid gpa provided.");
        }
        
    }
    public void setAge(int age) {
        if (age > 0) { 
            this.age = age;
        }
        else {
            System.out.println("Invalid age provided.");
        }
    }
    public void setEmail(String email) { this.email = email; }
    public void setMajor(String major) { this.major = major; }
    public void setSubjects(ArrayList<Course> subjects) { this.subjects = subjects; }
    public void setSemester(int semester) { this.semester = semester; }
   
    

    //get methods
    
    public String[] getName() { return name; }
    public int getId() { return id; }
    public int getCoursesCovered() { return coursesCovered; }
    public double getCgpa() { return cgpa; }
    public String getMajor() { return major; }
    public ArrayList<Course> getSubjects() { return subjects;}
    public boolean isOnProbation() { return onProbation; }
    public double[] getGpas() { return gpas; }
    public int getSemester() { return semester;}
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public double getGpa() { return gpa; }
    public boolean isHonorStudent() {return (semester >= 2 && gpas[semester - 2] >= 3.5);}


    public void displayStudentInfo() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Name: " + getName()[0]); 
        System.out.println("Surname " + getName()[1]);
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phoneNumber);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Honor Student: " + (isHonorStudent() ? "Yes" : "No"));
        // this.gpas[this.semester] = newGpa;
        // this.cgpa = (this.cgpa * this.coursesCovered + newGpa * grades.length) / (grades.length + this.coursesCovered);
        // this.coursesCovered += grades.length;
        // this.onProbation = this.cgpa < 2.5 && this.gpas[this.semester] < 2.5;
    }

//     public void GetStudentInfo(){
//         System.out.println("Name: " + this.name +
//         "\nId: " + this.id +
//         "\nGPA: " + this.gpa +
//         "\nAge: " + this.age +
//         "\nEmail: " + this.email);
//         System.out.println("Courses: ");
        
//         for (Course course : this.subjects) {
//             System.out.println("\n_________________\n");
//             course.GetCourse();
            
//         }
// }
    
    public boolean AddCourse(Course course){
        boolean checker = this.subjects.add(course);
        if(checker){
            System.out.println("Course added succcesfully!!");
            return checker;
        }
        System.err.println("Error occured((");
        return checker;

    }
    public boolean withdrawFromCourse(int id){
        boolean checker = this.subjects.removeIf((course)-> course.getCourseCode() == id);
        if(checker){
            System.out.println("Course deleted succcesfully!!");
            return checker;
        }
        System.err.println("Error occured((");
        return checker;
    }

    private void EndOfTheSemester() {
        if (this.semester < gpas.length) {
            this.gpas[this.semester] = this.gpa;
        }
        this.cgpa = (this.gpa * this.subjects.size() + this.cgpa * this.coursesCovered) / (this.coursesCovered + this.subjects.size());
        this.coursesCovered += this.subjects.size();
        this.subjects.clear(); 
        this.gpa = 0;
        this.semester += 1;
    }
    private void Birthday(){
        this.age += 1;
    }

    // public float CalculateGPA(){
    //     int size = this.subjects.size();
    //     float overallGpa = 0;
    //     for (Course course : this.courses) {
    //         overallGpa += course.findValue();
    //     }
    //     overallGpa = overallGpa / (float) size;
    //     return overallGpa;
    // }

    
    
    // public void updateSemester(double[] grades) {
    //     if (grades == null || grades.length == 0) {
    //         System.out.println("Grades array is empty or null.");
    //         return;
    //     }
    // }

   
    

    // public String toString() {
    //     return "Name: " + this.name + " CGPA: " + this.cgpa;
    // }
}
