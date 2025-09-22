
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.valueOf(scanner.nextLine());
        int n = Integer.valueOf(scanner.nextLine());
        double b = Math.sqrt(m+n);
        System.out.println(b);
    }
}
