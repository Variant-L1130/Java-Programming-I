
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Shall we carry on?");
            String m = scanner.nextLine();
            if (m.equals("no")){
                break;
            }
        }
    }
}
