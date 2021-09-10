public class Student2 {
    String name;
    double percentage;

    public Student2(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public static Student2 getTopper(Student2 obj1,Student2 obj2, Student2 obj3){
        if (obj1.percentage > obj2.percentage)
            if (obj1.percentage > obj3.percentage)
                return obj1;
            else
                return obj2;
        else
            if (obj2.percentage > obj3.percentage)
                return obj2;
            else
                return obj3;
    }
}

class Test{
    public static void main(String[] args) {
        Student2 stu1 = new Student2("Aryan",85.6);
        Student2 stu2 = new Student2("Shubham", 88.9);
        Student2 stu3 = new Student2("Pinky",86.7);

        var top = Student2.getTopper(stu1,stu2,stu3);

        System.out.println("The Topper name is : " + top.name +
                ", with Percentage : " + top.percentage);
    }
}