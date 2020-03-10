// Java profgram to print  
// number in digital form 
import java.io.*; 
import java.util.*; 
  
public class Peer { 
    // Function to print numbers 
    public static void print(int mat[][]) 
    { 
        // If in matrix row number is even then print "-" 
        // otherwise print "|" 
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) { 
                if (i % 2 == 0) { 
                    if (mat[i][j] == 1) 
                        System.out.print("-"); 
                    else
                        System.out.print(" "); 
                } 
                else { 
                    if (mat[i][j] == 1) 
                        System.out.print("|"); 
                    else
                        System.out.print(" "); 
                } 
            } 
            System.out.println(); 
        } 
    } 
    public static void digit0() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 } }; 
        print(mat); 
    } 
    public static void digit1() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 0, 0, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 0, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 0, 0, 0 } }; 
        print(mat); 
    } 
    public static void digit2() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 0, 1, 0, 1, 0 } }; 
        print(mat); 
    } 
    public static void digit3() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 } }; 
        print(mat); 
    } 
    public static void digit4() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 0 } }; 
        print(mat); 
    } 
    public static void digit5() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 } }; 
        print(mat); 
    } 
    public static void digit6() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 } }; 
        print(mat); 
    } 
    public static void digit7() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 0 } }; 
        print(mat); 
    } 
    public static void digit8() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 } }; 
        print(mat); 
    } 
    public static void digit9() 
    { 
        // In matrix 0 used for space 
        // and 1 for either - or | 
        int mat[][] = { { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 } }; 
        print(mat); 
    } 
      
    // Function to check number 
    public static void checkDigit(int num) 
    { 
        // for digit 0 
        if (num == 0) 
            digit0(); 
      
        // for digit 1 
        else if (num == 1) 
            digit1(); 
      
        // for digit 2 
        else if (num == 2) 
            digit2(); 
      
        // for digit 3 
        else if (num == 3) 
            digit3(); 
      
        // for digit 4 
        else if (num == 4) 
            digit4(); 
      
        // for digit 5 
        else if (num == 5) 
            digit5(); 
      
        // for digit 6 
        else if (num == 6) 
            digit6(); 
      
        // for digit 7 
        else if (num == 7) 
            digit7(); 
      
        // for digit 8 
        else if (num == 8) 
            digit8(); 
      
        // for digit 9 
        else if (num == 9) 
            digit9(); 
    } 
      
    // Driver program 
    public static void main (String[] args)  
    { 
        // Input a number 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      
        // function call to check digit 
        checkDigit(num); 
          
    } 
} 