public class Exercise4 {
    public static void main(String[] args) {
        String s1 = "Wednesday is hump day";
        System.out.println(high(s1));
    }

    public static String high(String s) {
        String[] words = s.split(" ");
        int max = 0;
        String sToReturn = null;
        
        for (String word : words) {
            char[] tempWordChars = word.toCharArray();
            int total = 0;
            for (int j = 0; j < tempWordChars.length; j++) {
                total = total + (int) tempWordChars[j];
            }
            if (total > max) {
                sToReturn = word;
                max = total;
            }
        }
        return sToReturn;
    }
}