//Array Declaration
//Java String Data Program
public class ArrayDataTypeProgram
{
    public static void main (String [] args)
    {
        int [] MarksOfStudents = new int [] {65, 98,70, 60, 84};
        for (int i = 0; i<5; i++)
        {
            System.out.println("Marks of  Student " +(i+1)+ " is :" +MarksOfStudents[i]);
        }
    }
}