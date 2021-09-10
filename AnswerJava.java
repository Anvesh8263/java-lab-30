public class AnswerJava {
    static int tup;
    static int count;
    int tuptup;

    static {
        tup = 1;
        System.out.println("Static Block");
        count += 1;
    }

    public AnswerJava() {
        this.tuptup = 11;
        System.out.println("Constructor Block");
    }

    public static void main(String[] args) {
        AnswerJava obj1 = new AnswerJava();
        System.out.println("We can only access instance variable in the same class using object." + obj1.tuptup);
        System.out.println("the number of time the constructor is called is no. of times an object if the " +
                "class is created." + count);
    }
}