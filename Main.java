public class Main {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Ismayil", "Alizada", 25, 55000.00);
        Faculty faculty2 = new Faculty("Ulkar", "Shirinli", 26, 60000.00);

        System.out.println(faculty1);
        System.out.println(faculty2);

        faculty1.setAge(26);
        faculty1.setSalary(58000.00);

        System.out.println("\nUpdated Faculty1 Details:");
        System.out.println(faculty1);
        
        // we can use getters to access any specific detail about faculty members
        // variables are private, therefore I used getters
        System.out.println("\nFaculty2 Name: " + faculty2.getName());
        System.out.println("Faculty2 Age: " + faculty2.getAge());
        System.out.println("Faculty2 Salary: " + faculty2.getSalary());
    }
}
