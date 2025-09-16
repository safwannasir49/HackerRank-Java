import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
            int s = a, p = 1;
            for (int i = 0; i < n; i++) {
                s += p * b;
                System.out.print(s + " ");
                p *= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
