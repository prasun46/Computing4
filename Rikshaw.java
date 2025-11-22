import java.util.Scanner;

/**
 * Write a description of class Rikshaw here.
 *
 * @prasun
 * @version (a version number or a date)
 */
public class Rikshaw
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("What is the distance?");
        int distance = input.nextInt();
        System.out.println("Are you a local?\n 1 for yes, 0 for no");
        int ans=input.nextInt();
        boolean local;
        boolean day;
        if(ans == 1)
        {
            local=true;
        }
        else
        {
            
            local=false;
        }
        System.out.println("Its day or night?\n 1 for day, 0 for night");
        int ans1= input.nextInt();
        if(ans1==1)
        {
            day = true;
        }
        else
        {
            day= false;
        }
        float price_multiplier=0;
        float price_multiplier1= 0;
        if(day)
        {
            price_multiplier =1;
        }
        else
        {
            price_multiplier= 1.5f;
        }
        if (local)
        {
            price_multiplier1=0.5f;
        }
        else
        {
            price_multiplier1=1;
        }
        int base_fare= 20;
        double fare=(((distance-1)*5)+ base_fare)*price_multiplier * price_multiplier1;
        System.out.println("Total fare:Rs"+fare);
    }

} 
