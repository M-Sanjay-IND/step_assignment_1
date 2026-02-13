import java.util.Scanner;

public class Level3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        input.close();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + "°C is " + fahrenheitResult + "°F");
    }
}
