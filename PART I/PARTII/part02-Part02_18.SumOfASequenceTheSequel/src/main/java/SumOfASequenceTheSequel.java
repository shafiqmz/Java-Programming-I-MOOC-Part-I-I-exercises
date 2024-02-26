
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int number1 = scanner.nextInt();
        System.out.println("last number?");
        int number2 = scanner.nextInt();
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
