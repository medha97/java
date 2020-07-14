import java.util.*;

public class Reversenumber {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        int new_num=0;
        scan.close();
        while(num > 0){
            new_num += (num % 10);
            num /= 10;
            new_num *= 10;
        }
        System.out.println(new_num/10);
    }
}