import java.util.Arrays;

public class Algo4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
