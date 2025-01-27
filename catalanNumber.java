
import java.util.Arrays;

public class catalanNumber {

    //Using Recursion Method
    public static int catalanRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;  //Cn
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanRec(i) * catalanRec(n - i - 1);
        }
        return ans;
    }

    //Using Memoization Method
    public static int catalanMemoization(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catalanMemoization(i, dp) * catalanMemoization(n - i - 1, dp);
        }
        return dp[n] = ans;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Using Recursion Method" + catalanRec(n));

        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Using Memoization method : " + catalanMemoization(n, dp));
    }
}
