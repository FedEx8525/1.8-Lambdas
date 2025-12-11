package level1_exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public void start() {
        List<Object> things = Arrays.asList("Pillow", 451, 105436,
                "Bed", "Desk", 34676, "Wardrobe", 87);

        List<String> organizedThings = sortThings(things);
        System.out.println("Things ordered from shortest to longest:\n" + organizedThings + "\n");
    }

    public List<String> sortThings(List<Object> things) {

       return things.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }
}
