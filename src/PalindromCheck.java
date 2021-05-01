public class PalindromCheck implements Palindrom {

    @Override
    public void startCheck(String wort) {
        isPalindromIterativ(wort);
        isPalindromRekursiv(wort);
    }

    @Override
    public boolean isPalindromRekursiv(String wort) {
        String toLowerCase = wort.toLowerCase();

        if (toLowerCase.length() == 0 || toLowerCase.length() == 1) {
            return false;
        }
        if (toLowerCase.charAt(0) == toLowerCase.charAt(toLowerCase.length() - 1)) {
            isPalindromRekursiv(toLowerCase.substring(1, toLowerCase.length() - 1));
        }

        return true;
    }

    @Override
    public boolean isPalindromIterativ(String wort) {

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
