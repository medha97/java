import java.util.*;


public class Occurrences{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array.");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array.");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the element to be removed.");
        int x = scan.nextInt();
        scan.close();

        int j=0;
        System.out.println("======================================");
        for(int i=0; i<n; i++){
            if(arr[i] != x){
                arr[j] = arr[i];
                System.out.println(arr[j]);
                j++;
            }
        }
       
    }
}