import java.util.Scanner;

public class Indexelement {

    public static int findIndex(int[] arr, int num, int n){
        int low, high, mid =0 ;
        low = 0;
        high = n-1;
        while(low < high){
            mid = (low + high) / 2;
            if(arr[mid] == num)
                return mid;
            else if(arr[mid] < num)
                low = mid;
            else 
                high = mid;
        }
        return mid;
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