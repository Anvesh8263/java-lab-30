import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number of terms : ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() - 2;
        int a = 0, b = 1;
        System.out.print("0 1");
        int nxt;
        while(t>0){
            nxt = a+b;
            System.out.print(" " + nxt);
            a = b;
            b = nxt;
            t-=1;
        }
    }
}