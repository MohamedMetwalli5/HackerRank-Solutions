import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LuckBalance {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
          List<Integer> l = new ArrayList<>();
          int size = 0, result = 0;
          for(int i=0;i<contests.length;i++){
             if(contests[i][1] == 1){
               l.add(contests[i][0]);
             }else{
               result += contests[i][0];
             }  
          }
        
          int[] luckArray = new int[l.size()]; 
          for(int i=0;i<luckArray.length;i++){
             luckArray[i] = l.get(i);
          }
          Arrays.sort(luckArray);
          //for(int s : luckArray){
              //System.out.print(s + " ");    
          //}
          System.out.print(result);
          for(int i=luckArray.length-1;i >= 0;i--){ 
             if(k > 0){ 
                result += luckArray[i];
                k--;
             }else{
                result -= luckArray[i];
             }   
          }
          
          return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
