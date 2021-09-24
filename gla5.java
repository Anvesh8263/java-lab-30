class Amity
{
    Amity()
    {
        System.out.println("Amity.....non para cons....base");
    }
    Amity(int a)
    {
        System.out.println("Amity.....para cons....base");
    }

}
class glauniversity extends Amity
{
    glauniversity()
    {
        System.out.println("gla.....non para cons....derived");
    }
    glauniversity(int z)
    {
        super(z);
        System.out.println("gla.....para cons....derived");
    }
    public static void main(String args[])
    {
        gla5 obj=new gla5(10);
    }
}
