
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String m = scan.nextLine();
        System.out.println("Enter the second string:");
        String n = scan.nextLine();
        if (m.equals(n)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
