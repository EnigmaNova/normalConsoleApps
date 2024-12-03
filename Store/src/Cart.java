import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;

    public Cart(){
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity){
        for(CartItem item : items){
            if(item.getProduct().getId() == product.getId()){
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(quantity, product));
    }

    public void removeProduct(int productId){
        items.removeIf(item -> item.getProduct().getId() == productId);
    }

    public double getTotalCost(){
        double sum = 0;
        for(CartItem item : items){
            sum += item.getTotalPrice();
        }
        return sum;
    }

    public void showAllCart(){
        if(items.isEmpty()){
            System.out.println("Your cart is empty.");
            return;
        }
        for(CartItem item : items){
            System.out.println(item);
        }
        System.out.printf("Total cost: $%.2f%n", getTotalCost());
    }
}
