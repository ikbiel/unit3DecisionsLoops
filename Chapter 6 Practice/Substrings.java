import java.util.Scanner;

public class Substrings
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.next();
        
        for(int length = 1; length <= word.length(); length++) 
        {
            // Changes length
            for(int pos = 0; pos<=word.length()-length; pos++)
            {
                // changes starting position
                System.out.println(word.substring(pos, pos+length));

            }
    }
}
}


