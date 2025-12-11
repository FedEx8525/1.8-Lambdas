package level1_exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public void start() {
        List<String> months = new ArrayList<String>(Arrays.asList("January", "February",
                "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"));

        months.forEach(System.out::println);
    }
}
