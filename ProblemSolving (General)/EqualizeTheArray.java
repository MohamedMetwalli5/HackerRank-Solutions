import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualizeTheArray  {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
       HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
       int counter = 1, min = 0, flag = 0;
       Arrays.sort(arr);
       if(arr[0] == arr[arr.length-1]){
          return 0;
       }

       for(int i=0;i<arr.length-1;i++){
         if(arr[i] == arr[i+1]){
            flag = 1;
            break;
         }
       }
       
       if(flag == 0){
          return arr.length-1;
       } 

       for(int i=0;i<arr.length-1;i++){
          if(arr[i] == arr[i+1]){
              counter++;
             h.put(arr[i],counter);  
          }else{
              counter = 1;
          }
       }
 
        for(Entry<Integer, Integer> m : h.entrySet()){    
            if(m.getValue() > min){
                min = m.getValue();
            }  
        }  

        return arr.length - min;

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

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
