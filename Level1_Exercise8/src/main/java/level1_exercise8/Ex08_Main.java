package level1_exercise8;

public class Ex08_Main {

    public static void main( String[] args ) {

        String name = "Federico";

        IReverser reverser = (s) -> {
           return new StringBuilder(s).reverse().toString();
        };

        String reversedString = reverser.reverse(name);

        System.out.println("Name: " + name + "\nReversed Name: " + reversedString +"\n");

    }
}
