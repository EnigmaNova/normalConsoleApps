public class CartItem {
    private int quantity;
    private Product product;

    public CartItem(int quantity, Product product){
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity = quantity;}

    public Product getProduct(){return product;}
    public void setProduct(Product product){this.product = product;}

    public double getTotalPrice(){
        return product.getPrice() * quantity;
    }
    @Override
    public String toString(){
        return String.format("%s (x%d) - $%.2f", product.getName(), quantity, getTotalPrice());
    }
}
