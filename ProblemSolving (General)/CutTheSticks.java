import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CutTheSticks {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(arr);
        l.add(arr.length);
        while(arr[arr.length-1] > 0){
           int min = NonZeroMin(arr);
           for(int j=0;j<arr.length;j++){
              arr[j] -= min; 
           }
           int counter = 0;
           for(int i=0;i<arr.length;i++){
              if(arr[i] > 0){
                counter++;
              } 
           }
           if(counter > 0){
              l.add(counter);
           }
        }
        int result[] = new int[l.size()];
        for(int i=0;i<result.length;i++){
           result[i] = l.get(i);
        }
        return result;


    }
    static int NonZeroMin(int[] arr) {
        int min = 999999;
       for(int i=0;i<arr.length;i++){
          if(arr[i] > 0 && arr[i] < min){
              min = arr[i];
          } 
       }
       return min;  
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

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
