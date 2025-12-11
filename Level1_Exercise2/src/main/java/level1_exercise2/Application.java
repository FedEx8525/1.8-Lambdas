package level1_exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public void start() {

        List<String> rockSongs = new ArrayList<String>(Arrays.asList("Satisfaction", "My generation", "Love me do",
                "Smell like thin spirit", "Thunderstruck", "Creep" , "Californication"));
        String filteredSongs = filter(rockSongs, "o", 5);

        System.out.println(filteredSongs);

    }

    public String filter (List<String> rockSongs, String letter, int number) {
        List<String> filterByLetterAndNumber = rockSongs.stream()
                .filter(song -> song.contains(letter))
                .filter(song -> song.length() > number)
                .toList();

        return "The songs with '" + letter + "' and more than " + number +
                " letters are:\n" + filterByLetterAndNumber + "\n";
    }
}
