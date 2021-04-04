import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
     StringBuilder str = new StringBuilder(s);
    for(int i=0;i<s.length();i++){
        if(Character.isLetter(s.charAt(i))){
          int base = Character.isLowerCase(s.charAt(i)) ? 'a':'A';    
          str.setCharAt(i , (char)( (s.charAt(i) + k - base) % 26 + base ) );  
        }else{
          str.append(s.charAt(i));
        }
    }

    return str.toString().substring(0,s.length());

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
