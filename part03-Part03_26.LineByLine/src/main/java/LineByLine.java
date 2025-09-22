
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        String m = scanner.nextLine();
        
            
        if(m.isEmpty()){
            break;
            }
        
        String [] n = m.split(" ");
        
        for(int i=0;i<n.length;i++){
           System.out.println(n[i]);
            }
        }        
                
                
        


    }
}
