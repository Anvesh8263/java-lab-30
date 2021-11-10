import java.util.Scanner;

class expdemo
{
            void func1()
            {
                             try
                             {
                                            Scanner sc=new Scanner(System.in);
                                            System.out.println("Enter value");
                                            
                                            String var=sc.next();
                                            System.out.println("String value : ");         
                                            System.out.println(var);
                  
                                             System.out.println("\n\n-----------------------------------\n\n");

                                            
                                            System.out.println("Stirng value : ");         
                                            System.out.println();


                                            int z=Integer.parseInt(var);//exception can be raise
                           
                                            System.out.println("Numeric value : ");
                                            System.out.println(z+5);

                           }
                           catch(Exception e)
                          {
                                          //System.out.println("Problem occur");
                                          System.out.println(e);
                                          
                          }
              }
              void func2()
             {
                                         System.out.println("Second fn is working");
             }
             public static void main(String args[])
            {
                                        expdemo obj=new expdemo();
                                        obj.func1();
                                        obj.func2();
            }
}
