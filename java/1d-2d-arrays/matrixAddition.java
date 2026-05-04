public class matrixAddition {
    public static void main(String args[])
    {
        int matA[][] = {
                        {1, 2},
                        {3, 4}
                       };
        int matB[][] = {
                        {5, 6},
                        {7, 8}
                       };

        for (int i = 0; i < matA.length; i++)
        {
            for (int j = 0; j < matB[0].length; j++)
                System.out.print(matA[i][j] + matB[i][j] + " ");
            System.out.println();
        }
    }
}