import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Person[] arr = new Person[3];
        for(int i = 0; i < 3; i++){
            arr[i] = new Person(scan.nextLine(), scan.nextLine());
        }

        System.out.println("Person 1 is called " + arr[0].getName());
        System.out.println("They live in " + arr[0].getAddress());
        System.out.println("Their PPS Number is: " + arr[0].getPPSNo());

        arr[1].setName("Alan Lyne");
        arr[1].setAddress("Meath");

        for(int i = 0; i < 3; i++){
            arr[i].showPerson();
        }

        System.out.println(arr[2].toString());
    }
}