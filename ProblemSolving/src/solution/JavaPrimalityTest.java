
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaPrimalityTest {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = input.nextBigInteger();
        
        boolean flag = (a.isProbablePrime(200));
        if(flag == true) {
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
