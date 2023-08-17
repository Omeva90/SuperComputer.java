package SuperComputerOp;
import java.util.Scanner;
public class TriangleFinder {
    public void calculate() {
        try (Scanner scan = new Scanner (System.in)) {
            try (Scanner input = new Scanner(System.in)) 
        {
        while(true){
            System.out.println("This program calculates different " + "types of triangles");
            System.out.println("1: Triangle Finder calculation");
            System.out.println("2: Exit program");
            System.out.println("3: return to the main menu");
            int choice = input.nextInt();
            
            switch (choice) {
               case 1:
                   System.out.println("please enter the three lenghts " + "of the triangle sides");
                   int a = scan.nextInt();
                   int b = scan.nextInt();
                   int c = scan.nextInt();
                   if ((Math.pow(a,2)) +  (Math.pow(b,2)) == (Math.pow(c,2))){
                   System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " represents an right-angle triangle"); 
                   }
            
                   if((a == b && b == c) && (a > 0) && (b > 0) && (c > 0)){
                   System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " represents an equilateral triangle");
                   }
           
                   if((a == b && b != c ) || (a != b && b == c ) && (a > 0) && (b > 0) && (c > 0)){
                   System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " represents an isosceles triangle");
                   }
            
                   if((a != b && b != c) && (a > 0) && (b > 0) && (c > 0)){
                   System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " represents a common triangle");
                   }
            
                   if((a < 0) || (b < 0) || (c < 0) ){
                   System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " cannot represent a triangle");   
                   }

                case 2:
                    System.out.println("Exiting program...");
                    break;
                case 3:
                    SuperComputerOp.mainMenu();
                    break;
                    default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
           }
          }
         }
        }
       }
      }