import java.util.*;

class setdemo
{
       void func()
       {
                              Set st=new HashSet();
           
                              st.add("Coke");
                              st.add("Perk");
                              st.add("2000");
                              st.add("Zehar");

                              if(st.isEmpty())
                              {
                                      System.out.println("Blank");
                              }
                              else
                              {
                                      System.out.println(st);
                                      System.out.println("No. of items:"+st.size());
                              }
       }
       public static void main(String args[])
       {
                     setdemo obj=new setdemo();
                     obj func();
       }
}
 