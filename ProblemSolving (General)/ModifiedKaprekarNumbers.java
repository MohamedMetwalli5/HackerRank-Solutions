import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
       int flag = 0;
       for(long i=p;i<=q;i++){
          String d = String.valueOf(i); 
          long squared = i*i;
          if(String.valueOf(squared).length() == 2*d.length() || String.valueOf(squared).length() == (2*d.length())-1 ){

                String s = String.valueOf(squared);
                String s1 = s.substring(0,s.length()/2);
                String s2 = s.substring(s.length()/2);
                long numberl = 0 , numberr = 0;;
                if(s1.length() == 0){
                     numberl = 0;
                }else{
                     numberl = Long.parseLong(s1);
                }

                if(s2.length() == 0){
                     numberr = 0;
                }else{
                     numberr = Long.parseLong(s2);
                }
                
                if(numberl + numberr == i){
                    flag = 1;
                    System.out.print(i + " ");
                } 

          }   
       }

       if(flag == 0){
          System.out.println("INVALID RANGE"); 
       }   


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
