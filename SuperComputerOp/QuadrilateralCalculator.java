package SuperComputerOp;
import java.util.Scanner;

public class QuadrilateralCalculator {
    public void calculate() {
        try (Scanner input = new Scanner(System.in)) {
            while(true){
                System.out.println("This is a Quadrilateral Calculator program");
                System.out.println("Menu:");
                System.out.println("1: square");
                System.out.println("2: rectangle");
                System.out.println("3: Trapezium");
                System.out.println("4: Exit program");
                System.out.println("5: return to the main menu");
                System.out.println("Please choose an option: ");
                int choice = input.nextInt();
                int num1;
                int num2;
                int num3;
                int num4;
                int num5;
                switch (choice) {
                    case 1:
                        System.out.println("Enter the First square side Length: ");
                        num1 = input.nextInt();
                        System.out.println("Enter the Second square side Length: ");
                        num2 = input.nextInt();
                        System.out.println("the chosen Square Field is: " + (num1 * num2));
                        System.out.println("the chosen Square perimeter is: " + (num1 + num1 + num2 + num2));
                        break;
                    case 2:
                        System.out.println("Enter the First rectangle side Length: ");
                        num1 = input.nextInt();
                        System.out.println("Enter the Second rectangle side Length: ");
                        num2 = input.nextInt();
                        System.out.println("the chosen rectangle Field is: " + (num1 * num2));
                        System.out.println("the chosen rectangle perimeter is: " + (num1 + num1 + num2 + num2)); 
                    case 3:
                        System.out.println("Enter the First upper side Length: ");
                        num1 = input.nextInt();
                        System.out.println("Enter the Second lower side Length: ");
                        num2 = input.nextInt();
                        System.out.println("Enter the side Length: ");
                        num4 = input.nextInt();
                        System.out.println("Enter the 4th side Length : ");
                        num5 = input.nextInt();
                        System.out.println("Enter the Trapezium height: ");
                        num3 = input.nextInt();
                        System.out.println("the chosen rectangle Field is: " + (((num1 + num2) * num3)) /2);
                        System.out.println("the chosen rectangle perimeter is: " + (num1 + num2+ num4 + num5));   
                    case 4:
                        System.out.println("Exiting program...");
                        break;
                    case 5:
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