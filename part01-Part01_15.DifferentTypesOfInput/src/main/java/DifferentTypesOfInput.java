
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
System.out.println("Give a string:");
String p = scanner.nextLine();
System.out.println("Give an integer:");
int l = Integer.valueOf(scanner.nextLine());
System.out.println("Give a double:");
double m = Double.valueOf(scanner.nextLine());
System.out.println("Give a boolean:");
boolean n = Boolean.valueOf(scanner.nextLine());
System.out.println("You gave the string " +p);
System.out.println("You gave the integer " +l);
System.out.println("You gave the double " +m);
System.out.println("You gave the boolean " +n);
    }
}
