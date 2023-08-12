import java.util.Scanner;

public class LinearSearchAlgo {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = { 20, 30, -40, 10, -5, 2, 3, 7, -10, 25, 17, -52 };

        loop:
        do {
            System.out.print("Enter a number to search: ");
            int search = scanner.nextInt();
            scanner.nextLine();

            //boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == search){
                    System.out.println("Found at index: " + i);
                    continue loop;
                }
            }

            System.out.println("Not found!");
            //if (!found) System.out.println("Not found!");
        }while(true);
    }
}