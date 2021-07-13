package shoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
    public int number;
    public ArrayList<iBuyable> content = new ArrayList<>();

    public void sum(){
        double total = 0;
        for (iBuyable item : content) {
            total += item.price();
        }

        System.out.println("The total cost of your shopping cart's content is: " + total);
    }
}
