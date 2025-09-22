import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;      // Sum of numbers
        int b = 0;    // Count of valid numbers
        int v = 0; // Count of even numbers
        int c = 0;  // Count of odd numbers

        // Keep asking for numbers until -1 is entered
        while (true) {
            System.out.print("Give numbers:");
            int m = Integer.parseInt(scanner.nextLine());
            
            if (m == -1) {
                // Exit condition
                System.out.println("Thx! Bye!");
                break;
            }
            if (m==m){
                b = b+1;
                n = n+m;
            }
            if (m%2==0){
                v = v + 1;
                
            }
            if (m%2!=0){
                c = c + 1;
            }
        }
        
        // Print results with the required format
        System.out.println("Sum: " + n);
        System.out.println("Numbers: " + b);
        if (b > 0) {
            System.out.printf("Average: %.15f%n", (1.0 * n / b));
        } else {
            System.out.println("Average: 0.0");
        }
        
        System.out.println("Even: " + v);
        System.out.println("Odd: " + c);
    }
}