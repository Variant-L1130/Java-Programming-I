
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int m = Integer.valueOf(scanner.nextLine());
        int n = 0;
        for (int i = 0; i <=m;i++){
            n = n+i;
        }
        System.out.println("The sum is " + n);
    }
}
