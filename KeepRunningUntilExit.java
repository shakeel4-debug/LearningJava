import java.util.Scanner;

public class KeepRunningUntilExit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Type something (type 'exit' to quit):");

        while (true) {
            System.out.print("Enter text: ");
            input = scanner.nextLine(); // take input from user

            if (input.equalsIgnoreCase("exit")) { // check if user typed exit
                System.out.println("Program ended.");
                break; // stop the loop
            }

            System.out.println("You entered: " + input);
        }

        scanner.close();
    }
}
