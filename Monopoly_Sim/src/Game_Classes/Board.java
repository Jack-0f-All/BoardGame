package Game_Classes;
public class Board {
    private Space[] board;
    private String name;
    private static int numberOfBoards = 1;
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
