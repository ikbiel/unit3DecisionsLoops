

public class NestedLoops
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] args)
    {
        int num1 = 1;
        int num2;
        
        while (num1<3)
        {
            for(num2 = 1; num2<=4; num2++)
            {
                System.out.println(num1 + "\t"+ num2);
         
            }
            num1++;
            num2= 0;
        }
        
        

    }

}
