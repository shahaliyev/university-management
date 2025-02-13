//package university-management;

public class Staff {
   private String fullName;
   private int staffID;
   private String position;
   private String department;
   private String contactNumber;
   private String staffEmail;
   private String roomNumber;
   private double salary;
   private int workingHours;
   private String accessLevel;

   public Staff( String fullName, int staffID, String position,
   String department, String contactNumber, String staffEmail,
   String roomNumber, double salary, int workingHours, String accessLevel){
        this.fullName = fullName;
        this.staffID = staffID;
        this.position = position;
        this.department = department;
        this.contactNumber = contactNumber;
        this.staffEmail = staffEmail;
        this.roomNumber = roomNumber;
        this.salary = salary;
        this.workingHours = workingHours;
        this.accessLevel = accessLevel;


   }

   public void showStaffInfo(){  //function to see the details of the staff
    System.out.println("Full : " + fullName);
    System.out.println("Id : " + staffID);
    System.out.println("Position : " + position);
    System.out.println("Department : " + department);
    System.out.println("Email : " + staffEmail);
    System.out.println("Contact Number : " + contactNumber);
    System.out.println("Email : " + staffEmail);
    System.out.println("Room : " + roomNumber);
}
    public double MonthlySalary(){
     return salary * workingHours;
  } 
    
    }

   


