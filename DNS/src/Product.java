public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId(){return id;}
    
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public double getPrice(){return price;}
}
