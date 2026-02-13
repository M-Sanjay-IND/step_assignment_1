import java.util.Scanner;

public class Level3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        input.close();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + "°F is " + celsiusResult + "°C");
    }
}
