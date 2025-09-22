
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String m = scanner.nextLine();
        if(m.equals("alex") || m.equals("emma")){
            System.out.println("Enter password: ");
            String n = scanner.nextLine();
            if(n.equals("sunshine") || n.equals("haskell")){
                System.out.println("You have successfully logged in!");
            }
        }else{
            System.out.println("Incorrect username or password!");
            
            
        }
        

    }
}
