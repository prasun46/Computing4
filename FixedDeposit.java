import java.util.Scanner;

/**
•  Write a description of class scenario here.
 *
•  @author (your name)
•  @version (a version number or a date)
 */
public class FixedDeposit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int principal = 0;
        int rate = 0;
        int time = 0;
        double A = 0;
        double fee = 0;
        
        while (true)
        {
            System.out.println("enter principal amount:");
            principal = input.nextInt();
            if ( principal < 1000 )
            {
                continue;
            }
            System.out.println("enter annual rate ( 8 to 12%");
            rate = input.nextInt();
            if ( rate > 12 || rate < 8)
            {
                continue;
            }
            System.out.println("enter time in years");
            time = input.nextInt();
            if ( time > 5)
            {
                continue;
            }
            double r = rate / 100.0;
            int n = 12; // Compounded monthly
            int nt = n * time;
            
            A = principal * Math.pow((1 + r / n), nt);
            
            // Calculate fee (5% of the final amount)
            fee = 0.05 * A;
            System.out.println("amount:"+ A);
            System.out.println("amount after fee: "+ (A-fee));
            System.out.println("do you want to continue? ( yes / no)");
            input.nextLine(); 
            String ans = input.nextLine();
            

            if (ans.equals("no"))
            {
                break;
            }
            
        }
    }
}