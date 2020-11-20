
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class Warehouse{
    private Map<String, Integer> stockList;
    private Map<String, Integer> priceList;

    public Warehouse() {
        this.stockList = new HashMap<>();
        this.priceList = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        
        stockList.put(product, stock);
        priceList.put(product, price);
    }
    
    public int price(String product){
        return priceList.getOrDefault(product, -99);
       
    }
    
    public int stock(String product) {
        return stockList.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        int numberOfStock = stock(product);
        if(numberOfStock == 0) {
            return false;
        }
        numberOfStock--;
        stockList.put(product, numberOfStock);
        return true;
    }
    
    public Set<String> products(){
        return stockList.keySet();
    }    
}
