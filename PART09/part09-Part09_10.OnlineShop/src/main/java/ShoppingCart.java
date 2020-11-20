
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mertdemirok
 */
public class ShoppingCart {

    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        shoppingCart.putIfAbsent(product, new Item(product, 0, price));
        shoppingCart.get(product).increaseQuantity();
    }

    public int price() {
        int total = 0;
        for (Item item : shoppingCart.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : shoppingCart.values()) {
            System.out.println(item);
        }
    }
}
