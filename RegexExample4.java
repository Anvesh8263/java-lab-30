import java.util.regex.*;
class RegexExample4
{
         public static void main(String args[])
         {

                       System.out.println("?quantifier.......");

                        System.out.println(Pattern.matches("[amn]?","abcd"));//false(not a or m or n)

                         System.out.println(Pattern.matches("[amn]?","a"));//true(among a or m or n)
       
                        System.out.println(Pattern.matches("[amn]?","ammma"));//false(m and a comes more than once)
 
                        System.out.println("+quantifier.....");

                           System.out.println(Pattern.matches("[amn]+","abcd"));//false(not a or m or n)

                         System.out.println(Pattern.matches("[amn]+","a"));//true(among a or m or n)
       
                        System.out.println(Pattern.matches("[amn]+","ammma"));//false(m and a comes more than once)




                      System.out.println("*quantifier......");
   
                        System.out.println(Pattern.matches("[amn]*","ammma"));//false(m and a comes more than once)
           }
}