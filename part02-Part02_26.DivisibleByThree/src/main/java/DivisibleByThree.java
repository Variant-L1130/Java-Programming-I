
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2,10);
    }
    public static void divisibleByThreeInRange(int m,int n){
        for (int i = m;i<=n;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }

}

