package Game_Classes;

public class Dice {
    int sides;
    int numberOfDice;
    public Dice(){
        
    }
    public Dice(int s){
        sides=s;
    }

    public Dice(int number, int sides){
        numberOfDice = number;
        this.sides = sides;
    }

    public int rollForTotal() {
        
        int total = 0;
        
        for(int i=numberOfDice;i>0;i--){
            total += (int)(Math.random() * sides) + 1;
        }
        
        return total;
    }

    public static void main(String[] args) {
        
    }
}
