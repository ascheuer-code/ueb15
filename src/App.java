import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

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

        for (String string : args) {
            System.out.println(palindromiterativ.isPalindrom(string));
            System.out.println(palindromrekursiv.isPalindrom(string));

            // String file = getFileContent(filename);
            // if (file != null) {
            // while (getFileContent(filename) != null) {
            // palindrom.isPalindrom(file);
            // }
            // } else {
            // }
        }

    }

    public static String getFileContent(String filename) {
        final File file = new File(filename);
        if (file.exists()) {
            try {
                return Files.readString(Paths.get(file.getAbsolutePath()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
