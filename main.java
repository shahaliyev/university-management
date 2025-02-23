public class main(String[]args) {
    School businessSchool = new School("Business", "New York", 50000, true);
    System.out.println("School Major: " + businessSchool.schoolMajor);
    System.out.println("Location: " + businessSchool.location);
    System.out.println("Tuition Fees: $" + businessSchool.tuitionFees);
    System.out.println("Active: " + businessSchool.isActive);
}
