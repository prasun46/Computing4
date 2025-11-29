import java.util.Scanner;

/**
•  Write a description of class scenario4 here.
 *
•  @author (your name)
•  @version (a version number or a date)
 */
public class scenario4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter age");
        int age = input.nextInt();
        String age_group;
        if (age <= 18)
        {
            age_group = "child";
        }
        else if (age <= 50)
        {
            age_group = "adult";
        }
        else
        {
            age_group = "senior";
        }
        input.nextLine();
        System.out.println("enter language (english/hindi)");
        String lang = input.nextLine();
        System.out.println("student (yes/no)");
        String student = input.nextLine();
        System.out.println("festival (yes/no)");
        String festival = input.nextLine();
        double total = 0;
        double basePrice = 0;
        // age 
        if (age_group == "child")
        {
            basePrice = 150;
        }
        else if ( age_group == "adult")
        {
            basePrice = 250;
        }
        else
        {
            basePrice = 200;
        }
        // language
        if ( lang == "hindi")
        {
            basePrice += 50;
        }
        else
        {
            basePrice += 100;
        }
        // festival discount
        if (festival == "yes")
        {
            basePrice = basePrice * 0.85;
        }
        // student discount
        if (student == "yes")
        {
            basePrice = basePrice * 0.8;
        }
        System.out.println("Total: "+basePrice);
    }
}