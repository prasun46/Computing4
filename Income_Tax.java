import java.util.Scanner;

/**
•  Write a description of class Income_Tax here.
 *
•  @author (your name)
•  @version (a version number or a date)
 */
public class Income_Tax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long income = input.nextInt();
        double tax = 0;
        if (income <= 500000)
        {
            tax = 0.01 * income;
        }
        else if (income > 500000 && income <= 700000)
        {
            tax = 5000 + 0.1 * (income - 500000);
        }
        else if (income > 700000 && income <= 1000000)
        {
            tax = 15000 + 0.2 * (income - 700000);
        }
        else if (income > 1000000 && income <= 2000000)
        {
            tax = 35000 + 0.3 * (income - 1000000);
        }
        else if (income > 2000000 && income <= 5000000)
        {
            tax = 335000 + 0.36 * (income - 2000000);
        }
        else
        {
            tax = 1135000 + 0.39 * (income - 5000000);
        }
        System.out.println("Total Tax: "+tax);
    }
}


