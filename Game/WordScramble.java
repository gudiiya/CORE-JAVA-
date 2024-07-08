import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordScramble {
    public static void main(String[] args) {
        // List of words for the game
        String[] words = {"programming", "java", "computer", "science", "keyboard", "mouse", "screen", "internet", "network", "memory"};
        
        // Choose a random word from the list
        String originalWord = words[(int) (Math.random() * words.length)];
        
        // Scramble the chosen word
        String scrambledWord = scrambleWord(originalWord);
        
        // Game introduction
        System.out.println("Welcome to the Word Scramble Game!");
        System.out.println("Unscramble the letters to make a valid word.");
        System.out.println("Here is your scrambled word: " + scrambledWord);
        
        // Get user input
        Scanner scanner = new Scanner(System.in);
        String userGuess = "";
        
        // Game loop
        while (!userGuess.equalsIgnoreCase(originalWord)) {
            System.out.print("Your guess: ");
            userGuess = scanner.nextLine();
            
            if (userGuess.equalsIgnoreCase(originalWord)) {
                System.out.println("Congratulations! You guessed the word correctly.");
            } else {
                System.out.println("Incorrect! Try again.");
            }
        }
        
        scanner.close();
        System.out.println("Thank you for playing the Word Scramble Game!");
    }
    
    // Method to scramble a word
    private static String scrambleWord(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);
        StringBuilder scrambledWord = new StringBuilder();
        for (String letter : letters) {
            scrambledWord.append(letter);
        }
        return scrambledWord.toString();
    }
}
