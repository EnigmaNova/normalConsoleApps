import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public Shop(){
        products.add(new Product(1, "tea", 50));
        products.add(new Product(2, "cake", 80));
        products.add(new Product(3, "milk", 100));
        products.add(new Product(4, "pizza", 200));
        products.add(new Product(5, "chocolate", 20));
    }

    public List<Product> getProducts(){
        return products;
    }
    public void showProducts(){
        System.out.println("\nAvailable products:");
        for(Product product : products){
            System.out.println(product);
        }
    }

    public Product getProductById(int id){
        for(Product product : products){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }
}
