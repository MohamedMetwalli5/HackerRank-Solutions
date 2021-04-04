import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulBinaryString {

    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
       int counter = 0;
       StringBuilder str = new StringBuilder(b);
       for(int i=0;i<b.length()-2;i++){
         if(str.toString().charAt(i) == '0' && str.toString().charAt(i+1) == '1' && str.toString().charAt(i+2) == '0'){
             str.setCharAt(i+2,'1');
             counter++;
         }
       }

       return counter;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();

        int result = beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
