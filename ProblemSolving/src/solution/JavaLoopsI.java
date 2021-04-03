import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoopsI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i;
        int z;
        for(i=1;i<=10;i++){
            z = (N)*(i);
           System.out.printf("%d x %d = %d\n",N,i,z);
        }
        scanner.close();
    
    }

}
