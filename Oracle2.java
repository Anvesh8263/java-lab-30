class SunMicrosystem
{
     void JAVA()
     {
         System.out.println("Java prog.....");
     }
     final void clang()
     {
         System.out.println("c prog bybbsun micro....base");
     }
}
class Oracle2 extends SunMicrosystem
{
         void clang()
         {
               System.out.println("c prog by oracle......derived");
         }
         void DBMS()
         {
                 System.out.println("sql.....");
         }
         public static void main(String args[])
         {
                  Oracle2 obj=new Oracle2();
                  obj.clang();
                  obj.JAVA();
                  obj.DBMS();
         }
}      