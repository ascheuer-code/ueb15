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

            log.add(String.format("%50s %10s %10s", "Stringlänge", "Iterativ", "Rekursiv"));

            list.forEach((p) -> {

                long start = System.currentTimeMillis();
                palindromiterativ.isPalindrom(p);
                long ende = System.currentTimeMillis();

                long start1 = System.currentTimeMillis();
                palindromrekursiv.isPalindrom(p);
                long ende1 = System.currentTimeMillis();

                log.add(String.format("%50d %10d,%10d", p.length(), ende - start, ende1 - start1));
            });

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
