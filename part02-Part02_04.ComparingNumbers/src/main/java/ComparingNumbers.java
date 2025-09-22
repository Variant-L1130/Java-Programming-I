
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.valueOf(scanner.nextLine());
        int n = Integer.valueOf(scanner.nextLine());
        if (m<n){
            System.out.println(m + " is smaller than " + n + ".");
        }else if (m>n){
            System.out.println(m + " is greater than " + n + ".");
        }else{
            System.out.println(m + " is equal to " + n + ".");
        }
    }
}
