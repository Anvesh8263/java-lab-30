import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the operation (+, -, *, /) : ");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+' -> System.out.println("The sum is : " + (a + b));
            case '-' -> System.out.println("The difference is : " + (a-b));
            case '*' -> System.out.println("The Product is : " + (a*b));
            case '/' -> {
                float d = (float) a/(float) b;
                System.out.printf("The difference is : %.2f", d);
            }
            default -> System.out.println("Wrong Input!");
        }
    }
}
