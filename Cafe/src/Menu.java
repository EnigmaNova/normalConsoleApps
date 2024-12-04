import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Food> foods = new ArrayList<>();


    public Menu(){
        foods.add(new Food("burger", 50));
        foods.add(new Food("cola", 20));
        foods.add(new Food("french fry", 10));
    }
    public List<Food> getFoods(){
        return foods;
    }

    public void showAllFoods(){
        for(Food food : foods){
            System.out.println(food);
        }
    }

    public Food getFoodByName(String name){
        for(Food food : foods){
            if(food.getName().equals(name)){
                return food;
            }
        }
        return null;
    }
}
