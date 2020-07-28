import java.util.Scanner;

class Removing{
    void removing(String str, char ch){
        if (str.charAt(0) == ch){
            System.out.println(str.substring(1));
        }
        else if(str.charAt(str.length()-1) == ch){
            System.out.println(str.substring(0, str.length()-1));
        }
        else{
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == ch){
                    System.out.println(str.substring(0, i)+str.substring(i+1));
                    break;
                }
            }
        }
    }
}

public class RemoveChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = scan.next().charAt(0);
        scan.close();
        Removing result = new Removing();
        result.removing(str, ch);
    }
}