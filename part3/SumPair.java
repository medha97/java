import java.util.Scanner;

public class SumPair {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array.");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array.");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("desired sum.");
        int dSum = scan.nextInt();
        scan.close();
        System.out.println("======================================");

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if((arr[i] + arr[j]) == dSum)
                    System.out.println(arr[i]+"  "+arr[j]+"\n.......");
            }
        }
    }
}