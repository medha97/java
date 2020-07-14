import java.util.Scanner;

public class Counting_char {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String character = scan.nextLine();
        scan.close();

        int count=1, i;
        for(i=1; i<=character.length(); i++){
            count++;
            if(character.charAt(i) != character.charAt(i-1)){
                System.out.print(character.charAt(i-1)+" ");
                System.out.print(count-1 + "\n");
                count = 1;
            }
            if(i == character.length() -1){
                System.out.print(character.charAt(i)+" ");
                System.out.print(count + "\n");
            }
        }
    }
}