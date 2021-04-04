import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PalindromeIndex {

    // Complete the palindromeIndex function below.
     static int palindromeIndex(String s) {
        for(int i=0;i<s.length()/2;i++){
          if(s.charAt(i) != s.charAt(s.length()-i-1)){
              if(i+1 < s.length()){
                 int k = i+1 , d = s.length()-i-1;
                 while(k <= d){
                    if(s.charAt(k) != s.charAt(d)){
                      return s.length()-i-1;
                    }
                    k++;
                    d--;
                 }
                 return i;


              }

          }  
          

        }

        return -1; 

      }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
