
import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int spaces = i - 1;
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            int stars = n - i + 1;
            for (int j = 1; j <= stars; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }
}
