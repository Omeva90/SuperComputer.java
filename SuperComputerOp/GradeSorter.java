import java.util.Scanner;

public class GradeSorter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] grades;
            int num;    
            int even = 0;  
            int uneven = 0;
            System.out.println("This is a grade sorter.");
            System.out.println("Please enter the number of grades that you have:");
            num = input.nextInt();
            grades = new int[num];
            System.out.println("Please enter your grades:");
            for (int i = 0; i < num; i++) {
                grades[i] = input.nextInt();
                if (grades[i] < 0 || grades[i] > 100) {
                    System.out.println("One of the grades is illegal!");
                    return; // exit the program if an illegal grade is entered
                }
                if (grades[i] % 2 == 0) {
                    even++;
                } else {
                    uneven++;
                }
            }
            // Bubble sort the grades
            for (int i = 0; i < num - 1; i++) {
                for (int j = 0; j < num - i - 1; j++) {
                    if (grades[j] > grades[j + 1]) {
                        int temp = grades[j];
                        grades[j] = grades[j + 1];
                        grades[j + 1] = temp;
                    }
                }
            }
            System.out.println("Even numbers: " + even);  
            System.out.println("Uneven numbers: " + uneven);
            System.out.println("Sorted grades:");
            for (int i = 0; i < num; i++) {
                System.out.println(grades[i]);
            }
        }
    }
}
