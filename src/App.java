import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {

    private PalindromIterativ palindromiterativ;
    private PalindromRekursiv palindromrekursiv;
    private Scanner input;

    public static void main(String[] args) throws Exception {
        new App().start(args);
    }

    public App() {
        palindromiterativ = new PalindromIterativ();
        palindromrekursiv = new PalindromRekursiv();
    }

    public void start(String[] args) throws IOException {

        final String myFileName = args[0];
        File file = new File(myFileName);
        if (file.exists()) {
            List<String> list = Files.readAllLines(Paths.get(file.getAbsolutePath()));

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
