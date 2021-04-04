import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
   public static int minimumNumber(int n, String password) {
        int counter = 0, check1 = 0, check2 = 0, check3 = 0, check4 = 0, check5 = 0;
        if(n == 0){
            return 6;
        }
        
        for(int i=0;i<password.length();i++){
           if(Character.isLetter(password.charAt(i))){
               if(Character.isLowerCase(password.charAt(i))){
                  check2 = 1;
               }else if(Character.isUpperCase(password.charAt(i))){
                  check3 = 1;
               }
           }else if(Character.isDigit(password.charAt(i))){
              check4 = 1;
           }else if(password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '(' || password.charAt(i) == ')' || password.charAt(i) == '-' || password.charAt(i) == '+'){
               check5 = 1;
           }    
        }
       
        counter = 4 - (check2 + check3 + check4 + check5);
        
        if(counter + n >= 6) {
            return counter;
        }else {
            return (counter + (6 - (counter+n)));
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
