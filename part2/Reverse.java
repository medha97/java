import java.util.Scanner;

class Reversing{

    StringBuilder reversing(String input){
        int i = 0;
        int j = input.length() - 1;
        StringBuilder string = new StringBuilder(input);
        while(i<j){
            char ch1 = input.charAt(i);
            char ch2 = input.charAt(j);
            string.setCharAt(i,ch2);
            string.setCharAt(j,ch1);
            i++;
            j--;
        }   
        return string;
    }
}
public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        Reversing str = new Reversing();
        StringBuilder result = str.reversing(input);
        System.out.println(result);
    }
}