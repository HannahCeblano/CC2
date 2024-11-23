//Hannah Marielle O. Ceblano
//CITCS 1N-A
//Lab no.7
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                break;
            } else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }

        scanner.close();
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        return hasUppercase && hasNumber;
    }
}