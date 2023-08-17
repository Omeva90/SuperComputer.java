package SuperComputerOp;
import java.util.Scanner;

public class MKCal {
    public void calculate() {
        try (Scanner input = new Scanner(System.in)) {
            while(true){
                System.out.println("This is a km to mile conversion program");
                System.out.println("Menu:");
                System.out.println("1: From Km to Miles conversion");
                System.out.println("2: From Miles to Km conversion");
                System.out.println("3: From Cm to Inch conversion");
                System.out.println("4: From Inch to Cm conversion");
                System.out.println("5: Exit");
                System.out.println("6: return to the main menu");
                System.out.println("Please choose an option: ");
                int choice = input.nextInt();
                int num;
                double result;
                switch (choice) {
                    case 1:
                        System.out.println("Enter A Km: ");
                        num = input.nextInt();
                        result = (num * 0.62137119);
                        System.out.println(num + " km" + " Is " + result + " Miles.");
                        break;
                    case 2:
                        System.out.println("Enter A Mile: ");
                        num = input.nextInt();
                        result = (num * 1.609344);
                        System.out.println(num + " Miles" + " Is " + result + " km.");
                        break;
                    case 3:
                        System.out.println("Enter A Cm: ");
                        num = input.nextInt();
                        result = (num * 0.393700787);
                        System.out.println(num + " Cm" + " Is " + result + " Inch.");
                        break;
                    case 4:
                        System.out.println("Enter A Inch: ");
                        num = input.nextInt();
                        result = (num * 2.54);
                        System.out.println(num + " Inch" + " Is " + result + " Cm.");
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
            }
        }
    }
}