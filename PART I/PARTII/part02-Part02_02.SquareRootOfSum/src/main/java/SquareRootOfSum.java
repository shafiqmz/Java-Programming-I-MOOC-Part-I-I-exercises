
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int value1 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int value2 = scanner.nextInt();
        //int sum = value1 + value2;
        double squareRoot = Math.sqrt(value1 + value2);
        System.out.println(squareRoot);

    }
}
