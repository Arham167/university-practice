public class onedArrayEvenCount {
    public static void main(String args[])
    {
        int[] arr = {2, 5, 8, 3, 10, 7};
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0)
                count += 1;

        System.out.print(count);
    }
}