import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases > 0){
			String s = in.nextLine();
          	try{
                Pattern p = Pattern.compile(s);  
                System.out.println("Valid");  
            }catch(Exception e){
                System.out.println("Invalid");
            }
            //Write your code
            testCases--;
		}
	}
}



