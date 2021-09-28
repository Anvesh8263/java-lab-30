class Amity
{
             Amity()
             {
                         System.out.println("Amity.....non para cons....base");
            }
           Amity(int a)
           {
                         System.out.println("Amity.....Single para cons....base");
          }
          Amity(int x,int y)
           {
                         System.out.println("Amity.....Double para cons....base");
          }

}
class gla6 extends Amity
{
                  gla6()
                   {
                          System.out.println("gla.....non para cons....derived");
                   }
                  gla6(int z)
                   {
                            super(z,z);
                          System.out.println("gla.....para cons....derived");
                   }
                  public static void main(String args[])
                 {
                      gla6 obj=new gla6(10);
                }
}