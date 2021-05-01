public class PalindromRekursiv implements Palindrom {

    @Override
    public boolean isPalindrom(String wort) {
        String toLowerCase = wort.toLowerCase();

        if (toLowerCase.length() == 0 || toLowerCase.length() == 1) {
            return false;
        }
        if (toLowerCase.charAt(0) == toLowerCase.charAt(toLowerCase.length() - 1)) {
            isPalindrom(toLowerCase.substring(1, toLowerCase.length() - 1));
        }

        return true;
    }

}
