
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("second");
        names.add("third");
        names.add("fourth");
        names.add("third");

        System.out.println(returnSize(names));
        System.out.println(names.toString());

    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set set){
        return set.size();
    }
}
