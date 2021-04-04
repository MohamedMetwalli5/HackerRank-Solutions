import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
        String result = s.replaceAll("\\s","");
        int r = (int)Math.floor(Math.sqrt(s.length()));
        int c = (int)Math.ceil(Math.sqrt(s.length()));
        if(r*c < s.length()){
           r++;
        }
        int k = 0;
        char[][] array = new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(k <= s.length()-1){
                  array[i][j] = result.charAt(k);
                  k++;     
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                if(array[j][i] != '\u0000'){
                   str.append(array[j][i]);   
                }
            }
            str.append(' ');
            
        }
        return str.toString().trim();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
