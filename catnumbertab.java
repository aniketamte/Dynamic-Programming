
public class catnumbertab {
    //Using Tabulation method
    //TC--->O(n*n)

    public static int catTab(int n, int dp[]) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            //Here we calculate Ci =?
            for (int j = 0; j < i; j++) {
                //Ci = Cj * Ci-j-1
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void print(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n + 1];
        System.out.println("Using Tabulation Method : " + catTab(n, dp));
    }
}
