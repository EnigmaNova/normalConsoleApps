import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;
    
    public Cart(){
        items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity){
        for(CartItem item : items){
            if(item.getProduct().equals(product)){
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem (product, quantity));
    }

    public void removeProduct(String name){
        for(CartItem item : items){
            if(item.getProduct().getName().equals(name)){
                items.remove(item);
            }
        }
    }

    public double getTotalCost(){
        double sum = 0;
        for(CartItem item : items){
            sum += item.getTotalSum();
        }
        return sum;
    }
}
