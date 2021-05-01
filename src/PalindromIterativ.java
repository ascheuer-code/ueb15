public class PalindromIterativ implements Palindrom {

    @Override
    public boolean isPalindrom(String wort) {

        if (wort.length() == 0 || wort.length() == 1) {
            return false;
        }

        String toLowerCase = wort.toLowerCase();
        char[] character = toLowerCase.toCharArray();

        for (int i = 0; i < character.length / 2; i++) {
            if ((int) character[i] != (int) character[character.length - 1]) {
                return false;
            }
        }
        return true;
    }
}
