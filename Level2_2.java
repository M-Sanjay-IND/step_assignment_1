import java.util.Scanner;

public class Level2_2 {
    public static void main(String[] args) {
        double height, base;
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
        base = input.nextDouble();
        input.close();
        double area = base * height / 2;
        double area_in = area / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + area_in + "in^2 and sq cm is " + area + "cm^2");
    }
}
