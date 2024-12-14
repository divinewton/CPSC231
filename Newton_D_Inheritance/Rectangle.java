/**
 * Full name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP3B Option #2: Inheritance
 */

/**
 * Public class representing a Rectangle inheritted from Parallelogram
 */
public class Rectangle extends Parallelogram {
    /**
     * Default constructor calls Parallelogram constructor to create 4 points
     * @param x1 an int representing the x value of point 1
     * @param y1 an int representing the y value of point 1
     * @param x2 an int representing the x value of point 2
     * @param y2 an int representing the y value of point 2
     * @param x3 an int representing the x value of point 3
     * @param y3 an int representing the y value of point 3
     * @param x4 an int representing the x value of point 4
     * @param y4 an int representing the y value of point 4
     */
    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    /**
     * Get area method to calculate a rectangle area with formula
     * @return a double representing the area
     */
    public double getArea() {
        return getp1().getDistance(getp2()) * getp2().getDistance(getp3());
    }
}
