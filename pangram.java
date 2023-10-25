import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String input) {

        input = input.replaceAll("\\s", "").toLowerCase();

        int[] letterCount = new int[26];

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                letterCount[index]++;
            }
        }

        for (int count : letterCount) {
            if (count == 0) {
                return false;
            }
        }

        return true;
    }
}
