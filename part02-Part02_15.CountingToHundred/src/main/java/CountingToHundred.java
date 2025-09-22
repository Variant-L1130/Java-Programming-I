
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 100;
        int n = Integer.valueOf(scanner.nextLine());
        for (int i=n; i<=m; i++){
            System.out.println(i);
        }    
    }
}
