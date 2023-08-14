import java.util.*;

public class PlusOneAlgorithm{

    public static void main(String[] args) {
        int[] nums = {1,2,3,0};
        int pow = 1;

        int number = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            number += nums[i] * pow;
            pow *= 10;
        }
    
        number++;
        int[] answer = new int[number / pow > 0 ? nums.length + 1: nums.length];

        if (answer.length == nums.length) pow /= 10;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = number / pow;
            number %= pow;
            pow /= 10;
        }

        System.out.println(Arrays.toString(answer));
    }
}