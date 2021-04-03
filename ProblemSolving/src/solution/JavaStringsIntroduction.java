import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0){
           System.out.println("Yes");
        }else{
           System.out.println("No");
        }
        
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1, A.length()) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1, B.length()));
           
    }
}



