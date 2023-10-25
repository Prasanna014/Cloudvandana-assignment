import java.util.Scanner;

public class RTI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        scanner.close();

        int result = cRTI(romanNumeral);
        System.out.println("Integer equivalent: " + result);
    }

    public static int cRTI(String roman) {
        // Define the values for Roman numerals
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int result = 0;
        int index = 0;

        for (int i = 0; i < romanSymbols.length; i++) {
            while (roman.startsWith(romanSymbols[i], index)) {
                result += values[i];
                index += romanSymbols[i].length();
            }
        }

        return result;
    }
}
