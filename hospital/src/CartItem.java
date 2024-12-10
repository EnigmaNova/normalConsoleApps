public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product p, int q){
        product = p;
        quantity = q;
    }

    public Product getProduct(){return product;}
    public void setProduct(Product product){this.product = product;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity = quantity;}

    public double getTotalSum(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString(){
        return product + " " + quantity;
    }
}
