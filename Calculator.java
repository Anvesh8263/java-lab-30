import java.util.Scanner;

public class Calculator {
    static int powerInt(int num1, int num2) {return (int) Math.pow(num1,num2);}
    static double powerDouble(double num1, int num2) {return Math.pow(num1,num2);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice... \n1 : powerInt \n2 : doubleInt \nEnter Choice [1,2] : ");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.print("Enter int num1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter int num2 : ");
            int num2 = sc.nextInt();
            System.out.println("Answer : " + powerInt(num1,num2));
        }
        else if(choice == 2){
            System.out.print("Enter double num1 : ");
            double num1 = sc.nextDouble();
            System.out.print("Enter int num2 : ");
            int num2 = sc.nextInt();
            float result = (float)powerDouble(num1,num2);
            System.out.println("Answer : " + result);
        }
        else System.out.println("Wrong Input!");
    }
}
