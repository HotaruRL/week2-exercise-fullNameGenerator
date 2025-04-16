import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nPlease enter your full name e.g. First Middle Last, Suffix: ");
        String rawInput = in.nextLine();

        String suffix = "";
        int suffixPosition = rawInput.indexOf(",");
        if (suffixPosition != -1){
            String[] nameNSuffix = rawInput.trim().split(",");
            rawInput = nameNSuffix[0];
            suffix = ", " + nameNSuffix[1].trim();
        }
        String[] username = rawInput.trim().split(" ");
        String firstName = username[0];

        String middleName = "";
        if(username.length >= 3){
            middleName = " " + username[1];
        }

        String lastName = "";
        if (username.length > 1) {
            lastName = " " + username[username.length - 1];
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Suffix: " + suffix.replace(", ", ""));

//        System.out.printf("Full name: %s%s%s%s",firstName, middleName, lastName, suffix.length() == 0 ? "" : ", " + suffix);
        System.out.printf("Full name: %s%s%s%s",firstName, middleName, lastName, suffix);
    }
}