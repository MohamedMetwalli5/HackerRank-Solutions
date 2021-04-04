import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WeightedUniformStrings {

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
        HashSet<Integer> theWeights = new HashSet<>();
        String[] result = new String[queries.length];
        char[] cArray = s.toCharArray();
        int Weight = 0;
        char prev = ' ';
        for(int i=0;i<cArray.length;i++){
            if(cArray[i] == prev){
                Weight += cArray[i]-'a' + 1;
            }else{
                Weight = cArray[i]-'a' + 1;
            }
            prev = cArray[i];
            theWeights.add(Weight);
        }

        int d = 0;
        for(int i=0;i<queries.length;i++){
            if(!theWeights.contains(queries[i])){
                result[d] = "No";
            }else{
                result[d] = "Yes";
            }
            d++;
        }
        /////////////////////////////////////
        //////////////////////////////////////////////////////
        
        return result;
      
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
