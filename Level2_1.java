import java.util.Scanner;

public class Level2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1, number2;
        number1 = input.nextFloat();
        number2 = input.nextFloat();
        input.close();
        float add = number1 + number2;
        float sub = number1 - number2;
        float mul = number1 * number2;
        float div = number1 / number2;
        System.out.println("The addition, subraction, multiplication and divison values of 2 numbers " + number1
                + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", " + div);
    }
}
