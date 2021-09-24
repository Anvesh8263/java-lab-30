interface AKTUniversity
{
         abstract void btech();
          static void func()
         {
                     System.out.println("static fn is working in interface");
         }
}
class college3 implements AKTUniversity
{
             public void btech()
            {  
                   System.out.println("btech prog.....");
            }
             public static void main(String args[])
            {
                         college3 obj= new college3();
                          obj.btech();
                          AKTUniversity.func();
           }
}
