import java.util.*;

public class Anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String st1 = scan.nextLine();
        String st2 = scan.nextLine();
        scan.close();

        if(st1.length() != st2.length())
            System.out.println("Not Anagram.");
        
        else{
            int[] count = new int[26];
            Arrays.fill(count, 0);
            int i;
            int flag = 0;
            for(i=0; i<st1.length(); i++){
                count[st1.charAt(i) - 97]++;
                count[st2.charAt(i) - 97]--;
            }
            
            for(i=0; i<26; i++){
                if(count[i] != 0){
                    System.out.println("Not Anagram.");
                    flag = 1;
                }
            }
            if(flag == 0)
                System.out.println("Anagram.");
        }
    }
}