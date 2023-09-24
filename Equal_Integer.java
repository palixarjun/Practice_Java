//write a program to check if two numbers are equal
import java.util.Scanner;
public class Equal_Integer
{
    public static void main (String [] args)
    {
        int num1, num2;
        Scanner ScanObj;
        ScanObj = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = ScanObj.nextInt();
        System.out.println("Enter the second number:");
        num2 = ScanObj.nextInt();
        if (num1 ==num2)
        {
            System.out.println(num1+" and " +num2+ " are equal.");
        }
        else
        {
            System.out.println(num1+ " and " +num2+ " are not equal.");
        }
        ScanObj.close();
    }
}