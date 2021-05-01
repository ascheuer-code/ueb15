import java.io.File;
import java.util.Scanner;

public class App {

    private Palindrom palindrom;
    private String wort;
    private Scanner input;

    public static void main(String[] args) throws Exception {
        new App().start(args);
    }

    public App() {

    }

    public void start(String[] args) {

        if (!args[0].getClass().isInstance(File.class)) {

            palindrom = new PalindromCheck();

            for (String wort : args) {
                palindrom.startCheck(wort);
            }
        } else {

            palindrom = new PalindromCheck();

            input = new Scanner(args[0]);

            while (input.hasNextLine()) {

                palindrom.startCheck(input.nextLine());
            }
        }

    }

}
