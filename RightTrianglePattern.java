import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int num = sc.nextInt();
        int val = num+1;
        int ct = 1;
        while(num>0){
            // Using Single Loop
            if(ct>0){
                System.out.print("*");
                ct-=1;
            }
            else{
                System.out.println();
                num-=1;
                ct = val-num;
            }
        }
    }
}