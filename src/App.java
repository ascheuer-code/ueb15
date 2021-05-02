import java.io.File;
import java.io.FileNotFoundException;
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

    public void start(String[] args) throws FileNotFoundException {

        final String myFileName = args[0];
        File file = new File(myFileName);
        if (file.exists()) {
            List<String> list = getFileContent(file);

            list.forEach(p -> System.out.println(palindromiterativ.isPalindrom(p)));
            list.forEach(p -> System.out.println(palindromrekursiv.isPalindrom(p)));
        } else {
            for (String string : args) {
                System.out.println(palindromiterativ.isPalindrom(string));
                System.out.println(palindromrekursiv.isPalindrom(string));
            }
        }

    }

    public static List<String> getFileContent(File file) {
        {
            try {
                return Files.readAllLines(Paths.get(file.getAbsolutePath()));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

}
