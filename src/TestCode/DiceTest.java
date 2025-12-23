package TestCode;

import java.util.HashMap;
import Game_Classes.Dice;

public class DiceTest {
    public static void main(String[] args) {
        Dice dice = new Dice(6);  // A 6-sided dice
        int rolls = 90000000;       // Number of trials (rolls)
        
        // Create a map to count occurrences of each face
        HashMap<Integer, Integer> rollCount = new HashMap<>();
        
        // Initialize the count for each face
        for (int i = 1; i <= 6; i++) {
            rollCount.put(i, 0);
        }
        
        // Roll the dice many times and update the count
        for (int i = 0; i < rolls; i++) {
            int result = dice.rollForTotal();
            rollCount.put(result, rollCount.get(result) + 1);
        }
        
        // Display the results
        System.out.println("Dice roll distribution after " + rolls + " rolls:");
        for (int i = 1; i <= 6; i++) {
            System.out.println("Face " + i + ": " + rollCount.get(i) + " times (" 
                + ((rollCount.get(i) * 100.0) / rolls) + "%)");
        }
        
        // Expected frequency for each face in a fair dice
        double expectedFrequency = rolls / 6.0;
        double expectedPercentage = 100/6.0;
        System.out.printf("%nExpected frequency for each face: %.2f times (%.4f%%)%n", expectedFrequency,expectedPercentage);
    }
}
