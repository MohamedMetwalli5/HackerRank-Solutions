import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.Scanner;

public class Staircase {

    public static void staircase(int n) {
        int temp = n;
        for(int i=1;i<=n;i++) {
                for(int k=0;k<temp-1;k++){
                    System.out.print(" ");
                }
                temp--;
            for(int j=0;j<i;j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        staircase(n);
    }
}
