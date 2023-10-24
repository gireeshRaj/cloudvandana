import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Convert the sentence to lowercase for case-insensitive checking
        sentence = sentence.toLowerCase();

        // Create a boolean array to track the presence of each letter
        boolean[] letterPresent = new boolean[26]; // 26 letters from 'a' to 'z'

        // Iterate through the sentence and mark letters as present
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            // Check if the character is a lowercase letter 'a' to 'z'
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Calculate the index to set in the array (0 for 'a', 1 for 'b', and so on)
                int index = currentChar - 'a';
                letterPresent[index] = true;
            }
        }

        // Check if all letters are present
        boolean isPangram = true;
        for (boolean present : letterPresent) {
            if (!present) {
                isPangram = false;
                break; // No need to continue checking
            }
        }

        // Display the result
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
