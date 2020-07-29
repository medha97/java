import java.util.*;

public class user {

    public static void main(String[] args){
        Product product = new Product();
        product.addProduct("apple", 10, 40);
        product.addProduct("mango", 2, 30);
        product.addProduct("banana", 15, 10);


        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int quant = scan.nextInt();
        scan.close();

        if(product.getName(name) == true){
            if(product.getQuantity(name, quant) == true){
                System.out.println("USERS BILL");
                int price = product.getPrice(name); 
                System.out.println(price*quant);
            }
            else{
                System.out.println("QUANTITY UNAVAILABLE");
            }
        }
        else{
            System.out.println("PRODUCT UNAVAILABLE");
        }
        

    }
}