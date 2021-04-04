import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String temp = s.substring(0,2);
        int x = Integer.parseInt(temp);
        if(s.substring(s.length()-2).equals("PM")){
            if(x != 12){
               x += 12;
            } 
        }else{
            if(x == 12){
               return "00"+s.substring(2,s.length()-2);     
            }else{
                return "0"+s.substring(1,s.length()-2);
            }
        }
        return  String.valueOf(x) + s.substring(2,s.length()-2); 
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
