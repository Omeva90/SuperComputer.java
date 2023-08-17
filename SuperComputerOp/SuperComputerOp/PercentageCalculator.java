package SuperComputerOp;
import java.util.Scanner;

public class PercentageCalculator {
    public void calculate() {
        try (Scanner input = new Scanner(System.in)) {
            while(true){
            System.out.println("This is a percentage calculation program");
            System.out.println("1: to calculate a percentage from a given number");
            System.out.println("2: to calculate how much percentage is a num from a num");
            System.out.println("3: return to the main menu");
            int choice = input.nextInt();
            int percentage;
            int num;
            int num2;
            double result;
            switch (choice) {
                case 1:
                    System.out.println("Enter a Percentage");
                    percentage = input.nextInt();
                    System.out.println("Enter a Number");
                    num = input.nextInt();
                    result = ((num*percentage)/100.0);
                    System.out.println(percentage + " % " + " from " + num + " = " + result);
                    break;
                case 2:
                    System.out.println("Enter your First number");
                    num = input.nextInt();
                    System.out.println("Enter your Second Number");
                    num2 = input.nextInt();
                    result = (((num*100.0)/num2));
                    System.out.println(num + " is " + result + " % " + " from " + num2);
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


                