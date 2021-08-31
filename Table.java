import java.util.Scanner;

public class Table{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of the table to be printed");
        int n = sc.nextInt();
        for(int i=1; i<11; i++)
        {
            System.out.println(n+" * "+i+" = "+i*n);
        }
    }
}