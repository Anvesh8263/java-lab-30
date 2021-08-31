import java.util.Scanner;
public class Average_number{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("The average of these number is "+ (a+b+c)/3);
    }
}
