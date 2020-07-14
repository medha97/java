import java.util.Scanner;

public class Hamming {
    public static void main(final String[] args){
        final Scanner scan = new Scanner(System.in);
        final int x = scan.nextInt();
        final int y = scan.nextInt();
        scan.close();
        int count = 0, num ;
        num = x ^ y;
        while(num > 0){
            count += (num & 1);
            num >>= 1;
        } 
        System.out.println(count);
    }
}