import java.util.Scanner;

public class onedArrayFind {
    public static void main(String args [])
    {
        int[] arr = {10, 20, 30, 40};
        Scanner input = new Scanner(System.in);
        int index;
        
        System.out.print("Enter index to check element: ");

        try
        {
            index = input.nextInt();
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound");
        }
        input.close();
    }
}