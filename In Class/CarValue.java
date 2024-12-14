import java.util.Scanner;
import java.lang.Math;

public class CarValue {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        Car myCar = new Car();
        System.out.print("Enter the purchase year: ");
        int userYear = scnr.nextInt();
        System.out.print("Enter the purchase price: $");
        int userPrice = scnr.nextInt();
        System.out.print("Enter the current year: ");
        int currentYear = scnr.nextInt();
        System.out.print("Enter the depreciation rate (decimal): ");
        double dpRate = scnr.nextDouble();

        myCar.setModelYear(userYear);
        myCar.setPurchasePrice(userPrice);
        myCar.calcCurrentValue(currentYear, dpRate);

        myCar.printInfo(dpRate);
    }
}