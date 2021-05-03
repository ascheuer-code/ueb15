public class PalindromRekursiv implements Palindrom {

    @Override
    public boolean isPalindrom(String wort) {

        if (wort.length() == 0 || wort.length() == 1) {
            return true;
        }

        if (wort.charAt(0) != wort.charAt(wort.length() - 1)) {
            return false;
        }
        if (wort.charAt(0) == wort.charAt(wort.length() - 1)) {
            return isPalindrom(wort.substring(1, wort.length() - 1));
        }
        return true;

    }

}
