import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Initialize a variable to store the result
        int result = 0;

        // Iterate through the Roman numeral from left to right
        for (int i = 0; i < roman.length(); i++) {
            char currentSymbol = roman.charAt(i);

            // Check the value of the current Roman numeral symbol
            int value = 0;
            if (currentSymbol == 'I') {
                value = 1;
            } else if (currentSymbol == 'V') {
                value = 5;
            } else if (currentSymbol == 'X') {
                value = 10;
            } else if (currentSymbol == 'L') {
                value = 50;
            } else if (currentSymbol == 'C') {
                value = 100;
            } else if (currentSymbol == 'D') {
                value = 500;
            } else if (currentSymbol == 'M') {
                value = 1000;
            } else {
                System.out.println("Invalid Roman numeral.");
                return;
            }

            // Check for subtractive notation (e.g., IV, IX, XL, XC, etc.)
            if (i < roman.length() - 1) {
                char nextSymbol = roman.charAt(i + 1);
                if ((currentSymbol == 'I' && (nextSymbol == 'V' || nextSymbol == 'X'))
                        || (currentSymbol == 'X' && (nextSymbol == 'L' || nextSymbol == 'C'))
                        || (currentSymbol == 'C' && (nextSymbol == 'D' || nextSymbol == 'M'))) {
                    value = value-value;
                }
            }

            // Add the value to the result
            result = result +value;
        }

        // Print the result
        System.out.println("The equivalent integer is: " + result);
    }
}
