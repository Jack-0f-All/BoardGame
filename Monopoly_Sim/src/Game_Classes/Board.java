package Game_Classes;
public class Board {
    private Space[] board;
    private String name;
    private static int numberOfBoards = 1;
    private Deck community_cards = new Deck("Community Chest", 
        new Integer[]{0, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1});
    private Deck chance_cards = new Deck("Chance", 
        new Integer[]{39, 0, 24, 11, -9, -9, -8, -1, 0, -3, 10, -1, -1, 5, -1, -1});
        //Need to change 99. -3 goes back 3 spaces
    


    public Board(){
        name = "board_game_"+numberOfBoards++;

    }

    public Board(String n){
        name = n+"_"+numberOfBoards++;

    }

    public Board(String n, Space[] s){

        board = new Space[s.length];
        for(int i=0; i<s.length;i++){
            board[i] = s[i];
        }

        name = n+"_"+numberOfBoards++;
    }

    public void update(Player p){

        if(p.getPosition()>board.length-1){
            p.setPosition(p.getPosition()-board.length);
        }

        //increment number of lands on space
        board[p.getPosition()].landedOn();

        //Evaluate Chance space
        if(p.getPosition() == 7 ||p.getPosition() == 22 || p.getPosition() ==36){
            int newLocation=chance_cards.draw();
            System.out.println(p.getName() + " drew a Chance Card...: "+newLocation);
            if(newLocation>=0){
                p.setPosition(newLocation);
                update(p);
            }
            if(newLocation==-3){
                p.setPosition(p.getPosition()-3);
                update(p);
            }
            if(newLocation==-9){
                advanceToRR(p);
                update(p);
            }
            if(newLocation==-8){
                advanceToUtility(p);
                update(p);
            }
        }
        else{
            if(p.getPosition()== 2 || p.getPosition()== 17 || p.getPosition()== 33){
                int newLocation=community_cards.draw();
                System.out.println(p.getName() + " drew a Community Chest Card...: "+newLocation);
                if(newLocation>=0){
                    p.setPosition(newLocation);
                    update(p);   
                }  
                }
        }


    }

    private void advanceToRR(Player p){
        int position = p.getPosition();
        // ToDo: Rewrite if logic. Don't need to check ranges of positions. 
        // This method will only be called if player is at chance space (position 7, 22, or 36)

        if(position>35||position<5){
            p.setPosition(5);
        }
        else if(position>25){
            p.setPosition(35);
        }
        else if(position>15){
            p.setPosition(25);
        }
        else{
            p.setPosition(15);
        }

        System.out.println("Advancing to RR --> "+board[p.getPosition()].getName());

    }


    private void advanceToUtility(Player p){
        int position = p.getPosition();

        if(position==7){
            p.setPosition(12);
        }
        else{
            p.setPosition(28);
        }

        
    }
    public void printTotals(){
        System.out.printf("Total lands per space on %s", name);
        System.out.println();

        for(Space s:board){
            System.out.printf("%s: %d%n",s.getName(),s.getTimesLanded());
        }


    }


    public String toString(){

        String output="";

        output+= "Name of board: "+ name+"\n\n";
        output+= "   Spaces on board: \n";

        for(Space s:board){
            output+="   "+s.getName() + "\n";
        }

        return output;

    }

public static void main(String[] args) {
    
}



}
