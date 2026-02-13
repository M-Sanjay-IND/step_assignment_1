import java.util.Scanner;

public class Level2_4 {
    public static void main(String[] args) {
        double mil, yard, ft;
        Scanner input = new Scanner(System.in);
        ft = input.nextDouble();
        input.close();
        yard = ft / 3;
        mil = yard / 1760;
        System.out.println("The distance in yards is " + yard + "yards and the distance in miles is " + mil + "miles");
    }
}