import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long budget = sc.nextLong();

        int[] scholarship = new int[n];

        for (int i = 0; i < n; i++) {
            scholarship[i] = sc.nextInt();
        }

        Arrays.sort(scholarship);

        int count = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {

            if (total + scholarship[i] <= budget) {
                total += scholarship[i];
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
