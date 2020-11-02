
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(5);
        
        counter.increase(5);
        counter.increase();
        counter.decrease();
        counter.decrease(3);
        
        System.out.println(counter.value());
    }
}
