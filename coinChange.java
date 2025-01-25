public class coinChange {
      public static int coinChanges(int coins[], int sum){
            int n = coins.length;
            int dp[][] = new int[n+1][sum+1];
            //initialize - sum is 0
            //i -> coins; j->sum
            for(int i=0; i<n+1; i++){
                  dp[i][0] = 1;
            }
      }
      public static void main(String[] args) {
            int coins[] = {1,2,3};
            int sum = 4;

      }
}
