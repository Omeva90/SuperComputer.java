package SuperComputerOp;
import java.util.Scanner;

public class Calculator {
    public void calculate() {
        try (Scanner input = new Scanner(System.in)) {
            while(true){
                System.out.println("This is a Basic Calculator program");
                System.out.println("Menu:");
                System.out.println("1: Addition");
                System.out.println("2: Subtraction");
                System.out.println("3: Multiplication");
                System.out.println("4: Division");
                System.out.println("5: Exit");
                System.out.println("6: return to the main menu");
                System.out.println("Please choose an option: ");
                int choice = input.nextInt();
                int num1;
                int num2;
                int result;
                switch (choice) {
                    case 1:
                        System.out.println("Enter first number: ");
                        num1 = input.nextInt();
                        System.out.println("Enter second number: ");
                        num2 = input.nextInt();
                        result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        System.out.println("Enter first number: ");
                        num1 = input.nextInt();
                        System.out.println("Enter second number: ");
                        num2 = input.nextInt();
                        result = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        System.out.println("Enter first number: ");
                        num1 = input.nextInt();
                        System.out.println("Enter second number: ");
                        num2 = input.nextInt();
                        result = num1 * num2;
                        System.out.println(num1 + " x " + num2 + " = " + result);
                        break;
                    case 4:
                        System.out.println("Enter first number: ");
                        num1 = input.nextInt();
                        System.out.println("Enter second number: ");
                        num2 = input.nextInt();
                        result = num1 / num2;
                        System.out.println(num1 + " : " + num2 + " = " + result);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        break;
                    case 6:
                        SuperComputerOp.mainMenu();
                        break;
                        default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
                if(choice == 5)break;
            }
        }
    }
}
