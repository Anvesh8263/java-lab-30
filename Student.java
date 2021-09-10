public class Student {
    String name;
    public Student() {
        // non-parameterized constructor
        this.name = "Unknown";
    }
    public Student(String name) {
        // parameterized constructor
        this.name = name;
    }
    public String getName() {
        // Getter Method
        return name;
    }
}

//Execution Class
class Execution{
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("Aryan");
        System.out.println("Stu1 name : "+stu1.getName());
        System.out.println("Stu2 name : "+stu2.getName());
    }
}