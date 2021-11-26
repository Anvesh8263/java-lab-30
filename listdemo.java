import java.util.*;
class listdemo
{
     void func()
     {
                  List lst=new ArrayList();
   
                  lst.add("Coke");
                  lst.add("Dairy Milk");
                  lst.add("500");
                  lst.add("Perk");
                  lst.add("Kurkure");
                  
               
                  System.out.println(lst);
                  System.out.println("No.of items:"+lst.size());

                  System.out.println("\n\n\n----------------------------------------------------\n\n\n");
                  

                   //System.out.println(lst.get(1));  //find
 
                   //lst.set(1,"kitkat");   //replace

                   //lst.add(1,"frooti");  //insert at particular index
                   //lst.remove(1);     //delete particular
                   //lst.clear();      //delete all
                  System.out.println(lst);
                  System.out.println("No.of items:"+lst.size());
                  
      }
      public static void main(String args[])
      {
                listdemo obj=new listdemo();
                obj.func();
      }
}