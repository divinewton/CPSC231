/**
 * Full name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP3B Option #2: Inheritance
 */

/**
 * Public main class to call other class methods and print in console
 */
public class QuadrilateralTest {
    public static void main(String[] args) {
        // creates a new instance of each shape with specific points
        Parallelogram shape = new Parallelogram(0, 0, 2, 2, 8, 2, 6, 0);
        Rectangle shape2 = new Rectangle(0, 0, 0, 2, 4, 2, 0, 4);
        Square shape3 = new Square(0, 0, 0, 2, 2, 2, 2, 0);
        Trapezoid shape4 = new Trapezoid(0, 0, 1, 4, 5, 4, 6, 0);
        
        // prints the area of each shape using getArea methods
        System.out.println("A Parallelogram with points (0, 0), (2, 2), (8, 2), and (6, 0) has an area of " + shape.getArea() + ".");
        System.out.println("A Rectangle with points (0, 0), (0, 2), (4, 2), and (0, 4) has an area of " + shape2.getArea() + ".");
        System.out.println("A Square with points (0, 0), (0, 2), (2, 2), and (2, 0) has an area of " + shape3.getArea() + ".");
        System.out.println("A Trapezoid with points (0, 0), (1, 4), (5, 4), and (6, 0) has an area of " + shape4.getArea() + ".");
    }
}
