public class StrCheck {
    public static void main(String[] args) {
        if (args.length==2) {
            String str1 = args[0];
            String str2 = args[1];
            if (str1.equals("GLA") && str2.equals("Mathura"))
                System.out.println("GLA University Mathura");
            else if (str1.equals("AAA") && str2.equals("Delhi"))
                System.out.println("AAA Technologies Delhi");
            else
                System.out.println("Wrong Input.");
        }
        else
            System.out.println("Wrong Input");
    }
}