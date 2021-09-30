import java.util.*;
class Retirement
{
           public static void main(String args[])
          {
       
                   Scanner in= new Scanner(System.in);
      
            System.out.println("HOW MUCH MONEY DO YOU NEED TO RETIRE?");
          double goal =in.nextDouble();

           System.out.println("HOW MUCH MONEY WILL YOU CONTRIBUTE EVERY YEAR?");
            double payment=in.nextDouble();

          System.out.println("INTEREST RATE IN %:");
          double interestRate=in.nextDouble();

           double balance=0;
           int years=0;

       while(balance<goal)
       {
              balance+=payment;
             double interest=balance*interestRate/100;
             balance+=interest;
             years++;
}

           System.out.println("YOU CAN RETIRE IN "+years+"years.");
    }
}
