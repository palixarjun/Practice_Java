//Write a Java Program to sweap two numbers
import java.util.Scanner;
public class Swap_Integers
{
    public static void main (String [] args)
    {
        int num1, num2, temp;
        Scanner ScanObj;
        ScanObj = new Scanner(System.in);
        System.out.println("Enter the first number: --");
        num1 = ScanObj.nextInt();
        System.out.println("Enter the second number: --");
        num2 = ScanObj.nextInt();
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping");
        System.out.println("First number:" +num1);
        System.out.println("Second number:" +num2);
        ScanObj.close();
    }
}