
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =0;
        String c = "";
        while(true){
            
            String m =scanner.nextLine();
            
            
            if(m.isEmpty()){
                break;
            }
            String v []  = m.split(",");
            int b = Integer.valueOf(v[1]);
            if(b>n){
                n=b;
                c = v[0];
                
             
            }
        }    
            System.out.println(c);
        }
}
