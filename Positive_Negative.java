//write a Java Program to check whether a number is positive or negative
import java.util.Scanner;
public class Positive_Negative
{
    public static void main (String [] args)
    {
        int num;
        Scanner ScanObj4;
        ScanObj4 = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        num = ScanObj4.nextInt();
        if (num>0)
        {
            System.out.println("The given number "+num+" is postive");
        }
        else
        {
            System.out.println("The given number "+num+" is negative");
        }
        ScanObj4.close();
    }
}