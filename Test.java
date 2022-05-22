package Assignment;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// Loop until they enter either yes or no.
        while (true) {
            String line = in.nextLine();
            // Use this to check if it is yes or no
            if (line.equalsIgnoreCase("yes")) {
                // Process yes
                System.out.println("y");
                break;
            } else if (line.equalsIgnoreCase("no")) {
                // Process no
                System.out.println("n");
                break;
            } else {
                // Tell them to enter yes or no since they entered something else.
            }
        }
    }
}
