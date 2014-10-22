import java.util.Scanner;

public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a wavelength in meters: ");
        double wavelength = scan.nextDouble();
        
        if (wavelength>1e-1)
        {
            System.out.println("This is a radio wave.");
        }
        else if (wavelength>1e-3 && wavelength<=1e-1)
        {
            System.out.println("This is a microwave.");
        }
        else if (wavelength>7e-7 && wavelength<=1e-3)
        {
            System.out.println("This is an infrared.");
        }
        else if (wavelength>4e-7 && wavelength<=7e-7)
        {
            System.out.println("This is a visible light.");
        }
        else if (wavelength>1e-8 && wavelength<=4e-7)
        {
            System.out.println("This is an ultraviolet.");
        }
        else if (wavelength>1e-11 && wavelength<=1e-8)
        {
            System.out.println("This is an X-ray");
        }
        else
        {
            System.out.println("This is a gamma ray");
        }
        
    }

}
