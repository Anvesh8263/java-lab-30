class SunMicrosystem
{
         void JAVA()
         {
                  System.out.println("Java program");
         }
}
class Google extends SunMicrosystem
{
         void Android()
         {
                 System.out.println("android app develop...");
         }
}
class Oracle extends Google 
{
           void DBMS()
           {
                   System.out.println("sql.....");
           }
           public static void main(String args[])
           {
                     Oracle obj= new Oracle();
                     obj.DBMS();
                     obj.JAVA();
                     obj.Android();
           }
}
