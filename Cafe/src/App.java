public class App {

    private Order order;
    private Menu menu;
    private UserInput userInput;

    public App(){
        this.order = new Order();
        this.menu = new Menu();
        this.userInput = new UserInput();
    }

    public void PrintIntro(){
        System.out.println("Welcome to the Restaurant Simulator!");
        System.out.println("1. View Menu");
        System.out.println("2. Add product to cart");
        System.out.println("3. Remove product from cart");
        System.out.println("4. View Cart");
        System.out.println("5. Checkout (View total price)");
        System.out.println("6. Exit");
    }

    public void addToOrder(){
        System.out.println("\nSelect a product by name from the menu:");
        menu.showAllFoods();

        String name = userInput.getString("Write the name of food: ");
        Food food = menu.getFoodByName(name);

        if(food != null){
            int quantity = userInput.getInt("Enter the quantity:");
            order.addFood(food, quantity);
            System.out.println("Food added to order");
        } else{
            System.out.println("Food not found in menu.");
        }
    }

    public void removeFromOrder(){
        System.out.println("\nView your order:");
        order.showAllFoods();

        String name = userInput.getString("\nEnter the name of the product to remove:");
        Food food = menu.getFoodByName(name);

        if(food != null){
            order.removeFood(food);
            System.out.println("Food removed from order.");
        } else {
            System.out.println("Food not found in order.");
        }
    }

    public void run() {
        
        while (true) {
            PrintIntro();
            int choice = userInput.getInt("Select an option: ");

            switch (choice) {
                case 1:
                    menu.showAllFoods();
                    break;
                case 2:
                    addToOrder();
                    break;
                case 3:
                    removeFromOrder();
                    break;
                case 4:
                    order.showAllFoods();
                    break;
                case 5:
                    System.out.println("Total price: $" + order.getTotalCost());
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new App().run();
    }
}
