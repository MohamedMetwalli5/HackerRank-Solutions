import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GameOfThronesI {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
      HashMap<Character,Integer> h = new HashMap<Character,Integer>();
      int counter = 0;
      for(int i=0;i<s.length();i++){
         if(h.get(s.charAt(i)) == null){
             h.put(s.charAt(i),new Integer(1));
         }else{
             h.put(s.charAt(i),new Integer(h.get(s.charAt(i)) + 1));   
         }
      }

      for(Map.Entry<Character,Integer> entry :  h.entrySet()){
          if((int)entry.getValue()%2 != 0 ){
              counter++;
          }
      }

      if(counter <= 1){
          return "YES";
      }else{
          return"NO";
      }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
