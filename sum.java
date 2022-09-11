import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fisrt number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number");
        int c= sc.nextInt();
        int sum = a+b+c;
        System.out.println("The Sum of three Number is : ");
        System.out.println(sum);


    }
}
