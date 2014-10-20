import java.util.Scanner;

/**
 * Write a description of class LeapYear here.
 * 
 * @author (ikbiel) 
 * @version (20 October 2014)
 */
public class LeapYear
{
    //the year the user inputs
    private double year;
    
    private String is_leap;
    
    public LeapYear()
    {
        this.is_leap = "";
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = scan.nextDouble();
    }

    public String isLeapYear(double year)
    {
        if ((year%4) == 0)
        {
           if ((year%400) == 0)
           {
               is_leap += ("This is a leap year");
            }
           else if ((year%100) == 0)
           {
              is_leap += ("This is not a leap year");
            }
        }
        else
        {
            is_leap += ("This is not a leap year");
        }
        
        return is_leap;
    }        
}




            
