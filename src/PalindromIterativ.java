public class PalindromIterativ implements Palindrom {

    @Override
    public boolean isPalindrom(String wort) {

        if (wort.length() == 0 || wort.length() == 1) {
            return false;
        }

        String toLowerCase = wort.toLowerCase();

        for (int i = 0; i < toLowerCase.length() / 2; i++) {
            if (toLowerCase.charAt(i) != toLowerCase.charAt(toLowerCase.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
