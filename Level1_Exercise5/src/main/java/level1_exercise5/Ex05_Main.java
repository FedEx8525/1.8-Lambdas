package level1_exercise5;

public class Ex05_Main {
    public static void main( String[] args ) {
        Application.piValue pi = () -> 3.1415;
        double result = pi.getPiValue();

        System.out.println("The value of pi is: " + result);
    }
}
