public class Palindrom {

    public static void iterativ(String string1, String string2) {

        for (int i = 0; i < string1.length(); i++) {
            if (string1.length() != string2.length()) {
                System.out.println("false");
                return;
            }

            String charakter = string1.substring(0, 1);

            String substring1 = string1.replace(charakter, "");
            String substring2 = string2.replace(charakter, "");
        }
        System.out.println("true");
    }

    static int summone = 0;
    static int summetwo = 0;

    public static void recursiv(String string1, String string2) {

        if (string1.length() != string2.length()) {
            System.out.println("false");
            return;
        }

        if (string1.length() == 0 && string2.length() == 0) {
            System.out.println("true");
            return;
        }

        String charakter = string1.substring(0, 1);

        String substring1 = string1.replace(charakter, "");
        String substring2 = string2.replace(charakter, "");

        recursiv(substring1, substring2);
    }

}
