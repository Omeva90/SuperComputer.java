package SuperComputerOp;
import java.util.Scanner;

import SuperComputerOp.PercentageCalculator;

public class SuperComputerOp {
    public static void mainMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            {
                System.out.println("This is a super computer that will answer all your questions");
                System.out.println("Main Menu:");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Temperature converter");
                System.out.println("3. Percentage Calculator");
                System.out.println("4: Triangle Finder");
                System.out.println("5. Quadrilateral Calculator");
                System.out.println("6. Mile / Km / Cm / Inch Convertor");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Calculator calculator = new Calculator();
                        calculator.calculate();
                        break;
                    case 2:
                        Weather weather = new Weather();
                        weather.calculate();
                        break; 
                    case 3:
                        PercentageCalculator percentagecalculator = new PercentageCalculator();
                        percentagecalculator.calculate();
                        break; 
                    case 4:
                        TriangleFinder trianglefinder = new TriangleFinder();
                        trianglefinder.calculate(); 
                    case 5: 
                        QuadrilateralCalculator quadrilateralcalculator = new QuadrilateralCalculator();
                        quadrilateralcalculator.calculate(); 
                    case 6:
                        MKCal mkcal = new MKCal();
                        mkcal.calculate();
                        break; 
                    case 7:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}