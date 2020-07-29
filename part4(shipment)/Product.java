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
}