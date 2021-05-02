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

        if (Lib_File.isExistentBoolean(filename)) {
            ArrayList<String> list = Lib_File.readLinebyLine(filename);

            log.add(String.format("%50s %10s %10s", "Stringlaenge", "Iterativ", "Rekursiv"));

            list.forEach((p) -> {

                long startiterativ = System.nanoTime();
                palindromiterativ.isPalindrom(p);
                long endeiterativ = System.nanoTime();

                long startrekursiv = System.nanoTime();
                palindromrekursiv.isPalindrom(p);
                long enderekursiv = System.nanoTime();

                log.add(String.format("%50d %10d,%10d", p.length(), endeiterativ - startiterativ,
                        enderekursiv - startrekursiv));
            });

            log.forEach(p -> System.out.println(p));

            // TODO: schrott aus dem log in ne datei schreiben und aus dem dreck dann nen
            // beschissenes Diagramm machen

            // list.forEach(p -> System.out.println(palindromiterativ.isPalindrom(p)));
            // list.forEach(p -> System.out.println(palindromrekursiv.isPalindrom(p)));
        } else {
            for (String string : args) {
                System.out.println(palindromiterativ.isPalindrom(string));
                System.out.println(palindromrekursiv.isPalindrom(string));
            }
        }

    }

}
