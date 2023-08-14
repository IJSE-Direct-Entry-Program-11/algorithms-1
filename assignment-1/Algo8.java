public class Algo8 {
    public static void main(String[] args) {

        int[] numA = { 2, 4, 6, 8, 10, -4, -2 };
        int[] numB = { 7, 8, -8, 2, 1, -9, 6 };

        System.out.print("numA \u2229 numB = {");
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    System.out.print(numA[i] + ", ");
                }
            }
        }
        System.out.print("\b\b}\n");
    }
}
