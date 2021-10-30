package num_pattern_a;
import java.util.*;
public class num_pattern_a {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Number of rows you want in this pattern?");
 
        int rows = scanner.nextInt();
 
        System.out.println("----Pattern is----");
 
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
    }
}
