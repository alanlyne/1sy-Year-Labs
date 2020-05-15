public class Exercise2 {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int index = firstNonRepeat(str);

        System.out.println(index == -1 ? index : index + "\n" + str.charAt(index));
    }

    public static int firstNonRepeat(String str) {
        int NO_OF_CHARS = 256;
        char count[] = new char[NO_OF_CHARS];
        int index = -1, j;

        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;

        for (j = 0; j < str.length(); j++) {
            if (count[str.charAt(j)] == 1) {
                index = j;
                break;
            }
        }
        return index;
    }

}