import java.util.*;

class Substring{
    public int result(String s) {
        int length=0;
        int y=0;
        for(int i=y;i<s.length();i++){
            String s1="";
            for(int z=i;z<s.length();z++){
                if(!s1.contains(String.valueOf(s.charAt(z)))){
                    s1=s1+String.valueOf(s.charAt(z));
                }
                else{
                    y=z;
                    break;
                }
            }
            if(s1.length()>length){
                length=s1.length();
            }
        }
      return length;  
    }
}
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        Substring sub = new Substring();
        sub.result(input);
    }
}
