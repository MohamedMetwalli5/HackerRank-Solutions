import java.util.*;
import java.io.*;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int sum = 0, counter = 0;
            while(counter <= n-1) {
                sum += (int)Math.pow(2, counter)*b;
                System.out.print(a + sum);
                System.out.print(" ");
                counter++;
            }
            System.out.println();
        
        }
    }
}
