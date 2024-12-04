import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderFood> orders;

    public Order(){
        this.orders = new ArrayList<>();
    }

    public void addFood(Food food, int quantity){
        for(OrderFood product : orders){
            if(product.getFood().getName().equals(food.getName())){
                product.setQuantity(product.getQuantity() + quantity);
                return;
            }
        }
        orders.add(new OrderFood(food, quantity));
    }

    public void removeFood(Food food){
        for(OrderFood order : orders){
            if(order.getFood().getName().equals(food.getName())){
                orders.remove(order);
            }
        }
        System.out.println(food + " is not found. ");
    }

    public double getTotalCost(){
        double sum = 0;
        for(OrderFood order : orders){
            sum += order.getCost();
        }
        return sum;
    }

    public void clearOrder(){
        orders.clear();
    }

    public void showAllFoods(){
        for(OrderFood order : orders){
            System.out.println(order);
        }
    }
}
