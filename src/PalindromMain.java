import java.io.IOException;
import java.util.ArrayList;

/**
 * ueb 15 - Palinddrom Main
 * 
 * @author Simon Klasen & Andreas Scheuer
 * @version 0.1
 */

public class PalindromMain {

    private PalindromIterativ palindromiterativ;
    private PalindromRekursiv palindromrekursiv;

    /**
     * Main Methode
     * 
     * @param args übergebene Parameter
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        new PalindromMain().start(args);
    }

    /**
     * Standardkonstruktor
     */
    public PalindromMain() {
        palindromiterativ = new PalindromIterativ();
        palindromrekursiv = new PalindromRekursiv();
    }

    /**
     * eigentliche Startmethode
     * 
     * @param args übergebene Parameter aus Main Methode
     * @throws IOException
     */
    public void start(String[] args) throws IOException {

        ArrayList<String> log = new ArrayList<String>();

        final String filename = args[0];

        if (Lib_File.isExistentAndReadibleBoolean(filename)) {
            ArrayList<String> list = Lib_File.readLinebyLine(filename);

            log.add(String.format("%s,%s,%s", "Stringlaenge", "Iterativ", "Rekursiv"));

            list.forEach((p) -> {

                Long startiterativ;
                long startrekursiv;

                startiterativ = System.nanoTime();
                palindromiterativ.isPalindrom(Lib_String.removeAllWhitespaces(p.toLowerCase()));
                Long ergebnissIterativ = System.nanoTime() - startiterativ;

                startrekursiv = System.nanoTime();
                palindromrekursiv.isPalindrom(Lib_String.removeAllWhitespaces(p.toLowerCase()));
                Long ergebnissrekursiv = System.nanoTime() - startrekursiv;

                log.add(String.format("%d,%d,%d", p.length(), ergebnissIterativ, ergebnissrekursiv));
            });

            Lib_File.writeTextToFile(log, "Ergebniss.txt", true);

        } else {
            for (String wort : args) {
                System.out.println(palindromiterativ.isPalindrom(Lib_String.removeAllWhitespaces(wort.toLowerCase())));
                System.out.println(palindromrekursiv.isPalindrom(Lib_String.removeAllWhitespaces(wort.toLowerCase())));
            }
        }

    }

}
