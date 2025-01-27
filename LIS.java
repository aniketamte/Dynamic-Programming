
import java.util.*;

public class LIS {
      //Longest increasing Subsequence
      public static int lis(int arr[]){

            //step 1 => create hashset to store unique element
            HashSet<Integer> set = new HashSet<>();

            //add unique element in set
            for(int i=0; i<arr.length; i++){
                  set.add(arr[i]);
            }

            //create arr2 with equal to size of arr1
            int arr2[] = new int[set.size()];

            int i=0;

            for(int num : set){
                  arr2[i] = num;
                  i++;
            }

            //sort in Ascending order
            Arrays.sort(arr2);

            return lcs(arr, arr2);
      }

      //code for lcs
      
      public static void main(String[] args) {
            int arr[] = {50, 3, 10, 7, 40, 80};
      }
}
