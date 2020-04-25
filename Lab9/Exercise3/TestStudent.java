import java.util.*;
public class TestStudent {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Student[] arr = new Student[3];

        for(int i = 0; i < 3; i++){
            arr[i] = new Student(scan.nextLine(), scan.nextLine());
        }

        for(Student st: arr){
            st.showStudent();
        }

        arr[0].setCourse("CSSE");
        arr[0].showStudent();

        arr[2].setName("Alan Lyne");
        System.out.println(arr[2].getName());
    }
}