import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if(s.trim().length() != 0){
            s = s.trim();
            String[] array = s.split("[ .,'?!@_]+");
            System.out.println(array.length);
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }else{
            System.out.print("0");
        }
        
    }
}

