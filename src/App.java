import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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

            log.add(String.format("%5s %10s %10s", "Stringlaenge", "Iterativ", "Rekursiv"));

            list.forEach((p) -> {

                Long startiterativ;
                long endeiterativ;

                long startrekursiv;
                Long enderekursiv;

                startiterativ = System.nanoTime();
                palindromiterativ.isPalindrom(p);
                endeiterativ = System.nanoTime();

                Long ergebnissIterativ = endeiterativ - startiterativ;

                startrekursiv = System.nanoTime();
                palindromrekursiv.isPalindrom(p);
                enderekursiv = System.nanoTime();

                Long ergebnissrekursiv = enderekursiv - startrekursiv;

                log.add(String.format("%5d %10d,%10d", p.length(), ergebnissIterativ, ergebnissrekursiv));
            });

            log.forEach(p -> System.out.println(p));

            // TODO: schrott aus dem log in ne datei schreiben und aus dem dreck dann nen
            // beschissenes Diagramm machen

            File file = new File("ergebniss.txt");
            for (String string : log) {
                Files.writeString(Paths.get(file.getAbsolutePath()), String.format("%s\n", string),
                        StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }

        } else {
            for (String string : args) {
                System.out.println(palindromiterativ.isPalindrom(string));
                System.out.println(palindromrekursiv.isPalindrom(string));
            }
        }

    }

}
