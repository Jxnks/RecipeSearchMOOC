import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {
    Scanner s;
    Scanner scanningPath;


    public UserInterface(Scanner s) {
        this.s = s;

    }

    public static void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        Scanner fileToRead = new Scanner(Paths.get(file));
        System.out.println("""
                Commands:
                list - lists the recipes
                stop - stops the program
                find name - searches recipes by name
                find cooking time - searches recipes by cooking time\n""");
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();

            if (input.equals("list")) {
                while (fileToRead.hasNextLine()) {
                    // we read one line
                    String row = fileToRead.nextLine();
                    // we print the line that we read
                    System.out.println(row);
                }
            }
            if (input.contains("find name")) {
                System.out.println("Searched word: ");
                String findInput = scanner.nextLine();
                while (scanningPath.hasNextLine()) {
                    // we read one line
                    String row = scanningPath.nextLine();
                    if (row.contains(findInput)) {
                        System.out.println("Recipes: ");
                        int cookingTime = Integer.parseInt(scanningPath.nextLine()); // converts a boolean to a string to an unt
                        System.out.println(row + ", " + "cooking time: " + cookingTime);
                    }
                }

            }
            if (input.contains("find cooking time")) {
                while(true){

                    if (file.equals("")) {
                        break;
                    }

                }


            }


        }
    }


}









