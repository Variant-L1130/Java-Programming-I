
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n =0;
        while(true){
            
            String m =scanner.nextLine();
            
            
            if(m.isEmpty()){
                break;
            }
            String v []  = m.split(",");
            int b = Integer.valueOf(v[1]);
            if(b>n){
                n=b;
             
            }
             
        
        System.out.println("Age of the oldest: " + n); 
        }
    }
}
