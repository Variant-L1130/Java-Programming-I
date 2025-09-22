
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.valueOf(scanner.nextLine());
        if (m<0){
            System.out.println(m* (-1));
        }else{
            System.out.println(m);
        }   
    
    }
}
