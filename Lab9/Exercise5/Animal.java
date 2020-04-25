
public class Animal {
    public String animalDiet;
    public String animialSound;

    public Animal(){
        this.animalDiet = "Undefined";
        this.animialSound = "Undefined";
    }

    public Animal(String diet, String sound){
        this.animalDiet = diet;
        this.animialSound = sound;
    }

    public String getAnimialDiet(){
        return this.animalDiet;
    }

    public String getAnimalSound(){
        return this.animialSound;
    }

    public void setAnimalDiet(String diet){
        this.animalDiet = diet;
    }

    public void setAnimalSound(String sound){
        this.animialSound = sound;
    }

    public void printDetails(){
        System.out.println("Diet: " + this.animalDiet);
        System.out.println("Sound: " + this.animialSound);
    }
}