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
class gla extends Amity
{
                  gla()
                   {
                          System.out.println("gla.....non para cons....derived");
                   }
                  gla(int z)
                   {
                          System.out.println("gla.....para cons....derived");
                   }
                  public static void main(String args[])
                 {
                      gla obj=new gla(10);
                }
}