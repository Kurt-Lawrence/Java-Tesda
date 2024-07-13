
import java.util.Arrays;


class MeatDishes {

    String[] ingredients = {"Meat"};

    public void showIngredients(){
        System.out.println("Ingredients: " + Arrays.toString(ingredients));

    }
 
}

class Afridata extends MeatDishes{

    String[] ingredients = {"Meat","Tomato Sauce"};
    

    @Override
    public void showIngredients(){
        System.out.println("Afritada: " + Arrays.toString(ingredients));
    }
    
}

class Mechado extends MeatDishes{

    String[] ingredients = {"Meat","Tomato Sauce","Potatoes","Carrots","Tomato Paste"};
    
    @Override
    public void showIngredients(){
        System.out.println("Mechado: " + Arrays.toString(ingredients));
    }
    
}


class Menudo extends MeatDishes{

    String[] ingredients = {"Meat","Tomato Sauce","Potatoes","Carrots","Liver Spread",
                            "Raisins","Hotdog"};
    
    @Override
    public void showIngredients(){
        System.out.println("Menudo: " + Arrays.toString(ingredients));
    }
    
}

class Caldereta extends MeatDishes{

    String[] ingredients = {"Meat","Tomato Sauce","Potatoes","Carrots","Tomato Paste",
                            "Liver Spread","Raisins","Hotdog","Cheese"};
    
    @Override
    public void showIngredients(){
        System.out.println("Caldereta: " + Arrays.toString(ingredients));
    }
    
}

/**
 * 
 * @author Kurt Lawrence
 * @since 2024-07-14
 */


public class ShowIngredients{
    public static void main(String[] args) {
        
        MeatDishes meal1 = new Afridata();
        MeatDishes meal2 = new Mechado();
        MeatDishes meal3 = new Menudo();
        MeatDishes meal4 = new Caldereta();

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
