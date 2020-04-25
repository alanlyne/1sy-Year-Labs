public class TestSquare{
    public static void main (String[] args){
        Square[] arr = new Square[4];

        for(int i = 0; i <= 3; i++){
            arr[i] = new Square();
        }

        arr[0].setLength(10);
        arr[2].setLength(10);
        int i = 1;
        for(Square sq : arr){
            System.out.println("Square " + i + " has a side of " + sq.getLength());
            i++;
        }
        System.out.println("Square 1 has an area of " + arr[0].getArea());
        System.out.println("Square 2 has an area of " + arr[0].getArea());
    
        System.out.println(arr[2].toString());
    }
}