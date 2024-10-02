package Game_Classes;

public class Dice {
    int sides;

    public Dice(){
        
    }
    public Dice(int s){
        sides=s;
       
    }

    public int roll() {
        return (int)(Math.random() * sides) + 1;
    }

    public static void main(String[] args) {
        
    }
}
