public class CheckCommand {
    public static void main(String...args) {
        if (args.length==0)
            System.out.println("No Values.");
        else
            for (String val : args)
                System.out.print(val + ", ");
    }
}
