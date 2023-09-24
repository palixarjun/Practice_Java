//write a program to take integer as an input and print it 

import java.util.Scanner;
public class Sample1
{
    public static void main (String [] args)
    {
        Scanner ScanObj;
        ScanObj = new Scanner(System.in);
        int num;
        System.out.println("Enter the integer:");
        num = ScanObj.nextInt();
        System.out.println("Entered Integer is :" +num);
        ScanObj.close();
    }
}