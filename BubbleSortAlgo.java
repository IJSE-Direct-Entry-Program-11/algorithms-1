import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        
        int[] nums = {-5, 2, 3, 1, 7, -5, 0, 2, 2, 6, 4};

        // 1 =>  [-5, 2], 3, 1, 7, -5, 0, 2, 2, 6, 4
        // 2 =>  -5, [2, 3], 1, 7, -5, 0, 2, 2, 6, 4
        // 3 =>  -5, 2, [3, 1], 7, -5, 0, 2, 2, 6, 4 => -5, 2, [1, 3], 7, -5, 0, 2, 2, 6, 4
        // 4 =>  -5, 2, 1, [3, 7], -5, 0, 2, 2, 6, 4
        // 5 =>  -5, 2, 1, 3, [7, -5], 0, 2, 2, 6, 4 => -5, 2, 1, 3, [-5, 7], 0, 2, 2, 6, 4
        // 6 =>  -5, 2, 1, 3, -5, [7, 0], 2, 2, 6, 4 => -5, 2, 1, 3, -5, [0, 7], 2, 2, 6, 4
        // 7 =>  -5, 2, 1, 3, -5, 0, [7, 2], 2, 6, 4 => -5, 2, 1, 3, -5, 0, [2, 7], 2, 6, 4
        // 8 =>  -5, 2, 1, 3, -5, 0, 2, [7, 2], 6, 4 => -5, 2, 1, 3, -5, 0, 2, [2, 7], 6, 4 
        // 9 =>  -5, 2, 1, 3, -5, 0, 2, 2, [7, 6], 4 => -5, 2, 1, 3, -5, 0, 2, 2, [6, 7], 4
        // 10 => -5, 2, 1, 3, -5, 0, 2, 2, 6, [7, 4] => -5, 2, 1, 3, -5, 0, 2, 2, 6, [4, 7]

        for (int k = 0; k < nums.length; k++) {
            for (int i = 1; i < nums.length - k; i++) {
                if (nums[i - 1] > nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }

    }
}
