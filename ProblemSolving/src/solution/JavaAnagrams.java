import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
      if(a.length() != b.length()) {
            return false;
        }
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        char[] arr1 = new char[a.length()];
        char[] arr2 = new char[b.length()];
        for(int i=0;i<a.length();i++) {
            arr1[i] = a1.charAt(i);
        }
        for(int i=0;i<b.length();i++) {
            arr2[i] = b1.charAt(i);
        }
        
        
        
        for(int i=0;i<a.length();i++){
            for(int j=1;j<(a.length()-i);j++){
              if(arr1[j] < arr1[j-1]){
               char temp = arr1[j];
               arr1[j] = arr1[j-1];
               arr1[j-1] = temp;
              }
            }
        }
        
        for(int i=0;i<b.length();i++){
            for(int j=1;j<(b.length()-i);j++){
              if(arr2[j] < arr2[j-1]){
               char temp = arr2[j];
               arr2[j] = arr2[j-1];
               arr2[j-1] = temp;
              }
            }
        }
        
        int n = Math.min(a.length(), b.length());
        
        for(int i=0;i<n;i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
