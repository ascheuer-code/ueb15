/** ueb 15 - Palinddrom Rekursiv
* 
* @author Simon Klasen & Andreas Scheuer
* @version 0.1
*/

public class PalindromRekursiv implements Palindrom {

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

        if (wort.charAt(0) != wort.charAt(wort.length() - 1)) {
            return false;
        }
        if (wort.charAt(0) == wort.charAt(wort.length() - 1)) {
            return isPalindrom(wort.substring(1, wort.length() - 1));
        }
        return true;

    }

}
