
public class Tester {
    public static void main(String[] args){
        Dog dog = new Dog();
        Tiger tig = new Tiger("omnivore", "purr");
        Horse hrs = new Horse("herbivore", "neigh", 40);

        dog.printDetails();
        dog.setAnimalSound("woof");
        dog.eatDogBiscuit();
        dog.printDetails();
        System.out.println(dog.getBiscuitsEaten());
        hrs.printDetails();
        hrs.setSpeed(48);
        System.out.println(hrs.getSpeed());
        tig.setAnimalDiet("carnivore");
        tig.printDetails();
    }
}