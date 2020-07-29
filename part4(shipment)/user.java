import java.util.*;

public class user {

    static Scanner scan = new Scanner(System.in);

    static String checkInput(){
        System.out.println("ENTER yes IF YOU WANT TO CONTINUE SHOPPING");
        String check = scan.next();
        return check;
    }

    public static void main(String[] args){
        Product product = new Product();
        product.addProduct("apple", 10, 40);
        product.addProduct("mango", 2, 30);
        product.addProduct("banana", 15, 10);
        System.out.println("START SHOPPING");
        
        Map<String, Integer>itemList = new HashMap<String, Integer>();
        String check = "yes";
        
        while(check.equals("yes")){
        
            //USER INPUT
            System.out.println("ENTER ITEM NAME");
            String name = scan.next();

            if(product.getName(name) == true){
                System.out.println("ENTER ITEM QUANTITY");
                int quant = scan.nextInt();
                itemList.put(name,quant);
                if(product.getQuantity(name, quant) == true){ 
                    check = checkInput();
                }
                else{
                    System.out.println("QUANTITY UNAVAILABLE");
                    itemList.remove(name);
                    check = checkInput();
                }
            }
            else{
                System.out.println("PRODUCT UNAVAILABLE");
                check = checkInput();
            }
        }
        scan.close();
        System.out.println("------------------------");
        System.out.println("YOUR BILL");
        product.genrateBill(itemList);
    }
}