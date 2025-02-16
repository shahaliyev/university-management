import java.util.ArrayList;
import java.util.List;

public class Staff {
    private double salary;
    private String phoneNumber;
    private String status, role, email, officeNumber, name, department;
    private List<Room> assignedRooms;

    public Staff(String name, String department) {
        this.name = name;
        this.department = department;
        this.salary = 0.0;
        this.assignedRooms = new ArrayList<>();
    }

    public Staff(String name, String department, double salary, String status, String role, String email, String phoneNumber, String officeNumber) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.status = status;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.officeNumber = officeNumber;
        this.assignedRooms = new ArrayList<>();
    }
    
    public String getName() {
        return (name == null || name.isEmpty()) ? "Not Set" : name;
    }
    public String getDepartment() {
        return (department == null || department.isEmpty()) ? "Not Set" : department;
    }

    public double getSalary() {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be a positive value.");
        }
        return salary;
    }

    public String getPhoneNumber() {
        return (phoneNumber == null || phoneNumber.isEmpty()) ? "Not Set" : phoneNumber;
    }

    public String getStatus() {
        return (status == null || status.isEmpty()) ? "Not Set" : status;
    }

    public String getRole() {
        return (role == null || role.isEmpty()) ? "Not Set" : role;
    }

    public String getEmail() {
        return (email == null || email.isEmpty()) ? "Not Set" : email;
    }

    public String getOfficeNumber() {
        return (officeNumber == null || officeNumber.isEmpty()) ? "Not Set" : officeNumber;
    }

    public List<Room> getAssignedRooms() {
        return new ArrayList<>(assignedRooms);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", officeNumber='" + officeNumber + '\'' +
                ", salary=" + salary +
                ", assignedRooms=" + assignedRooms +
                '}';
    }
}
