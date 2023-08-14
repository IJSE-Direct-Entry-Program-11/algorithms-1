import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            System.out.print("Enter a text: ");
            char[] chars = scanner.nextLine().strip().toCharArray();
            if (chars.length == 0){
                System.out.println("Text can't be empty");
                continue;
            }
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > 128){
                    System.out.println("Only ASCII characters are supported");
                    continue loop;
                }
            }

            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }while(true);
    }
}
