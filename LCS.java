

public class LCS {
      //using recursion
      /*
       * s1=>length=>n
       * s2=>length=>m
       */
      public static int lcs(String s1, String s2, int n, int m){
            //base case
            if(n==0 || m==0){
                  return 0;
            }
            if(s1.charAt(n-1) == s2.charAt(m-1)){
                  return lcs(s1, s2, n-1, m-1) + 1;
            } else{
                  int ans1 = lcs(s1, s2, n-1, m) ;
                  int ans2 = lcs(s1, s2, n, m-1);
                  return Math.max(ans1, ans2); 
            }
      }
      public static void main(String[] args) {
            String s1 = "abcdge";
            String s2 = "abedg";
            System.out.println(lcs(s1, s2, s1.length(), s2.length()));
      }
}
