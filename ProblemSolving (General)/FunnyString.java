import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FunnyString {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        StringBuilder str = new StringBuilder(s);
        String reverse = str.reverse().toString(); 
        for(int i=0;i<s.length()-1;i++){
          if(Math.abs((int)s.charAt(i) - (int)s.charAt(i+1)) != Math.abs((int)reverse.charAt(i) - (int)reverse.charAt(i+1))){
            return "Not Funny";
          }
        }
        return "Funny";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
