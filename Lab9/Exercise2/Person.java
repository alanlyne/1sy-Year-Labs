
public class Person {
    private String name;
    private String address;
    private int ppsNo;
    private static int counter = 1001;

    public Person(){
        setName("");
        setAddress("");
        this.ppsNo = counter++;
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
        this.ppsNo = counter++;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public int getPPSNo(){
        return this.ppsNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void showPerson(){
        System.out.println("*****PERSON DETAILS*****");
        System.out.println("NAME: " + getName());
        System.out.println("ADDRESS: " + getAddress());
        System.out.println("PPS NUMBER: " + getPPSNo());
    }

    public String toString(){
        return "NAME: " + getName() + "\nADDRESS: " + getAddress() + "\nPPS NUMBER: " + getPPSNo();
    }

}