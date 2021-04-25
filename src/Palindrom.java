import java.util.ArrayList;

public class Palindrom {

    public static Boolean checkifPalindromIterativ(String string1, String string2) {

        char[] one = string1.toLowerCase().toCharArray();
        char[] two = string2.toLowerCase().toCharArray();

        int sumone = 0;
        int sumtwo = 0;

        for (char c : one) {
            sumone += (int) c;
        }
        for (char c : two) {
            sumtwo += (int) c;
        }

        if (sumone == sumtwo) {
            return true;
        }
        return false;
    }

    static int summone = 0;
    static int summetwo = 0;

    public static void checkIfPalindromRecursiv(String string1, String string2) {

        if (string1.isBlank() && string2.isBlank() || string1.isBlank() || string2.isBlank()) {
            if (summone == summetwo) {
                System.out.print(true);
            }
        }

        String[] one = string1.split("*");
        String[] two = string2.split("*");

        summone += Integer.valueOf(one[0]);
        summetwo += Integer.valueOf(two[0]);

    }

}
