
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else {
                countOfNumbers++;
                sumOfNumbers += number;
            }
                    
        }
        System.out.println("Number of numbers: " + countOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
