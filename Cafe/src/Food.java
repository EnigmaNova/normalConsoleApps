public class Food {
    private String name;
    private double price;

    public Food(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public double getPrice(){return price;}
    public void setPrice(int price){this.price = price;}

    @Override
    public String toString(){
        return "Food: " + name + " - " + price + "$";
    }
}
