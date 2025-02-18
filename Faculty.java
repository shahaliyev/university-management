import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private String department;
    private String position;
    private String officeLocation;
    private String hireDate;
    private boolean availability;
    private List<String> coursesTaught;

    public Faculty(int facultyID, String fullName, String address, String phone, Email email, int age, Date dateOfBirth,
                   String department, String position, String officeLocation, String hireDate, boolean availability) {
        super(fullName, address, phone, email, age, facultyID, dateOfBirth);
        this.department = department;
        this.position = position;
        this.officeLocation = officeLocation;
        this.hireDate = hireDate;
        this.availability = availability;
        this.coursesTaught = new ArrayList<>();
    }

    public Faculty(int facultyID, String fullName, String address, int age, Email email) {
        super(fullName, address, age, email);
        this.department = "N/A";
        this.position = "N/A";
        this.officeLocation = "N/A";
        this.hireDate = "N/A";
        this.availability = false;
        this.coursesTaught = new ArrayList<>();
    }

    public String getDepartment() { return department; }
    public String getPosition() { return position; }
    public String getOfficeLocation() { return officeLocation; }
    public String getHireDate() { return hireDate; }
    public boolean isAvailable() { return availability; }
    public List<String> getCoursesTaught() { return new ArrayList<>(coursesTaught); }

    public void setDepartment(String department) { this.department = department; }
    public void setPosition(String position) { this.position = position; }
    public void setOfficeLocation(String officeLocation) { this.officeLocation = officeLocation; }
    public void setHireDate(String hireDate) { this.hireDate = hireDate; }
    public void setAvailability(boolean availability) { this.availability = availability; }

    public void changeAvailabilityStatus(boolean status) {
        this.availability = status;
        String message = status ? "is now available" : "is now unavailable";
        System.out.printf("%s %s %s\n", this.position, getFullName(), message);
    }

    public void assignCourse(String courseName) {
        if (!coursesTaught.contains(courseName)) {
            coursesTaught.add(courseName);
            System.out.println("\"" + courseName + "\" has been assigned to " + getFullName());
        } else {
            System.out.println(getFullName() + " is already assigned to \"" + courseName + "\"");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nDepartment: ").append(department)
        .append("\nPosition: ").append(position)
        .append("\nOffice: ").append(officeLocation)
        .append("\nHire Date: ").append(hireDate)
        .append("\nAvailability: ").append(availability ? "Available" : "Unavailable")
        .append("\nCourses Taught: ").append(coursesTaught.isEmpty() ? "None" : coursesTaught);
        return sb.toString();
    }

    public Person getContactInfo() {
        return new Person(getFullName(), getAddress(), getPhone(), getEmail(), getAge(), getID(), getDateOfBirth());
    }
}
