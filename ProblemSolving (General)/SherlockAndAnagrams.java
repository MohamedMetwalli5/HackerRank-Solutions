import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int result = 0;
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        for(int i=0;i<s.length();i++){
          for(int j=i;j<s.length();j++){
            String sub = s.substring(i,j+1);  
            char[] c = sub.toCharArray();
            Arrays.sort(c);
            String finalString = new String(c);  
            if(h.get(finalString) == null){
                h.put(finalString,new Integer(1));
            }else{
                h.put(finalString,new Integer(h.get(finalString) + 1));
            }
          }  
        }

        for(String key : h.keySet()){
            result += ((int)h.get(key)*((int)h.get(key)-1))/2;
        }

        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
