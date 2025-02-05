public class Faculty {
    private String name;
    private String department;
    private double salary;


//Constructor
public Faculty (String name , String department , double salary){
    this.name = name;
    this.department = department;
    this.salary = salary;
}

//Getter
public String getDepartment(){
    return department;
}

public String getName(){
    return name;
}

public double getSalary(){
    return salary;
}


//Setter
public void setName(String name){
    this.name=name;
}
public void setDepartment(String department){
    this.department=department;
}
public void setSalary(double salary){
    this.salary=salary;
}

public void displayInfo (){
   System.out.println("Faculty Name:" + name);
   System.out.println("Department:"+ department);
   System.out.println("Salary: $" + salary);
}
public static void main (String[] args) {
  Faculty faculty1 = new Faculty("Dr. Noam Chomsky", "Linguistics", 500000);
  faculty1.displayInfo();
}
}

