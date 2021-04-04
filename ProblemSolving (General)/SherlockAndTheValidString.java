import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndTheValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
       HashMap<Character,Integer> h = new HashMap<Character,Integer>();
       for(int i=0;i<s.length();i++){
           if(h.get(s.charAt(i)) == null){
               h.put(s.charAt(i), new Integer(1));
           }else{
               h.put(s.charAt(i), new Integer(h.get(s.charAt(i)) + 1));
           }
       }
       int frequence = (int)h.get(s.charAt(0)) , counter = 0, flag = 0; 
       for(Map.Entry<Character,Integer> entry :  h.entrySet()){
            if(frequence == (int)entry.getValue()){
                counter++;
            }else if(Math.abs(frequence - (int)entry.getValue()) >= 1){
                flag++;
                if(flag >= 2){
                    return "NO";
                }
            }    
       }   
           
        return "YES";
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
