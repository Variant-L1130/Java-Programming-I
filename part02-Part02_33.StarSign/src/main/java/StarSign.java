
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        //printStars(3);
//        System.out.println("\n---");  // printing --- between the shapes
  //      printSquare(4);
    //    System.out.println("\n---");
      //  printRectangle(5, 6);
        //System.out.println("\n---");
        printTriangle(5);
        System.out.println("\n---");
    }

   // public static void printStars(int number) {
     //   int m = 1;
       // while(m<=number){
         //   System.out.print("*");
           // m++;
        //}
        //System.out.println();
    //}

  //  public static void printSquare(int size) {
    //    int m = 0;
      //  while(m<size){
        //    for (int i=0;i<size;i++){
          //      System.out.print("*");   
            //}
            //System.out.println();
            //m++;
        //}
    //}

    //public static void printRectangle(int width, int height) {
        // third part of the exercise
      //  int m = 0;
        //while(m<height){
          //  for (int i=0;i<width;i++){
            ///    System.out.print("*");
            //} 
        //    System.out.println();
//            m++;
  //      }
    //}

    public static void printTriangle(int size) {
        
        for (int i=1;i<=size;i++){
            for (int n = 1;n<=size-i;n++){
               System.out.print(" ");
            }
            
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("i");
            }
            System.out.println(); // Move to the next line
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= size - 2; j++) {
                System.out.print(" ");
            }
            
            System.out.println("***");
            
        }
          
        
        // fourth part of the exercise
    }
}









