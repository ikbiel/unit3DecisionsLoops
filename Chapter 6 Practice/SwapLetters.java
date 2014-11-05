import java.util.Random;
import java.util.Scanner;


public class SwapLetters
{
public static void main (String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("Please enter a word: ");
String word= s.next();
int repeat = word.length();
int counter= 0;
Random randomizer= new Random();
while (counter<=repeat)
{

int i= randomizer.nextInt(word.length()-1);
int j= randomizer.nextInt(word.length()-1-i)+1+i;
String first= word.substring(0,i);
String middle= word.substring(i+1,j);
String last= word.substring(j+1);
System.out.println(first+word.charAt(j)+middle+word.charAt(i)+last);
counter++;
}
}
}