/** ueb 15 - Palinddrom Iterativ
* 
* @author Simon Klasen & Andreas Scheuer
* @version 0.1
*/

public class PalindromIterativ implements Palindrom {

    /**
     * Methode isPalindrom implementiert aus Interface
     * 
     * @param wort wird auf Palindrom getestet
     * @return gibt true oder false zurück
     */
    
    @Override
    public boolean isPalindrom(String wort) {

        if (wort.length() == 0 || wort.length() == 1) {
            return true;
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
