
public class Exercise5 {
    public static void main(String[] args) {
        String[] names = {"Vicky Violet", "Uppy Umbrella", "Dippy Duck", "Annie Apple", "Oscar Orange", "Eddie Elephant"};

        String[] sortedNames = bubble(names);
        for(int i = 0; i < sortedNames.length-1; i++) {
            System.out.print(sortedNames[i] + ", ");
        }
        for(int i = sortedNames.length - 1; i < sortedNames.length; i++) {
            System.out.print(sortedNames[i]);
        }
    }

    public static String[] bubble(String[] names){
        String temp;
        for(int i = 0; i < names.length; i++){
            for(int j = 0; j < names.length; j++){
                String[] s1 = names[i].split("\\s*");
                String[] s2 = names[j].split("\\s*");

                if(s1[0].compareTo(s2[0]) < 0){
                    temp = names[j];
			        names[j] = names[i];
			        names[i] = temp;
                }
            }
        }
        return names;
    }

}