public class fibo {
      public static int fibo(int n, int f[]){
            //Tc ---> O(n)
          if (n == 0 || n == 1) {
              return n;
          }
          if(f[n] != 0){ //fib[n] is already calculated
            return f[n];
          }
          f[n] = fibo(n-1, f) + fibo(n-2, f);
          return f[n];
      }
      public static void main(String[] args) {
            int n=5;
            int f[] = new int[n+1];
            System.out.println(fibo(n, f));
      }
}
