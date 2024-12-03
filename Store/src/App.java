public class App {

    private Cart cart;
    private Shop shop;

    public App(){
        this.cart = new Cart();
        this.shop = new Shop();
    }

    public void run(){
        while(true){
            printMenu();
            int choice = UserInput.getInt("Choose an option: ");
            switch (choice) {
                case 1:
                    shop.showProducts();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    removeFromCart();
                    break;
                case 4:
                    cart.showAllCart();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    private void printMenu() {
        System.out.println("\n----- Shop Menu -----");
        System.out.println("1. View Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. Remove Product from Cart");
        System.out.println("4. View Cart");
        System.out.println("5. Exit");
    }

    private void addToCart(){
        int productId = UserInput.getInt("Enter the product ID to add: ");
        int quantity = UserInput.getInt("Enter the quantity: ");

        Product product = shop.getProductById(productId);
        if(product != null){
            cart.addProduct(product, quantity);
            System.out.println("Added to cart.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private void removeFromCart(){
        cart.showAllCart();
        int productId = UserInput.getInt("Enter the product ID to remove: ");
        cart.removeProduct(productId);
        System.out.println("Removed from cart.");
    }
    public static void main(String[] args) throws Exception {
        new App().run();
    }
}
