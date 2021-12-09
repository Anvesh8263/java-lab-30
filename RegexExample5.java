import java.util.regex.*;
class RegexExample5
{
         public static void main(String args[])
         {

                       System.out.println("metacharacters d...............");//d means digit

                        System.out.println(Pattern.matches("\\d","abc"));//false(non digit)

                         System.out.println(Pattern.matches("\\d","5"));//true(digit come ones)
       
                        System.out.println(Pattern.matches("\\d","4443"));//false(digit but comes more than once)
 
                    

                           System.out.println(Pattern.matches("\\d","323abc"));//false(digit and character)

                         System.out.println(Pattern.matches("metacharacter D............"));\\D means non digit
       
                       System.out.println(Pattern.matches("\\D","1"));//false(digit)

                         System.out.println(Pattern.matches("\\D","4443"));//false(digit )
       
                        System.out.println(Pattern.matches("\\D","323abc"));//false(digit and char)
 
                         
                       System.out.println(Pattern.matches("\\D","m"));//true(non digit and come ones)



                      System.out.println("metacharacters D with quantifier......");
   
                        System.out.println(Pattern.matches("\\D*","mak"));//true(non digit and may come 0 or more times)
           }
}