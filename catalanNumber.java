
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

    //Using Tabulation method
    //TC--->O(n*n)
    public static int catTab(int n) {
        int dp2[] = new int[n + 1];
        dp2[0] = 1;
        dp2[1] = 1;

        for (int i = 2; i <= n; i++) {
            //Here we calculate Ci =?
            for (int j = 0; j < i; j++) {
                //Ci = Cj * Ci-j-1
                dp2[i] += dp2[j] * dp2[i - j - 1];
            }
        }
        print(dp2);
        return dp2[n];
    }

    public static void print(int dp2[]) {
        for (int i = 0; i < dp2.length; i++) {
            System.out.print(dp2[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Using Recursion Method : " + catalanRec(n));

        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Using Memoization method : " + catalanMemoization(n, dp));

        System.out.println("Using Tabulation Method : " + catTab(n));
    }
}
