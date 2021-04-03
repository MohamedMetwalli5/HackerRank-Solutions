import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while(input.hasNextLine()){
          String s = input.nextLine();
          counter++;
          System.out.print(counter + " ");
          System.out.println(s);

        }
    }
}
