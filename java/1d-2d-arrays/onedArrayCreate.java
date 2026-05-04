import java.util.Scanner;

public class onedArrayCreate {
    public static void main(String args[])
    {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers you want to add in array: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.nextInt();

        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);

        input.close();
    }
}