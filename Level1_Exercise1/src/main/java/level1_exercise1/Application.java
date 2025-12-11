package level1_exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public void start() {
        List<String> rockSongs = new ArrayList<String> (Arrays.asList("Satisfaction", "My generation", "Love me do",
                "Smell like thin spirit", "Thunderstruck", "Creep" , "Californication"));
        String filteredSongs = filter(rockSongs, "o");

        System.out.println(filteredSongs);

    }

    public String filter(List<String> rockSongs, String letter) {
        List<String> filterByLetter = rockSongs.stream()
                .filter (song -> song.contains(letter))
                .toList();
        return "Songs that contains '" + letter + "': \n" + filterByLetter + "\n";

    }
}
