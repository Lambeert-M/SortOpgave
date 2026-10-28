import java.util.Scanner;

public class Utils {
    static int reader(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + " and " + max);
        int number = sc.nextInt();
        if (number >= min && number <= max) {
            return number;
        } else {
            return reader(min, max);
        }
    }
}
