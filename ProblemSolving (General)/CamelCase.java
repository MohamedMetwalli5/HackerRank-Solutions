
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        if(s.length() == 0 || s == null){
           return 0;
        }

        int counter = 0;
        for(int j=0;j<s.length();j++){
           if(Character.isUpperCase(s.charAt(j))){
                counter++;
           }
        }
        if(counter == 0){
            return 1;
        }else{
            counter = 0;
        }

        int i=0;
        while(!Character.isUpperCase(s.charAt(i))){
           i++;       
        }
        counter++;
        for(int j=i;j<s.length();j++){
           if(Character.isUpperCase(s.charAt(j))){
                counter++;
           }
        }
        return counter;

    }


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println(camelcase(s));

        
    }
}



