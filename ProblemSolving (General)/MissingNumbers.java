import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MissingNumbers {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] missed, int[] original) {
        HashMap<Integer,Integer> hOriginal = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hMissed = new HashMap<Integer,Integer>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<original.length;i++){
           if(hOriginal.get(original[i]) == null){
              hOriginal.put(original[i],1);    
           }else{ 
              hOriginal.put(original[i],new Integer(hOriginal.get(original[i]) + 1));    
           } 
        }
        for(int i=0;i<missed.length;i++){
           if(hMissed.get(missed[i]) == null){
              hMissed.put(missed[i],1);    
           }else{ 
              hMissed.put(missed[i],new Integer(hMissed.get(missed[i]) + 1));    
           } 
        } 

        for(int element : hOriginal.keySet()){
            if(hMissed.containsKey(element)){
                if(hOriginal.get(element) > hMissed.get(element)){
                    l.add(element); 
                }
            }else{
               l.add(element); 
            }
        }
        
        int[] result = new int[l.size()];
        for(int i=0;i<l.size();i++){
           result[i] = l.get(i);
        }
        Arrays.sort(result);
        return result;
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

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

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
