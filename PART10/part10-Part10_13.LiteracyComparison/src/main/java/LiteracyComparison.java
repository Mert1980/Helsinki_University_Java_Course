
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    // Solution without creating an object
    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .sorted((p1, p2) -> {
                        return p1[5].compareTo(p2[5]);
                    })
                    .forEach(parts -> System.out.println(parts[3].trim() + " (" + parts[4].trim() + "), " + parts[2].replace("(%)", "").trim() + ", " + parts[5].trim()));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Solution by creating an object
//    public static void main(String[] args) {
//
//        ArrayList<Result> results = new ArrayList<>();
//        try {
//            Files.lines(Paths.get("literacy.csv"))
//                    .map(l -> l.split(","))
//                    .map(a -> new Result(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
//                    .forEach(t -> results.add(t));
//        } catch (IOException ex) {
//            System.out.println("Error reading file.");
//        }
//
//        results.stream().sorted((t1, t2) -> {
//            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
//                return 1;
//            }
//            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
//                return -1;
//            }
//            return 0;
//        }).forEach(t -> System.out.println(t));
//    }
}
