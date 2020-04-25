
public class Dog extends Animal {
    public int numDogDiscuitsEaten;

    public Dog(){
        super();
        this.numDogDiscuitsEaten = 0;
    }

    public Dog(String diet, String sound){
        super(diet, sound);
        this.numDogDiscuitsEaten = 0;
    }

    public int getBiscuitsEaten(){
        return this.numDogDiscuitsEaten;
    }

    public void eatDogBiscuit(){
        this.numDogDiscuitsEaten++;
    }
}