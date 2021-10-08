//example : sum all elements of an array which input by command line argument using
//for each loop
class cmddemo
{
           public static void main(String args[])
           {
                                int sum=0;
                                for(String var:args)
                               {  
                                                 System.out.println(var);   
                                                 sum=sum+Integer.parseInt(var);  
                               }
                              System.out.println("Total:"+sum);                       
           }
}