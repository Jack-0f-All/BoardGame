package Game_Classes;

public class Player {
    private int position;
    private String name;



    public Player(){
        position = 0;
        name = "";
    }

    public Player(String n){
        name = n;
        position = 0;
    }


    public void move(int roll){
        position += roll;
    }

    public void setPosition(int pos){
        position = pos;
    }

    public int getPosition(){
        return position;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "Name of player: " + name;
    }
}
