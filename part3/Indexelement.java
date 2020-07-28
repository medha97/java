import java.util.Scanner;

public class Indexelement {

    public static int findIndex(int[] arr, int num, int n){
        
        for(int i=0; i<n; i++){
            if(arr[i]==num)
                return i;

            else if(arr[i] > num)
                return i;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array.");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array.");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("element whose index to be found.");
        int x = scan.nextInt();
        scan.close();
        System.out.println("======================================");
        
        System.out.println(findIndex(arr, x, n));
    }
}