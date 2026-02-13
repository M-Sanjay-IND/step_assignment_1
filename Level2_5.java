import java.util.Scanner;

public class Level2_5 {
    public static void main(String[] args) {
        double unitPrice, total;
        Scanner input = new Scanner(System.in);
        unitPrice = input.nextDouble();
        int quantity = input.nextInt();
        input.close();
        total = quantity * unitPrice;
        System.out.println("The total purchase price in INR" + total + " if the quantity is " + quantity
                + " and the unit price is INR" + unitPrice);
    }
}
