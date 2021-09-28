class SunMicrosystem
{
         void JAVA()
         {
                   System.out.println("java program");
         }
}
class Google extends SunMicrosystem
{
            void Android()
            {
                          System.out.println("android app devdelop...");
            }
}
class realme extends Google
{
           void Ruby()
           {
                     System.out.println("model can do everything.....");
           }
}
class Oracle1 extends realme
{
         void DBMS()
         {
                     System.out.println("sql.....");
         }
         public static void main(String args[])
         {
                    Oracle1 obj=new Oracle1();
                    obj.DBMS();
                    obj.JAVA();
                    obj.Ruby();
                    obj.Android();
                    
      }
} 