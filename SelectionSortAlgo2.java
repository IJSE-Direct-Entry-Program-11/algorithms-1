import java.util.Arrays;

public class SelectionSortAlgo2 {
    public static void main(String[] args) {
        int[] nums = {-5, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -20};
        System.out.println(Arrays.toString(nums));

        for (int k = 0; k < nums.length; k++) {
            int minIndex = k;
            int min = nums[minIndex];

            for (int i = (k+1); i < nums.length; i++) {
                if (min > nums[i]){
                    min = nums[i];
                    minIndex = i;
                }
            }

            nums[minIndex] = nums[k];
            nums[k] = min;            
        }

        System.out.println(Arrays.toString(nums));
    }
}
