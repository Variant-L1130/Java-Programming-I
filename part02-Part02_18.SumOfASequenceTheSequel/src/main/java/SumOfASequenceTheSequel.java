
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int m = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int b = Integer.valueOf(scanner.nextLine());
        int n = 0;
        for (int i = m; i <=b;i++){
            n = n+i;
        }
        System.out.println("The sum is " + n);
    }
}
