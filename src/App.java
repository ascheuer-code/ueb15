import java.io.IOException;
import java.util.ArrayList;

public class App {

    private PalindromIterativ palindromiterativ;
    private PalindromRekursiv palindromrekursiv;

    public static void main(String[] args) throws Exception {
        new App().start(args);
    }

    public App() {
        palindromiterativ = new PalindromIterativ();
        palindromrekursiv = new PalindromRekursiv();
    }

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
                palindromiterativ.isPalindrom(p.toLowerCase());
                Long ergebnissIterativ = System.nanoTime() - startiterativ;

                startrekursiv = System.nanoTime();
                palindromrekursiv.isPalindrom(p.toLowerCase());
                Long ergebnissrekursiv = System.nanoTime() - startrekursiv;

                log.add(String.format("%d,%d,%d", p.length(), ergebnissIterativ, ergebnissrekursiv));
            });

            Lib_File.writeTextToFile(log, "Ergebniss.txt", true);

        } else {
            for (String wort : args) {
                System.out.println(palindromiterativ.isPalindrom(wort.toLowerCase()));
                System.out.println(palindromrekursiv.isPalindrom(wort.toLowerCase()));
            }
        }

    }

}
