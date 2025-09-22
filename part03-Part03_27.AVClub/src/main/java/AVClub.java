import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String m = scanner.nextLine();  // Read user input
            
            if (m.isEmpty()) {
                break;  // Exit the loop if input is empty
            }
            
            // Split input into words
            String[] n = m.split(" ");
            
            // Print the words array for debugging
            //System.out.println("Words: ");
            //for (String word : n) {
              //  System.out.println("[" + word + "]");
            //}

            // Check each word
            for (int i = 0; i < n.length; i++) {
                // Check if the word is "av"
                if (n[i].contains("av")) {
                    System.out.println( n[i]);
                }
            }
        }
    }
}
