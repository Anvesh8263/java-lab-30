import java.util.Scanner;

public class CheckEmail {
    String mail;

    public CheckEmail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public boolean CheckString(String ch){
        if(this.getMail().indexOf(ch)>=0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email : ");
        var em = sc.next();
        CheckEmail obj = new CheckEmail(em);
        if(obj.CheckString(".ac"))
            System.out.println("The mail is Academic.");
        else
            System.out.println("The mail is not Academic.");
        if(obj.CheckString(".in"))
            System.out.println("The mail is Indian.");
        else
            System.out.println("The mail is not Indian.");
    }
}
