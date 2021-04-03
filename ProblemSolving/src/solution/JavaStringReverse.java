import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i=0, j=A.length()-1;
        while(i<=j){
           if(A.charAt(i) != A.charAt(j)){
               System.out.println("No");
               System.exit(0);      
           }
           i++;
           j--;
        }
        System.out.println("Yes"); 
    }
}



