//Write a java Program to take string as an input and print it 
import java.util.Scanner;

public class Sample2
{
    public static void main (String [] args)
    {
        String UserName;
        Scanner ScanObj1;
        ScanObj1 = new Scanner(System.in);
        System.out.println("Enter the Username :");
        UserName = ScanObj1.nextLine();
        System.out.println("UserName is :" + UserName);
        ScanObj1.close();
    }
}