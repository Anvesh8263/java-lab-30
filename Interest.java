public class Interest {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]);
        if ("male".equals(args[0])) {
            if (1<age && age<59)
                System.out.println("Interest is : 8.4%");
            else if (age>58 && age<100)
                System.out.println("Interest is : 10.5%");
        }
        else if("female".equals(args[0])){
            if (1<age && age<59)
                System.out.println("Interest is : 8.2%");
            else if(age>58 && age<100)
                System.out.println("Interest is : 9.2%");
        }
    }
}