/**
 * Full name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP3B Option #2: Inheritance
 */

 /**
  * Public class representing a point object
  */
public class Point {
    // defines member variables for x and y values
    int m_x;
    int m_y;

    /**
     * Default constructor creates a point at (0, 0)
     */
    public Point() {
        this.m_x = 0;
        this.m_y = 0;
    }

    /**
     * Overloaded constructor creates a point with given x and y
     * @param x an int representing the x value
     * @param y an int representing the y value
     */
    public Point(int x, int y) {
        this.m_x = x;
        this.m_y = y;
    }

    /**
     * Copy constructor creating a point from another point object
     * @param point another point object
     */
    public Point( Point point) {
        this.m_x = point.m_x;
        this.m_y = point.m_y;
    }

    /**
     * Mutator mathod for the x value
     * @param x an int representing the x value
     */
    public void setX(int x) { m_x = x; }

    /**
     * Mutator method for the y value
     * @param y an it representing the y value
     */
    public void setY(int y) { m_y = y; }

    /**
     * Accessor method for the x value
     * @return an int of the x value
     */
    public int getX() { return m_x; }

    /**
     * Accrssor method for the y value
     * @return an int of the y value
     */
    public int getY() { return m_y; }


    /**
     * A method that gets the distance between a point and another point
     * @param otherPoint a Point object
     * @return a double representing the distance
     */
    public double getDistance(Point otherPoint) {
        return getDistance(m_x, otherPoint.getX(), m_y, otherPoint.getY());
    }

    /**
     * A method that gets the distance between two points
     * @param x1 an int representing the x value of point 1
     * @param x2 an int representing the x value of point 2
     * @param y1 an int representing the y value of point 1
     * @param y2 an int representing the y value of point 2
     * @return a double representing the distance
     */
    public double getDistance(int x1, int x2, int y1, int y2) {
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return Math.abs(distance);
    }

    /**
     * A method that gets the distance between two points vertically or horizontally
     * @param value1 an int representing x or y of a point
     * @param value2 an int representing x or y of another point
     * @return a double representing the distance
     */
    public double getDistanceBetweenTwoValues(int value1, int value2) {
        return Math.abs(value1 - value2);
    }

    /**
     * A toString method to print x and y in correct format
     */
    public String toString() {
        return "(" + m_x + ", " + m_y + ")";
    }
}