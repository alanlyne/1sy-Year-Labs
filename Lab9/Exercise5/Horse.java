
public class Horse extends Animal{
    public int speed;

    public Horse(){
        super();
        speed = 35;
    }

    public Horse(String diet, String sound, int speed){
        super(diet, sound);
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int spd){
        this.speed = spd;
    }
}