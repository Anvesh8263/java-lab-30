class cmddemo4
{
           public static void main(String args[])
           {
                                int size=args.length;
                              System.out.println("No of Elements:"+size);   
                                int sum=0;
                               for(int i=0;i<size;i++)
                               {
                                                     System.out.println(args[i]); 
                                                      sum=sum+Integer.parseInt(args[i]);                      
                                } 
                                 System.out.println("total:"+sum);
          }
}