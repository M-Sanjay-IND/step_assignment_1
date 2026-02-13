import java.util.Scanner;

public class Level3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double bonus = input.nextDouble();
        input.close();
        double income = salary + bonus;
        System.out.println("The total salary is INR" + salary + " and bonus is INR" + bonus
                + ". Hence Total Income is INR" + income);
    }
}
