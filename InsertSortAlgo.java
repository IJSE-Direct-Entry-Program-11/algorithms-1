import java.util.Arrays;

public class InsertSortAlgo {
    public static void main(String[] args) {
        // 1. InsertSortAlgo (Linear Search)
        // 2. InsertSortAlgo (Binary Search) = BinaryInsertionSort

        int[] nums = {3, -2, -5, 7, -5, 4, 2, 4, 6, -3};
        System.out.println(Arrays.toString(nums));

        for (int i = 1; i < nums.length; i++) {
            int number = nums[i];
            
            System.out.println("-----------------");
            System.out.println("Number: " + number);
            if (number > nums[i - 1]) continue;

            // Finding the position
            int insertionIndex = -1;
            for (int j = 0; j < i; j++) {
                if (nums[j] > number) {
                    insertionIndex = j;
                    break;
                }
            }            
            System.out.println("Insertion Index: " + insertionIndex);
            
            insertionIndex = -1;
            int start = 0;
            int end = i;
            while (true){
                if (start >= end) {
                    insertionIndex = start;
                    break;
                }
                int middle = (start + end) / 2;
                if (nums[middle] == number){
                    insertionIndex = middle;
                    break;
                }else if (nums[middle] < number){
                    start = middle + 1;
                }else {
                    end = middle;
                }
            }
            System.out.println("Insertion Index: " + insertionIndex);

            // Shifting
            for (int j = i; j > insertionIndex; j--) {
                nums[j] = nums[j - 1];
            }
            System.out.println(Arrays.toString(nums));

            // Insertion
            nums[insertionIndex] = number;
            System.out.println(Arrays.toString(nums));
        }
    }
}
