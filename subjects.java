import java.util.Scanner;

public class sbjects {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Marks of Chemistry");
        int Chemistry = sc.nextInt();
        System.out.println("Enter the Marks of Physics");
        int Physics = sc.nextInt();
        System.out.println("Enter the Marks of Maths");
        int Maths = sc.nextInt();
        System.out.println("Enter the Marks of ml");
        int ml = sc.nextInt();
        System.out.println("Enter the Marks of cn");
        int cn = sc.nextInt();
    int sum = (Chemistry + Physics + Maths + ml + cn);
        System.out.println("The total Marks is : ");
        System.out.println(sum);
        float percentage = ((Chemistry + Physics + Maths + ml + cn)/500.0f)*100; 
        System.out.println(percentage);
    }
}
