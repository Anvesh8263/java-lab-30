import java.util.*;
class stackdemo
{
                void func()
                {
                      Stack stk=new Stack();
                     



                      stk.push("Frooti");
                      stk.push("Maggie");
                      stk.push("noodles");
                      stk.push("popcorn");
                      stk.push("Macroni");
                      stk.push("Icecream");
                      stk.push("Peanuts");
                      stk.push("Pani Puri");

                      System.out.println(stk);
                      System.out.println("No of food:"+stk.size());

                      System.out.println("\n\n\n----------------------------------------------------------\n\n\n");

                      //System.out.println("Deleted:"+stk.pop());
                        System.out.println("Last Element:"+stk.peek());

                      System.out.println(stk);
                      System.out.println("No of food:"+stk.size());

   
                 }
                 public static void main(String args[])
                 {
                           stackdemo obj=new stackdemo();
                           obj.func();
                 }
}