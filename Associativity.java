public class Associativity {
    public static void main(String[] args) {
        int a= 6*4-34/2;
        System.out.println(a);
        //Precedence & Associativity
        int b = 60/5-34*2;
        System.out.println(b);

        //* / ----> left to right
        //+ - ----> left to right
        //++,= ----> right to left

        int c=0;
        int d=0;
        int e=10;
        int k= b*b-(4*a*c)/(2*a);
        System.out.println(k);
    }
    
}
