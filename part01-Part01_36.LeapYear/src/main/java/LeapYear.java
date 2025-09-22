
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int m = Integer.valueOf(scan.nextLine());
        if ((m % 4 == 0 && m % 100 != 0) || (m % 400 == 0)){
            System.out.println("This year is a leap year.");
        }else{
            System.out.println("This year is not a leap year.");
        }
    }
}
