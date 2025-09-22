
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int m = Integer.valueOf(scan.nextLine());
        if (m < 5000){
            System.out.println("No tax!");
        }else if (m < 25000 && m >= 5000){
            System.out.println("Tax:" + (100 + (m-5000) * 0.08));
        }else if (m < 55000 && m >= 25000){
            System.out.println("Tax:" + (1700 + (m-25000) * 0.10));
        }else if (m < 200000 && m >= 55000){
            System.out.println("Tax:" + (4700 + (m-55000) * 0.12));
        }else if (m < 1000000 && m >= 200000){
            System.out.println("Tax:" + (22100 + (m-200000) * 0.15));
        }else{
            System.out.println("Tax:" + (142100 + (m-1000000) * 0.17));
        }
    }
}
