/**
 * Full name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP3B Option #2: Inheritance
 */

/**
 * Public class representing a Quadrilateral object
 */
public class Quadrilateral {
    // defining member variables for point
    private Point p1, p2, p3, p4;

    /**
     * Default constructor creates a square with 5-unit sides
     */
    public Quadrilateral() {
        p1 = new Point(0, 0);
        p2 = new Point(0, 5);
        p3 = new Point(5, 5);
        p4 = new Point(5, 0);
    }

    /**
     * Overloaded constructor creates 4 point at inputed values
     * @param x1 an int representing the x value of point 1
     * @param y1 an int representing the y value of point 1
     * @param x2 an int representing the x value of point 2
     * @param y2 an int representing the y value of point 2
     * @param x3 an int representing the x value of point 3
     * @param y3 an int representing the y value of point 3
     * @param x4 an int representing the x value of point 4
     * @param y4 an int representing the y value of point 4
     */
    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
        p4 = new Point(x4, y4);
    }

    /**
     * Copy constructor creating a Quadrilateral from another
     * @param quadrilateral another Quadrilateral object
     */
    public Quadrilateral(Quadrilateral quadrilateral) {
        this.p1 = quadrilateral.p1;
        this.p2 = quadrilateral.p2;
        this.p3 = quadrilateral.p3;
        this.p4 = quadrilateral.p4;
    }

    /**
     * Accessor method for Point 1
     * @return a Point object
     */
    public Point getp1() { return p1; }

    /**
     * Accessor method for Point 2
     * @return a Point object
     */
    public Point getp2() { return p2; }

    /**
     * Accessor method for Point 3
     * @return a Point object
     */
    public Point getp3() { return p3; }

    /**
     * Accessor method for Point 4
     * @return a Point object
     */
    public Point getp4() { return p4; }

    /**
     * Modifier method for point 1
     * @param point a Point object
     */
    public void setp1(Point point) { p1 = point; }

    /**
     * Modifier method for point 2
     * @param point a Point object
     */
    public void setp2(Point point) { p2 = point; }

    /**
     * Modifier method for point 3
     * @param point a Point object
     */
    public void setp3(Point point) { p3 = point; }

    /**
     * Modifier method for point 4
     * @param point a Point object
     */
    public void setp4(Point point) { p4 = point; }

    /**
     * GetArea method to get the square's area from two side lengths
     * @param side1 a double representing the length of a side
     * @param side2 a double representing the length of the other side
     * @return a double representing the area
     */
    public double getArea(double side1, double side2) {
        return side1 * side2;
    }
}