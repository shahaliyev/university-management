public class Course {

    protected int id;
    private int number;
    private String school;
    String instructor;
    private int minCredits;
    Degree degree;
    private boolean status;
    


    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getMinCredits() {
        return minCredits;
    }

    public void setCredits(int minCredits) {
        this.minCredits = minCredits;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

   

    public Course() {
        // empty constructor
    }

    public Course(String school, int number) {
        this.school = school;
        this.number = number;

    }

    public Course(String school, int number,Degree degree) {
        this.school = school;
        this.number = number;
        this.degree = degree;

    }

   
    
        public String getSchool() {
            return school;
        }
    
        public void setSchool(String school) {
            this.school = school;
        }
    
        public int getNumber() {
            return number;
        }
    
        public void setNumber(int number) {
            this.number = number;
        }
    
        public Degree getDegree() {
            return degree;
        }
    
        public void setDegree(Degree degree) {
            this.degree = degree;
        }
    
        @Override
        public String toString() {
            return "Course [id=" + id + ", number=" + number + ", school=" + school + ", instructor=" + instructor
                    + ", credits=" + minCredits + ", degree=" + degree + "]";
        }
    
        public boolean canEnroll(int studentCredits){
            if(studentCredits >= minCredits){
                return true;
            }
            return false;
        }
        public boolean isActive(boolean status){
            return status;
        }
        public static void main(String[] args) {
            Course course = new Course("CS", 20122, Degree.UNDERGRADUATE);
            
        System.out.println(course);

    }

}