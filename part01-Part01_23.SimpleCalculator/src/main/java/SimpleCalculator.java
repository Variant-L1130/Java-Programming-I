
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
System.out.println("Give the first number:");
int m = Integer.valueOf(scanner.nextLine());
System.out.println("Give the second number:");
int n = Integer.valueOf(scanner.nextLine());
int v = m+n;
System.out.println(m + " + " + n +" = " + v);
int b = m-n;
System.out.println(m + " - " + n +" = " + b);
int c = m*n;
System.out.println(m + " * " + n +" = " + c);
double x = (double)m/n;
System.out.println(m + " / " + n +" = " + x);
  }
}
