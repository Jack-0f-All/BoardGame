package Game_Classes;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private String type;
    private ArrayList<Integer> standard_cards = new ArrayList<>();
    private ArrayList<Integer> cards = new ArrayList<>();

    public Deck(String type, Integer[] c){
        
        this.type=type;

        for(int i=0; i<c.length;i++){
            standard_cards.add(c[i]);
        }

        shuffle();
    }
    
    public Integer draw(){

        if(cards.isEmpty()){
            shuffle();
        }

        //for simplicity, 0 is the "top" of the deck.
        //functionally, there is no difference for either convention.
        return cards.remove(0);
    }


    private void shuffle(){

        cards = new ArrayList<>(standard_cards);

        int shuffleCount = 0;

        while(shuffleCount<7){
            Collections.shuffle(cards);
            shuffleCount++;
        }

    
    }
    public String toString(){
        String output = "";
        for(Integer c:cards){
            output+= c + ",";
        }

        return output;

    }

    public static void main(String[] args) {
        Integer[] demoInteger = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Deck demo = new Deck("demo", demoInteger);

        for(int i=10; i>0; i--){
            System.out.println(demo);
            demo.shuffle();
        }
       
    }

}
