package SuperComputerOp;
import java.util.Scanner;

public class Weather {

    public void calculate() {
        try (Scanner input = new Scanner(System.in)) {
            while(true){
            System.out.println("This is a Temperature Conversion program");
            System.out.println("Menu:");
            System.out.println("1: change from °F to °C ");
            System.out.println("2: change from °C to °F ");
            System.out.println("3: Exit program");
            System.out.println("4: return to the main menu");
            System.out.println("please choose an option");

            int choice = input.nextInt();
            int t;
            double result;
            switch (choice) {
                case 1:
                    System.out.println("enter the current °F temperature");
                    t = input.nextInt();
                    result = (t - 32) / 1.8000;
                    System.out.println(t + " Fahrenheit converted to Celsius is " + result + " °C.");
                    break;
                case 2:
                    System.out.println("enter the current °C temperature");
                    t = input.nextInt();
                    result = (t * 1.8) + 32;
                    System.out.println(t + " Celsius converted to Fahrenheit is " + result + " °F.");
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                case 4:
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