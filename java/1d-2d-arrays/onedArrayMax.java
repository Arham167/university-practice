public class onedArrayMax {
    public static void main(String args[])
    {
        int[] arr = {-3, -5, -9};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        System.out.print(max);
    }
}