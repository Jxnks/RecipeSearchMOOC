import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(scanner);
        //UserInterface ui2 = new UserInterface(scanner, file);
        UserInterface.start();


    }
}