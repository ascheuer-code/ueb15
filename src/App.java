import java.util.Scanner;

public class App {

    private Palindrom palindrom;
    private String wort;
    private Scanner input;

    public static void main(String[] args) throws Exception {
        new App().start(args);
    }

    public App() {
        input = new Scanner(System.in);
    }

    public void start(String[] args) {

        if (args instanceof String[]) {

            palindrom = new PalindromCheck();

            for (String wort : args) {
                palindrom.isPalindromIterativ(wort);
                palindrom.isPalindromRekursiv(wort);
            }
        } else {
            palindrom = new PalindromCheck();

            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (args[i] != null) {
                    palindrom.isPalindromIterativ(wort);
                    palindrom.isPalindromRekursiv(wort);
                }
            }
        }

    }

}
