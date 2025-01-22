public class fibo {
      public static int fibo(int n, int dp[]){
            //Tc ---> O(n)
          if (n == 0 || n == 1) {
              return n;
          }
          if(dp[n] != 0){ //fib[n] is already calculated
            return dp[n];
          }
          dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
          return dp[n];
      }
      public static void main(String[] args) {
            int n=5;
            int dp[] = new int[n+1];
            System.out.println(fibo(n, dp));
      }
}
