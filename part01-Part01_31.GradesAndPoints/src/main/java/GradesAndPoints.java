
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int m = Integer.valueOf(scan.nextLine());
        if (m<0){
            System.out.println("Grade: impossible!");
        }else if (m<=49){
            System.out.println("Grade: failed");
        }else if (m<=59){
            System.out.println("Grade: 1");
        }else if (m<=69){
            System.out.println("Grade: 2");
        }else if (m<=79){
            System.out.println("Grade: 3");
        }else if (m<=89){
            System.out.println("Grade: 4");
        }else if (m<=100){
            System.out.println("Grade: 5");
        }else if (m>100){
            System.out.println("Grade: incredible!");
        }    
    }
}