
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOfPositives = 0;
        double sumOfPositives = 0;
        while (true) {
            double number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0) {
                sumOfPositives += number;
                numberOfPositives++;
            }
        }
        if (numberOfPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumOfPositives / numberOfPositives);
        }
    }
}
