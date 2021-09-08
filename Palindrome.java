import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double D = str.length() - 1;
        int ptr = 0;
        byte flag = 0;
        while (ptr<D/2){
            if (str.charAt(ptr) != str.charAt((int)(D-ptr))) {
                flag = 1;
                break;
            }
            ptr+=1;
        }
        if(flag==1) System.out.println("Not Palindrome!");
        else System.out.println("Palindrome!");
    }
}