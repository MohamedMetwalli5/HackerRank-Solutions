print("tempo")import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
       int positive = 0 , negative = 0 , zero = 0;  
       for(int i=0;i<arr.length;i++){
          if(arr[i] == 0){
              zero++;
          }else if(arr[i] < 0){
              negative++;
          }else if(arr[i] > 0){
              positive++;
          }
       }

       System.out.println((double)positive/arr.length);
       System.out.println((double)negative/arr.length);
       System.out.println((double)zero/arr.length);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
