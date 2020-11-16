
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mertdemirok
 */
public class IOU {

    private HashMap<String, Double> depth;

    public IOU() {
        this.depth = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.depth.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.depth.getOrDefault(toWhom, 0.0);
    }

}
