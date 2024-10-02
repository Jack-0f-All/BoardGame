package TestCode;
import Game_Classes.Board;
import Game_Classes.Space;
import Game_Classes.Dice;

import java.util.HashMap;
public class demo_Code {
    

    public static void main(String[] args) {
        



    Space[] s = new Space[] {
        new Space("Go", "Other"),
        new Space("Mediterranean Avenue", "Brown"),
        new Space("Community Chest", "Card"),
        new Space("Baltic Avenue", "Brown"),
        new Space("Income Tax", "Other"),
        new Space("Reading Railroad", "Railroad"),
        new Space("Oriental Avenue", "Light Blue"),
        new Space("Chance", "Card"),
        new Space("Vermont Avenue", "Light Blue"),
        new Space("Connecticut Avenue", "Light Blue"),
        new Space("Jail", "Other"),
        new Space("St. Charles Place", "Pink"),
        new Space("Electric Company", "Utility"),
        new Space("States Avenue", "Pink"),
        new Space("Virginia Avenue", "Pink"),
        new Space("Pennsylvania Railroad", "Railroad"),
        new Space("St. James Place", "Orange"),
        new Space("Community Chest", "Card"),
        new Space("Tennessee Avenue", "Orange"),
        new Space("New York Avenue", "Orange"),
        new Space("Free Parking", "Other"),
        new Space("Kentucky Avenue", "Red"),
        new Space("Chance", "Card"),
        new Space("Indiana Avenue", "Red"),
        new Space("Illinois Avenue", "Red"),
        new Space("B&O Railroad", "Railroad"),
        new Space("Atlantic Avenue", "Yellow"),
        new Space("Ventnor Avenue", "Yellow"),
        new Space("Water Works", "Utility"),
        new Space("Marvin Gardens", "Yellow"),
        new Space("Go to Jail", "Other"),
        new Space("Pacific Avenue", "Green"),
        new Space("North Carolina Avenue", "Green"),
        new Space("Community Chest", "Card"),
        new Space("Pennsylvania Avenue", "Green"),
        new Space("Short Line", "Railroad"),
        new Space("Chance", "Card"),
        new Space("Park Place", "Dark Blue"),
        new Space("Luxury Tax", "Other"),
        new Space("Boardwalk", "Dark Blue")
    };

    Board demo_board = new Board("Demo",s);


    //System.out.println(demo_board);



    Dice dice = new Dice(6);

    int rolls = 100000;       // Number of trials (rolls)
        
    // Create a map to count occurrences of each face
    HashMap<Integer, Integer> rollCount = new HashMap<>();
    
    // Initialize the count for each face
    for (int i = 1; i <= 6; i++) {
        rollCount.put(i, 0);
    }
    
    // Roll the dice many times and update the count
    for (int i = 0; i < rolls; i++) {
        int result = dice.roll();
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
    System.out.println("\nExpected frequency for each face: " + expectedFrequency);


    }
        
}
