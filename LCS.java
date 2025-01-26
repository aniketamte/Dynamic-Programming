
public class LCS {
    //using recursion

    /*
       * s1=>length=>n
       * s2=>length=>m
     */
    //Print
    public static void print(boolean dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int lcs(String s1, String s2, int n, int m) {
        //base case
        if (n == 0 || m == 0) {
            return 0;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return lcs(s1, s2, n - 1, m - 1) + 1;
        } else {
            int ans1 = lcs(s1, s2, n - 1, m);
            int ans2 = lcs(s1, s2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    //Memorization
    public static int lcsMemorization(String s1, String s2, int n, int m, int dp[][]) {
        //base case
        if (n == 0 || m == 0) {
            return 0;
        }

        //overlaping ans calculated
        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = lcsMemorization(s1, s2, n - 1, m - 1, dp) + 1;
        } else {
            int ans1 = lcsMemorization(s1, s2, n - 1, m, dp);
            int ans2 = lcsMemorization(s1, s2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String[] args) {
        String s1 = "ABCD";  //"abcdge";
        String s2 = "ACEB"; //"abedg";
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];


        /*
         * first initialie whole 2D matrix with value -1
         * and then solve
         */

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Recursion Ans : " + lcs(s1, s2, s1.length(), s2.length()));
        System.out.println("Memorization Ans : " + lcsMemorization(s1, s2, n, m, dp));
    }
}
