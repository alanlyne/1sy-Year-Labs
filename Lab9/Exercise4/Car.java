
public class Car extends Vehicle{

    private boolean sportsModel;

    public Car(){
        super();
        this.sportsModel = false;
    }
    
    public Car (int n, String s, boolean b){
        super(n, s);
        this.sportsModel = b;
    }

    public void setSportsModel(boolean sports){
        sportsModel = sports;
    }

    public boolean isSportsModel(){
        return sportsModel;
    }
}