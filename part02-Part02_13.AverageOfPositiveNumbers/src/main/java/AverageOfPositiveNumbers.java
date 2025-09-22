
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = 0;
        int b = 0;
        while (true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n==0){
                System.out.println("Cannot calculate the average");
                break;
            }
            if (n>0){
                m = m + n;
                b = b + 1;
            }
        }
        System.out.println("Average of the numbers: " + m/b);
    }
}
