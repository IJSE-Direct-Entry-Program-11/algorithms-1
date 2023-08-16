import java.util.Arrays;

public class MatrixAlgo1 {
    public static void main(String[] args) {
        
        int[][] m1 = {
                    {2, 3, -1, 2},
                    {4, -2, 7, 3},
                    {-8, 2, 1, -4},
                    };

        // m1 = -m1;

        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                m1[row][col] = -m1[row][col];
            }
        }

        for (int row = 0; row < m1.length; row++) {
            System.out.println(Arrays.toString(m1[row]));
        }
    }
}
