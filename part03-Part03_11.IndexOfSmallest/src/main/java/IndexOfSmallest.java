
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> m = new ArrayList<>();
        while(true){
        int s = Integer.valueOf(scanner.nextLine());
        if(s==9999){
            break;
          }
            m.add(s);
        }
        System.out.println("");
        int c = m.get(0);
        int  b = 0;
        for(int i=0;i<m.size();i++){
            int x = m.get(i);
            
            if (c>x){
                c=x;
                b=i;
            }
        }
        
        System.out.println("Smallest number: " + c);
        
        System.out.println("Found at index: " + b);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
