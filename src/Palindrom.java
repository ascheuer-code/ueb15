public class Palindrom {

    public static void iterativ(String string1, String string2) {

        String string1LowerCase = string1.toLowerCase();
        String string2LowerCase = string2.toLowerCase();

        for (int i = 0; i < string1.length(); i++) {
            if (string1.length() != string2.length()) {
                System.out.println("false");
                return;
            }

            String charakter = string1LowerCase.substring(0, 1);

            string1 = string1LowerCase.replace(charakter, "");
            string2 = string2LowerCase.replace(charakter, "");
        }
        System.out.println("true");
    }

    public static void recursiv(String string1, String string2) {

        String string1LowerCase = string1.toLowerCase();
        String string2LowerCase = string2.toLowerCase();

        if (string1.length() != string2.length()) {
            System.out.println("false");
            return;
        }

        if (string1.length() == 0 && string2.length() == 0) {
            System.out.println("true");
            return;
        }

        String charakter = string1LowerCase.substring(0, 1);

        string1 = string1LowerCase.replace(charakter, "");
        string2 = string2LowerCase.replace(charakter, "");

        recursiv(string1, string2);
    }

}
