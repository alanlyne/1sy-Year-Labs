import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] m = {19, 190, 1990, 9, 90, 1};
        int start = m.length-1;
        System.out.println(minArrayIter(m));
        System.out.println(minArrayRec(m, start));
    }

    public static int minArrayIter(int[] a){

        int temp = a[0];
        for(int i = 0; i < a.length; i++){
            if(temp > a[i]){
                temp = a[i];
            }
        }
        return temp;
    }

    public static int minArrayRec(int[] a, int start){
        if (start < 0){
            return a[0];
        }

        if((a[start] < a[0])){
            a[0] = a[start]; 
        }
        minArrayRec(a, start-1);
        return a[0];
    }
}