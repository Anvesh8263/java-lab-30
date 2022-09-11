import java.util.Scanner;

public class AddfiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println("Enter the third Number");
        int c = sc.nextInt();
        System.out.println("Enter the fourth Number");
        int d = sc.nextInt();
        System.out.println("Enter the fifth Number");
        int e = sc.nextInt();
        int sum = (a+b+c+d+e);
        System.out.println("The Sum of Five digits Number is : ");
        System.out.println(sum);
        

    }
}
