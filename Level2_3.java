import java.util.Scanner;

public class Level2_3 {
    public void main(String[] args) {
        double side;
        double perimeter;
        Scanner input = new Scanner(System.in);
        perimeter = input.nextDouble();
        input.close();
        side = perimeter / 4;
        System.out.println("The length of the side is " + side + "cm whose perimeter is " + perimeter + "cm");
    }
}
