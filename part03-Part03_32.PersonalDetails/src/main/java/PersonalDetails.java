
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";  
        int sumOfBirthYears = 0;  
        int count = 0;  

        while (true) {
            String m = scanner.nextLine();  

            if (m.isEmpty()) {  
                break;
            }

            String[] v = m.split(",");
            String name = v[0];  
            String birthYearString = v[1];  

            if (name.length() > longestName.length()) {
                longestName = name;  
            }
            
            int birthYear = Integer.valueOf(birthYearString);  

            sumOfBirthYears += birthYear;
            count++;  
        }
        
        double averageBirthYear = (double) sumOfBirthYears / count;
        
        System.out.println("Longest name: " + longestName);
        System.out.printf("Average of the birth years: %.1f\n", averageBirthYear);
    }
}