import java.util.Arrays;

public class MatrixAlgo3 {
    public static void main(String[] args) {
        
        int[][] m1 = {
            {2, 3, -1, 2},
            {4, -2, 7, 3},
            {-8, 2, 1, -4},
            {2, 3, 1, 2},
        };

        int[][] m2 = {
            {1, 7 , -8, 2},
            {-4, 6 , 2, 3},
            {2, 3 , -1, 2},
            {4, 1, 2, 3},
        };

        int[][] result = new int[m1.length][m1[0].length];

        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                result[row][col] = m1[col][row] + m2[row][col];
            }
        }

        for (int row = 0; row < result.length; row++) {
            System.out.println(Arrays.toString(result[row]));
        }
    }
}
