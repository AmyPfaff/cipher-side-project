import java.util.Scanner;

public class Run {

    public static void run() {

        System.out.println("**********************************");
        System.out.println("Welcome to the Secret Code Writer!");
        System.out.println("**********************************");

        Scanner scanner = new Scanner(System.in);
        BasicSubstitution cipher = new BasicSubstitution();
        boolean keepGoing = true;
        boolean setOffset = true;
        int offset = 0;

        while (keepGoing) {
            System.out.print("\nPlease enter your message: ");
            String input = scanner.nextLine();

            if (setOffset) {
                System.out.print("Please enter the offset number: ");
                String offsetInput = scanner.nextLine();
                offset = Integer.parseInt(offsetInput);
            }

            System.out.print("\nEncoded message: ");
            System.out.println(cipher.encodeMessage(input, offset));

            System.out.print("\nWould you like to code another message? (Y\\N): ");
            String goAgain = scanner.nextLine();
            keepGoing = goAgain.equalsIgnoreCase("y");

            if (keepGoing) {
                System.out.print("Would you like to change the offset? (Y\\N): ");
                String changeOffset = scanner.nextLine();
                setOffset = changeOffset.equalsIgnoreCase("y");
            }

        }
    }
}
