public class SingleNumberAlgo {
    public static void main(String[] args) {
        int[] nums = {2, 6, 2, 4, 7, 5, 4, 2, 5, 1, 6, 1, 6, 4, 3};

        loop:
        for (int i = 0; i < nums.length; i++) {
            int number  = nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (number == nums[j] && i != j) continue loop;
            }
            System.out.printf("Found %d at %d \n", number, i);
            // break;
        }
    }
}