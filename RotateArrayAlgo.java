import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayAlgo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));

        /*  
            + Counter-Clock-wise (Right => Left)
            - Clock-wise    (Left => Right)
            Eg. 2
            1-> {1, 2, 3, 4, 5, 6} => {6, 1, 2, 3, 4, 5}
            2-> {6, 1, 2, 3, 4, 5} => {5, 6, 1, 2, 3, 4}
         */

         do{
            System.out.print("Enter a number to rotate: ");
            int rotate = scanner.nextInt();
            scanner.nextLine();

            for (int k = 0; k < (rotate > 0 ? rotate : -rotate); k++) {
                int temp = rotate > 0 ? nums[nums.length -1 ] : nums[0];
                for (int i = 0; i < nums.length - 1; i++) {
                    int index = rotate < 0 ?  i : nums.length - 1 - i;
                    nums[index] = nums[index + (rotate < 0 ? 1 : -1)];
                }
                nums[rotate > 0 ? 0 : nums.length - 1] = temp; 
            }
            System.out.println(Arrays.toString(nums));
         }while (true);

    }
}
