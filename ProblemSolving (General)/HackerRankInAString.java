import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

        static String hackerrankInString(String s) {
        if(s.length() == 0 || s.length() < 10 || s == null || !s.contains("h") || !s.contains("a") || !s.contains("c") || !s.contains("k") || !s.contains("e") || !s.contains("r") || !s.contains("n")) {
            return "NO";
        }
        int counter = 0, j = 0;
        String word = "hackerrank";
        for(int i=0;i<s.length();i++){
            if(j < word.length() && s.charAt(i) == word.charAt(j)){
              j++;
              counter++;
            }
        }
        if(counter == 10){
            return "YES";
        }
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
