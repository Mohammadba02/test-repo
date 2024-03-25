import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4},{3, 2, 1} };



        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];
        int i;
        int j = 0;

        for ( i = 0; i < rows1; i++) {
            for ( j = 0; j < cols2; j++) {
                //for (int k = 0; k < cols1; k++) {
                result[i][j] += matrix1[i][j] * matrix2[j][i];

            }
        }

        System.out.println("Result =");

        for ( i=0 ;i < rows1; i++) {
            for (j=0 ; j < cols2; j++) {


                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }

    }
}

