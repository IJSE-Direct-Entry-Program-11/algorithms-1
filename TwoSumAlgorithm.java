import java.util.Scanner;

public class TwoSumAlgorithm {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {1, 3, -2, -1, 4, 5, 7};

        do{
            System.out.print("Enter the target number: ");
            int target = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < nums.length - 1; i++) {
                for (int k = i; k < nums.length; k++) {
                    if (nums[i] + nums[k] == target){
                        System.out.printf("%d[%d] + %d[%d] = %d \n", 
                            nums[i], i, nums[k], k, target);
                    }
                }
            }
        }while (true);
    }
}
