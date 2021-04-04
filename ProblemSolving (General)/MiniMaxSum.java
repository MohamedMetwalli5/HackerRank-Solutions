import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                long[] arr = new long[5];
        for(int i=0;i<5;i++){
           arr[i] = input.nextLong();
        } 
        for(int i=0;i<5;i++){
            for(int j=1;j<(5-i);j++){
              if(arr[j] < arr[j-1]){
               long temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
              }
            }
        } 
        
        System.out.print(arr[0] + arr[1] + arr[2] + arr[3]);
        System.out.print(" ");
        System.out.print(arr[4] + arr[1] + arr[2] + arr[3]);
    }
}
