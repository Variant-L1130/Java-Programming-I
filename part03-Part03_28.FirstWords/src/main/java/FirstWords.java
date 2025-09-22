
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String m = scanner.nextLine();
            if(m.isEmpty()){
                break;
            }
            String n [] = m.split(" ");
            System.out.println(n[0]);
                
            }
            


    }
}
