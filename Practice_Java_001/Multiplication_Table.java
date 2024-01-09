//Wrtie a java program to print a multiplication table
import java.util.Scanner;
public class Multiplication_Table
{
    public static void main(String[] args)
    {
        Scanner ScanObj;
        ScanObj = new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num = ScanObj.nextInt();
        for(int i = 0; i<=10;i++)
        {
            System.out.println(num + "*" + i + "=" + (num*i));
        }
        ScanObj.close();

    }
}