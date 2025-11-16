import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logic logic = new Logic();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MORSE PROGRAM");
            System.out.println("1. English to Morse");
            System.out.println("2. Morse to English");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter English text: ");
                    String english = scanner.nextLine();
                    System.out.println("Morse: " + logic.engToMorse(english));
                    break;

                case "2":
                    System.out.print("Enter Morse code: ");
                    String morse = scanner.nextLine();
                    System.out.println("English: " + logic.morseToEng(morse));
                    break;

                case "3":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        }
    }
}
