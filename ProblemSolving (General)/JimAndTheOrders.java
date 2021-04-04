import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JimAndTheOrders {

    // Complete the jimOrders function below.
    static int[] jimOrders(int[][] orders) {
       int[] time = new int[orders.length];
       HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
       for(int i=0;i<orders.length;i++){
          time[i] = orders[i][0] + orders[i][1];
          h.put(i+1,time[i]);
       }
       if(orders.length == 2){
           int[] r = new int[2];
          if(time[0] <= time[1]){
              r[0] = 1;
              r[1] = 2;
             return r;
          }
          r[0] = 2;
          r[1] = 1;
          return r; 
       }
       List<Integer> sortedValues = new ArrayList<Integer>(h.values());
       Collections.sort(sortedValues);
       int[] theFinal = new int[time.length];
       for(int i=0;i<sortedValues.size();i++){
          for(Map.Entry<Integer,Integer> entry :  h.entrySet()){
                if(sortedValues.get(i) == entry.getValue()){
                   theFinal[i] = entry.getKey();
                   h.put(entry.getKey(),-1);
                }
          }
               
       }

       return theFinal;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] orders = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int ordersItem = Integer.parseInt(ordersRowItems[j]);
                orders[i][j] = ordersItem;
            }
        }

        int[] result = jimOrders(orders);

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
