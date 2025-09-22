
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> m = new ArrayList<>();
        while(true){
            int b = Integer.valueOf(scanner.nextLine());
            if(b==-1){
                break;
            }
            m.add(b);
            
        }
        System.out.println("");
        int v = 0;
        for(int i=0;i<m.size();i++){
            v = v + m.get(i);
        
        }
        double c = (double) v/m.size();
        System.out.println(c);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
