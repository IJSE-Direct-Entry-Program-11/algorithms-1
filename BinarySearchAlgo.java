import java.util.Scanner;

public class BinarySearchAlgo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] nums = {-5, -2, 0, 3, 5, 8, 11};

        loop:
        do{
            System.out.print("Enter a number to search: ");
            int search = scanner.nextInt();
            scanner.nextLine();

            int start = 0;
            int end = nums.length;

            while(true){
                if (start >= end) break;
                int middle = (start + end) / 2;

                if (search == nums[middle]){
                    System.out.println("Found at: " + middle);
                    continue loop;
                }else if (search > nums[middle]){
                    start = middle + 1;
                }else{
                    end = middle;
                }
            }
            System.out.println("Not Found");
        }while(true);
    }
}