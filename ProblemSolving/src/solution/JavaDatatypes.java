import java.util.*;
import java.io.*;



class JavaDatatypes{
    public static void main(String []argh){

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
              
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>= -(Math.pow(2,15)) && x<= (Math.pow(2,15)-1)){
                   System.out.println("* short");
                   System.out.println("* int");
                   System.out.println("* long"); 
                
                }else if(x >= -(Math.pow(2,31)) && x<= (Math.pow(2,31)-1)){ 
                   System.out.println("* int");
                   System.out.println("* long");
                
                }else if(x >= -Math.pow(2,63) && x<= (Math.pow(2,63)-1)){
                   System.out.println("* long");
                }
              }
                
                //Complete the code
            
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



