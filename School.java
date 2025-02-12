import java.util.ArrayList;

class School {
    String name;
    String program;
    int totalStudents;
    String headOfDepartment;
    String campus; 

    School(String name, String string, int totalStudents, String headOfDepartment, String campus) {
        this.name = name;
        this.program = program;
        this.totalStudents = totalStudents;
        this.headOfDepartment = headOfDepartment;
        this.campus = campus;
    }


    public String toString() {
        return "School: " + name + 
               "\nProgram: " + program + 
               "\nTotal Students: " + totalStudents + 
               "\nHead of Department: " + headOfDepartment + 
               "\nCampus: " + campus + "\n";
    }
        public static void main(String[] args) {
        ArrayList<School> schoolList = new ArrayList<>();

        schoolList.add(new School("Engineering School", "Computer Science", 500, "Dr. Smith", "Main Campus"));
        schoolList.add(new School("Business School", "Marketing", 300, "Dr. Johnson", "Downtown Campus"));
        schoolList.add(new School("Medical School", "Nursing", 400, "Dr. Adams", "Health Sciences Campus"));

        for (School school : schoolList) {
            System.out.println(school); 
        }

}
}