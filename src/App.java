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

        final String filename = args[0];

        if (Lib_File.isExistent(filename)) {
            ArrayList<String> list = Lib_File.readLinebyLine(filename);

            list.forEach(p -> System.out.println(palindromiterativ.isPalindrom(p)));
            list.forEach(p -> System.out.println(palindromrekursiv.isPalindrom(p)));
        } else {
            for (String string : args) {
                System.out.println(palindromiterativ.isPalindrom(string));
                System.out.println(palindromrekursiv.isPalindrom(string));
            }
        }

    }

}
