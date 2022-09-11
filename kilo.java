import java.util.Scanner;

public class kilo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Distance in Kilometers");
        float km = sc.nextFloat();
        float miles = (float)(0.621371*km);
   System.out.println("Distance in miles will be : "+miles);
    }
}
