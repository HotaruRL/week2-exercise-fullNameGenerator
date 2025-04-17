import java.util.Scanner;

public class fullNameGenerator {
    public static void main(String[] args) {
        // CREATE NEW INSTANCE OF SCANNER NAMED in
        Scanner in = new Scanner(System.in);

        // ASK FOR USER INPUT
        System.out.println("\nPlease enter your full name e.g. First Middle Last, Suffix: ");
        String rawInput = in.nextLine(); // CAPTURE INPUT

        // PROCESS SUFFIX
        String suffix = ""; // SET suffix VARIABLE TO NOTHING BY DEFAULT
        int suffixPosition = rawInput.indexOf(","); // FIGURED OUT WHERE THE SUFFIX STARTS WITH COMMA
        if (suffixPosition != -1){ // IF THE suffixPosition IS NOT -1 MEANS IF IT EXISTS
            String[] nameNSuffix = rawInput.trim().split(",");
            // CREATE AN ARRAY NAMED nameNSuffix BY TAKING rawInput
            // TRIM SPACES FROM 2 ENDS
            // SPLIT INTO PARTS WHERE IT HAS COMMA (SHOULD BE INTO 2 CHUNKS: FULL NAME, SUFFIX)
            rawInput = nameNSuffix[0]; // SET rawInput TO THE FIRST CHUNK (JUST FULL NAME NOW)
            suffix = ", " + nameNSuffix[1].trim();
            // SET suffix TO COMMA SPACE PLUS THE 2ND CHUNK THAT IS TRIMMED OF SPACE RIGHT AFTER THE COMMA PREVIOUSLY
            // ADD COMMA SPACE BACK IN BECAUSE IT WAS REMOVED DURING THE SPLIT AND THE TRIM
        }
        String[] username = rawInput.trim().split(" "); // SPLIT THE FULL NAME CHUNK NOW IN rawInput VARIABLE INTO PARTS
        String firstName = username[0]; // ASSIGN FIRST CHUNK TO firstName

        String middleName = ""; // SET middleName TO NOTHING BY DEFAULT; PEOPLE MAY OR MAY NOT HAVE MIDDLE NAME
        if(username.length >= 3){ // username ARRAY NOW JUST HAVE CHUNKS OF FULL NAME WITHOUT SUFFIX, SO IF IT HAS 3 OR MORE THEN THERE IS MIDDLE NAME
            middleName = " " + username[1];
        }

        String lastName = "";
        if (username.length > 1) { // RARE OCCASION WHEN PEOPLE JUST USE FIRST NAME
            lastName = " " + username[username.length - 1]; // GET THE LAST CHUNK OF username
            // (CHUNKS COUNT FROM 1, BUT INDEXES COUNT FROM 0, SO LAST INDEX MUST BE LESS THAN TOTAL # OF CHUNKS OR LENGTH BY 1)
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Suffix: " + suffix.replace(", ", "")); // REPLACE THE COMMA SPACE WITH NOTHING BECAUSE WE JUST WANT THE ACTUAL SUFFIX HERE

        System.out.printf("Full name: %s%s%s%s",firstName, middleName, lastName, suffix);
        //        System.out.printf("Full name: %s%s%s%s",firstName, middleName, lastName, suffix.length() == 0 ? "" : ", " + suffix);
        //        ANOTHER ALTERNATIVE PRINT USING TENARY ?: IF TO ADD COMMA SPACE INSTEAD OF ADDING IT IN LINE 21 AND REMOVE IT IN LINE 42
    }
}
