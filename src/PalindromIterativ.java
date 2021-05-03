public class PalindromIterativ implements Palindrom {

    @Override
    public boolean isPalindrom(String wort) {

        if (wort.length() == 0 || wort.length() == 1) {
            return false;
        }

        int n = wort.length() / 2;

        for (int i = 0; i < n; i++) {
            if (wort.charAt(i) != wort.charAt(wort.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
