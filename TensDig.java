public class TensDig {
    public static void main(String[] args) {
        if (args[0].length()>1) {
            String st = args[0];
            int len = st.length();
            System.out.println("The Tens Digits is : " + st.charAt(len-2));
        }
        else
            System.out.println("Inputted number less than 10, no tens value.");
    }
}