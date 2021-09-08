public class SumNum {
    public static void main(String[] args) {
        int sum = 0;
        for(String val : args)
            sum+=Integer.parseInt(val);
        System.out.println("Sum of given numbers is : " + sum);
    }
}