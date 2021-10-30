package num_pattern;
import java.util.*;
public class num_pattern { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if (j % 2 == 1) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}

}
