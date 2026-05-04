import java.util.*;
import java.util.stream.*;

public class OptionalEx {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");
        System.out.println("Original List: " + products);

        List<String> filtered = products.stream()
                .filter(p -> p.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Filtered Products: " + filtered);
    }
}