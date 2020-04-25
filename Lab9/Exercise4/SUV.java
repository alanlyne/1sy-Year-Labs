
public class SUV extends Vehicle{
    private String wheelDrive;

    public SUV(){
        super();
        wheelDrive = "front";
    }

    public SUV(int doors, String brand, String wheel){
        super(doors, brand);
        this.wheelDrive = wheel;
    }

    public String getDrive(){
        return this.wheelDrive;
    }

    public void setDrive(String wheel){
        this.wheelDrive = wheel;
    }
}