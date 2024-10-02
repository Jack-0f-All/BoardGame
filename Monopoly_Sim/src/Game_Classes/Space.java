package Game_Classes;
public class Space {
    private String type;
    private int times_landed;
    private String name;


    public Space(){
        type = "";
        name = "";
        times_landed=0;
    }

    public Space(String n, String t){
        type = t;
        name = n;
        times_landed = 0;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getTimesLanded(){
        return times_landed;
    }



    //setter
    public void landedOn(){
        times_landed++;
    }



    public String toString(){
        
        String output = "Name: " + name +"\n";

        output+= "Type: " + type +"\n";
        output+= "Times landed on: " + times_landed +"\n";

        return output;
    }


public static void main(String[] args) {
    
    System.out.println("\n\nRunning test of Space class...\n\n\n");

    try {
        // to sleep 10 seconds
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        // recommended because catching InterruptedException clears interrupt flag
        Thread.currentThread().interrupt();
        // you probably want to quit if the thread is interrupted
        return;
    }
    
    String n = "test";
    String t = "demo";

    Space demo = new Space(n,t);
    Space demo2 = new Space(n,t);

    System.out.println(demo);
    System.out.println(demo2);
}
}
