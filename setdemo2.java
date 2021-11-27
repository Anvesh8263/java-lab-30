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

                              if(st.contains("MAggiiee"))
                              {
                                      System.out.println("Found");
                                      System.out.println("st");
                              }
                              else
                              {
                                      System.out.println("not found");
                                      
                              }
       }
       public static void main(String args[])
       {
                     setdemo obj=new setdemo();
                     obj func();
       }
}