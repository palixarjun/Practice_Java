//Write a program to check whether the given number is odd or even
import java.util.Scanner;
public class Odd_Even
{
    public static void main ( String [] args)
    {
        int num;
        Scanner ScanObj2;
        ScanObj2 = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        num = ScanObj2.nextInt();
        if (num%2==0)
        {
            System.out.println("The given number "+num+" is Even.");
        }
        else
        {
            System.out.println("The given number "+num+" is odd.");
        }
        ScanObj2.close();
    }
    
}