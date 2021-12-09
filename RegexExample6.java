import java.util.regex.*;
class RegexExample6
{
         public static void main(String args[])
         {

                       

                        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","2haEAD"));//true

                         System.out.println(Pattern.matches("[0-9]{10}","9897969584"));//true
       
                        System.out.println(Pattern.matches("a-zA-z0-9]{6}","kkuyread"));//false(more that 6)
            
                         System.out.println(Pattern.matches("[a-zA-z0-9]{6}","kkuyre"));//true

                       System.out.println(Pattern.matches("[a-zA-z0-9]{6}","ader$g"));//false($ is not match)
 
                    

                          
           }
}