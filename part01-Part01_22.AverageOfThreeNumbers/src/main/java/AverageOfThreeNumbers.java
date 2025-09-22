
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
System.out.println("Give the first number:");
int m = Integer.valueOf(scanner.nextLine());
System.out.println("Give the second number:");
int n = Integer.valueOf(scanner.nextLine());
System.out.println("Give the third number:");
int o = Integer.valueOf(scanner.nextLine());
double result = (double)(m+n+o)/3;
System.out.println("The average is " + result);
    }
}
