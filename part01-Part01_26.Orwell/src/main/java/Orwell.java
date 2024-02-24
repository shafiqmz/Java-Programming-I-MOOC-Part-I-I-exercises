
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give anumber:");
        int value = Integer.valueOf(scan.nextLine());
        if (value == 1984) {
            System.out.println("Orwell");
        } else {
            System.out.println(value);
        }
    }
}
