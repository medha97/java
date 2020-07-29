import java.util.HashMap;
import java.util.Map;

public class Product {
    
    static Map<String, Integer> quantity = new HashMap<String, Integer>();
    static Map<String, Integer> price = new HashMap<String, Integer>();

    public void addProduct(String name, int quant, int itemPrice){
        quantity.put(name, quant);
        price.put(name, itemPrice);
    }
    

    boolean getName(String name){
        for(Map.Entry m : quantity.entrySet()){
            if(name.equals(m.getKey())){
                return true;
            }
        }
        return false;
    }

    int getPrice(String name){
        for(Map.Entry m : price.entrySet()){
            if(name.equals(m.getKey())){
                return (int)m.getValue();
            }
        }
        return 0;
    }

    boolean getQuantity(String name, int quant){
        for(Map.Entry m : quantity.entrySet()){
            if(name.equals(m.getKey()) && (int)m.getValue() >= quant){
                return true;
            }
        }
        return false;
    }

    void genrateBill(Map<String, Integer> itemList){
        System.out.println("------------------------");
        System.out.println("Invoice Generated:");
        System.out.println("Product Name\t|\tProduct Price\t|\tProduct Quantity\t|\tPrice");
        int sum = 0;
        for(Map.Entry m : itemList.entrySet()){
            for(Map.Entry n : price.entrySet()){
                if(m.getKey().equals(n.getKey())){
                    System.out.println(m.getKey() + "\t\t\t" + n.getValue() + "\t\t\t" + m.getValue()+"\t\t\t\t" + ((int)m.getValue()*(int)n.getValue()));
                    sum += ((int)m.getValue()*(int)n.getValue());
                }
            }
        }
        System.out.println("\n\n\t\t\t\t\t\t\t\t   TOTAL PRICE: "+sum);
    }
}