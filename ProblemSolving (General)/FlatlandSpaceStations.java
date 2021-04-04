import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FlatlandSpaceStations {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] stations) {
        Arrays.sort(stations);
        int first = stations[0];
        int max = Math.max(first, n-stations[stations.length - 1]-1);
        for (int i=0;i< stations.length-1;i++) {
            max = Math.max((stations[i + 1] - stations[i]) / 2, max);
        }
        return max;
    }

    static int bigger(int element ,int[] stations){
        Arrays.sort(stations);
        for(int i=0;i<stations.length;i++){
           if(stations[i] > element){
               return stations[i];
           }
        }
        return element;  
    }

    static int smaller(int element ,int[] stations){
        Arrays.sort(stations);
        for(int i=stations.length-1;i >= 0;i--){
           if(stations[i] < element){
               return stations[i];
           }
        }
        return element;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
