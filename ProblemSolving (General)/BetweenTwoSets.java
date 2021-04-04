import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int[] array1 = new int[a.size()];
        int[] array2 = new int[b.size()];
        for(int i=0;i<array1.length;i++){
           array1[i] = a.get(i);   
        }
        for(int i=0;i<array2.length;i++){
           array2[i] = b.get(i);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        int counter = 0, flag1 = 0, flag2 = 0;;
        for(int i=array1[array1.length-1];i <= array2[0];i++){
            for(int j=0;j<array1.length;j++){
                if(i%array1[j] != 0){
                   flag1 = 1;
                   break;
                }
            }
            for(int k=0;k<array2.length;k++){
                 if(array2[k]%i != 0){
                   flag2 = 1;
                   break;
                }   
            }
            if(flag1 == 0 && flag2 == 0){
                //System.out.println(i);
               counter++; 
            }
            flag1 = 0;
            flag2 = 0;

        }
        return counter;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
