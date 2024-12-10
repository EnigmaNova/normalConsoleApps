import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(){
        products.add(new Product("бинт", 10));
        products.add(new Product("мазь", 15));
        products.add(new Product("асперин",15));
        products.add(new Product("ношпа",20));
        products.add(new Product("виагра",25));
        products.add(new Product("презики",30));
    }

    public List<Product> getProducts(){
        return products;
    }

    public void showShop(){
        for(Product product : products){
            System.out.println(product);
        }
    }

    public Product findProductByName(String name){
        for(Product product : products){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
