
import java.util.ArrayList;

public abstract class Box {

    private ArrayList<Box> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public ArrayList<Box> getBox() {
        return box;
    }

    public abstract boolean isInBox(Item item);
}
