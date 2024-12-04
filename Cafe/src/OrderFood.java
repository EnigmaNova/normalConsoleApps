public class OrderFood {
    private Food food;
    private int quantity;

    public OrderFood(Food food, int quantity){
        this.food = food;
        this.quantity = quantity;
    }

    public Food getFood(){return food;}
    public void setFood(Food food){this.food = food;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int q){quantity = q;}

    public double getCost(){
        return food.getPrice() * quantity;
    }

    @Override
    public String toString(){
        return food + " " + quantity;
    }
}
