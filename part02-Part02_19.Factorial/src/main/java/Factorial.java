
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int m = Integer.valueOf(scanner.nextLine());
        int n = 1;
        for (int i = n; i <=m;i++){
            n = n*i;
        }
        System.out.println("Factorial: " + n);
    }
}
