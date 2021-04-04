import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClosestNumbers {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
      List<Integer> l = new ArrayList<>();
      Arrays.sort(arr);
      int min = 1000000000;
      for(int i=0;i<arr.length-1;i++){
        if(Math.abs(arr[i] - arr[i+1]) < min){
            min = Math.abs(arr[i] - arr[i+1]);
        }
      }

      for(int i=0;i<arr.length-1;i++){
        if(Math.abs(arr[i] - arr[i+1]) == min){
            l.add(arr[i]);
            l.add(arr[i+1]);
        }
      }

      int[] array = l.stream().mapToInt(i->i).toArray();
      return array;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
