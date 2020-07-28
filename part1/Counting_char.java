import java.util.Scanner;
public class Counting_char {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String character = scan.nextLine();
        scan.close();

        int i, sum = 0;
        for(i=1; i<=character.length(); i++){
            if(i == character.length() - 1){
                if(character.charAt(i) == character.charAt(i-1))
                    sum += 2;
                else 
                    sum += 3;
                System.out.println(sum);
                break;
            }
            if(character.charAt(i) != character.charAt(i-1))
                if(i==1 || character.charAt(i) != character.charAt(i+1))
                    sum += 1;
                else
                    sum += 2;
        }
    }
}