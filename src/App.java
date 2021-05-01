import java.io.File;
import java.io.FileNotFoundException;
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

        int length = args.length;

        if (length == 0) {
            return;
        }

        if (length == 1) {
            String filename = args[0];
            File file = new File(filename);

            if (file.exists()) {
                input = new Scanner(file);

                while (input.hasNextLine()) {
                    palindrom.startCheck(input.nextLine());
                }
            }
        } else {
            for (String wort : args) {

                palindrom.startCheck(wort);
            }
        }

    }

}
