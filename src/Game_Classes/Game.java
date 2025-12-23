package Game_Classes;
public class Game {
    public static void main(String[] args) throws Exception {
        Player[] ALL_PLAYERS = new Player[]{
            new Player("Tess"),
            new Player("Ethan"),
            new Player("Dandy")
        };
        
        Dice dice = new Dice(2,6);
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


        int turns = 400;


        while(turns>0){

            for(Player p:ALL_PLAYERS){
                p.move(dice.rollForTotal());
                board.update(p);
            }

            turns--;
        }


        board.printTotals();



        // System.out.println(board);
        // for(Player p:ALL_PLAYERS){
        //     System.out.println(p);
        // }
        /* 
        System.out.println(pOne);
        System.out.println(pTwo);
        System.out.println(pThree);
        */
        
    }
}
