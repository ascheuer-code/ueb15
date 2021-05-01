import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    private Palindrom palindrom;
    private Scanner input;

    public static void main(String[] args) throws Exception {
        new App().start(args);
    }

    public App() {

    }

    public void start(String[] args) throws FileNotFoundException {
        for (String filename : args) {
            String file = getFileContent(filename);
            if (file != null) {
             while(getFileContent(filename) != null){
                 System.out.println(palindrom.isPalindrom(file));
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
