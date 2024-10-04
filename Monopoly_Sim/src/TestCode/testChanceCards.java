package TestCode;

import Game_Classes.Board;
import Game_Classes.Player;
import Game_Classes.Space;

public class testChanceCards {
     public static void main(String[] args) {
        Space[] monopolySpaces =  new Space[] {
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

        Board board = new Board("Monopoly",  monopolySpaces);
        
        Player pOne = new Player("Dummy");


        

        //runAllCards(board,pOne);
        //advanceTo_test(board, pOne);
        
    }


    public static void runAllCards(Board board, Player pOne){

        for(int i = 16; i>0;i--){
            pOne.setPosition(7);
            board.update(pOne);
            System.out.println();
        }
        
        for(int i = 17; i>0;i--){
            pOne.setPosition(33);
            board.update(pOne);
            System.out.println();
        }
    }


    public static void advanceTo_test(Board b, Player p){
        


        //Change relevant methods in Board.java to public for tests to work.
    
        System.out.println("Testing advance to RR from Chance...\n");
        p.setPosition(7);
        System.out.println("Player position: "+p.getPosition());
        b.advanceToRR(p);

        p.setPosition(22);
        System.out.println("\nPlayer position: "+p.getPosition());
        b.advanceToRR(p);

        p.setPosition(36);
        System.out.println("\nPlayer position: "+p.getPosition());
        b.advanceToRR(p);

        System.out.println("________________________________________________________");


        System.out.println("\nTesting advance to Utilities from Chance...");

        p.setPosition(7);
        System.out.println("\nPlayer position: "+p.getPosition());
        b.advanceToUtility(p);

        p.setPosition(22);
        System.out.println("\nPlayer position: "+p.getPosition());
        b.advanceToUtility(p);

        p.setPosition(36);
        System.out.println("\nPlayer position: "+p.getPosition());
        b.advanceToUtility(p);

        System.out.println("________________________________________________________\n\n");
    }
}
