import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] nums = {-5, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -20};
        System.out.println(Arrays.toString(nums));

        for (int k = nums.length; k >= 1; k--) {
            int maxIndex = 0;
            int max = nums[maxIndex];

            for(int i = 1; i < k; i++){
                if (max < nums[i]){
                    max = nums[i];
                    maxIndex = i;
                }
            }

            nums[maxIndex] = nums[k - 1];
            nums[k - 1] = max; 
        }
    
        System.out.println(Arrays.toString(nums));
    }
}
