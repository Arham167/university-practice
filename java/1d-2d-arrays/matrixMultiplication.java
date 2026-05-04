public class matrixMultiplication {
    public static void main(String args[])
    {
        int[][] matA = {
                        {1, 2, 3},
                        {4, 5, 6}
                       };
        int[][] matB = {
                        {7, 8},
                        {9, 10},
                        {11, 12}
                       };

        if (matA[0].length == matB.length)
        {
            for (int i = 0; i < matA.length; i++)
            {
                for (int j = 0; j < matB[0].length; j++)
                {
                    int sum = 0;
                    for (int k = 0; k < matB.length; k++)  
                        sum += matA[i][k] * matB[k][j];

                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.print("Can not multiply");
    }
}