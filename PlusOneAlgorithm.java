import java.util.*;

public class PlusOneAlgorithm{

    public static void main(String[] args) {
        int[] nums = {8,9};
        int pow = 1;

        int number = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            number += nums[i] * pow;
            pow *= 10;
        }
    
        number++;
        int[] answer = new int[number / pow > 0 ? nums.length + 1: nums.length];
        System.out.println(Arrays.toString(answer));

        
    }
}