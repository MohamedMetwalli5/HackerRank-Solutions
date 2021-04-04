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

public class SumvsXOR {

    // Complete the sumXor function below.
    static long sumXor(long n) {
        if(n == 0){
           return 1;
        }
        long i = 0, counter = 0;
        String s = Long.toBinaryString(n);
        while(s.charAt((int)i) != '1'){
           i++; 
        }

        for(long j=i;j<s.length();j++){
            if(s.charAt((int)j) == '0'){
                counter++;
            }
        }

        return (long)Math.pow(2,counter);


        

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = sumXor(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
