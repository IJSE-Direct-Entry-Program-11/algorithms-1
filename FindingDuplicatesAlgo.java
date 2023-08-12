import java.util.Scanner;

public class FindingDuplicatesAlgo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] nums = {1, 4, -5, 6, 55, 8, 4, 2, 20, -5, 6, 8 , 2 , 4, -5};

        do{
            System.out.print("Enter a number to find duplicates: ");
            int search = scanner.nextInt();
            scanner.nextLine();

            int duplicates = 0;
            String output = "Duplicates are found at: ";
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == search){
                    output += i + ",";
                    duplicates++;
                }
            }
            if (duplicates > 1){
                System.out.println("Number of duplicates found: " + duplicates);
                System.out.println(output + "\b ");
            }else if (duplicates == 1){
                System.out.println("No duplicates found!");
            }else {
                System.out.println(search + " does not exist");
            }

        }while(true);

    }
}
