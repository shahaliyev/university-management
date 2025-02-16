public class Course {
    String[][] courses; // Course Name, Active, Grade, Passed

    public Course(String[][] courses) {
        this.courses = courses;
    }

    public void displayCourses() {
        System.out.println("Courses Information:");
        System.out.println("Course Name | Active | Grade | Passed");

        for (String[] course : courses) {
            System.out.println(course[0] + " | " + course[1] + " | " + course[2] + " | " + course[3]);
        }
    }
}
