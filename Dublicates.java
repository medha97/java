import java.util.ArrayList;
import java.util.Scanner;


public class Dublicates {
    public static void main(final String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>( );

        int num = scan.nextInt();
        int value;
        for(int i=0; i<num; i++){
            value = scan.nextInt();
            list.add(value);
        }
        scan.close();

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int element : list) { 
  
            if (!newList.contains(element)) { 

                newList.add(element); 
            } 
        }
        System.out.println(newList);
    }
}