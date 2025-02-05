public class Student {

    String name;
    int ID;
    String surname;
    int age;
    private double grade;


    public Student(int id, String name, int age, double grade) {
        this.ID = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student() {
    }


    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

