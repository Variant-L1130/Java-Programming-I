
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int y = Integer.valueOf(scan.nextLine());
        System.out.println("Give a number:");
        int v = Integer.valueOf(scan.nextLine());
        if (y<v){
            System.out.println("Greatest number:" + v);
        }else if (y>v){
            System.out.println("Greatest number:" + y);
        }else{
            System.out.println("The numbers are equal!");
        } 
    }
}
