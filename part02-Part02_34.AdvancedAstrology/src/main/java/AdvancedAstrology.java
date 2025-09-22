
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i =0;i<number;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i =0;i<number;i++){
            System.out.print(" ");
        }
        
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        int m=1;
        while(m<=size){
            for (int n=0;n<size- m;n++){
                System.out.print(" ");
            }
            for (int i=1;i<=m;i++){
                System.out.print("*");
            }
            System.out.println();
            m++;
        
        }// part 2 of the exercise
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Print the trunk using asterisks (3 lines, centered)
        //for (int i = 0; i < 2; i++) {
          //  for (int j = 1; j <= height - 2; j++) {
            //    System.out.print(" ");
           // }
            
            //System.out.println("***");
            
        //}
    }


    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printSpaces(5);
        
        printStars(4);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        
    }
}
