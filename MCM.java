public class MCM{
      //Matrix chain multiplication
      public static int mcm(int arr[], int i, int j){
            if(i==j){
                  //Single matrix case
                  return 0;
            }
            int ans = Integer.MAX_VALUE;  //positive Infinity

            for(int k=1; k<=j-1; k++){
                     int cost1 = mcm(arr, i, k);  // Ai....Ak => arr[i-1] * arr[k]
                     int cost2 = mcm(arr, i+1, j); //Ai+1....Aj => arr[k] * arr[j]
                     int cost3 = arr[i-1]*arr[k]*arr[j];
            }
      }
      public static void main(String[] args) {
            int arr[] = {1,2,3,4,3};
            //n=5
            int n = arr.length;
      }
}