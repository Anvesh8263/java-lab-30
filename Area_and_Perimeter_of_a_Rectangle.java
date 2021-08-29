import java.util.Scanner;
public class Area_and_Perimeter_of_a_Rectangle{
    public static void main(String[]  args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The area is : "+ a*b);
        System.out.println("The perimeter is : "+ 2*(a+b));

    }
}
