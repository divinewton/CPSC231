import java.util.Scanner;

class Rectangle {
    public static int calcArea(int l, int w) {
        int result;
        result = l * w;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width;
        int area;
        System.out.print("Enter length: ");
        length = input.nextInt();
        System.out.print("Enter width: ");
        width = input.nextInt();
        area = calcArea(length, width);
        System.out.println("The area of length " + length + " and width " + width + " is " + area + ".");
    }
}