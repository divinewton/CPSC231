/**
 * Full name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP2: Pizza
 */

/**
 * Public class representing a pizza object.
 */
public class Pizza {

    // Declaring member variables for pizza.
    private String m_size;
    private int m_cheese;
    private int m_pepperoni;
    private int m_veggie;

    /**
     * Default constructor creating a medium cheese pizza.
     * No parrameters.
     */
    public Pizza() {
        this.m_size = "medium";
        this.m_cheese = 0;
        this.m_pepperoni = 0;
        this.m_veggie = 0;
    }

    /**
     * Overloaded constructor setting all member variables from given parrameters.
     * @param size a string representing the pizza size (small, medium, or large).
     * @param cheese an integer representing the ammount of cheese toppings.
     * @param pepperoni an integer representing the ammount of pepperoni toppings.
     * @param veggie an integer representing the ammount of veggie toppings.
     */
    public Pizza(String size, int cheese, int pepperoni, int veggie) {
        this.m_size = size;
        this.m_cheese = cheese;
        this.m_pepperoni = pepperoni;
        this.m_veggie = veggie;
    }

    /**
     * A copy overloaded constructor copying the pizza object as a parameter.
     * @param pizza a pizza object being used to duplicate.
     */
    public Pizza(Pizza pizza) {
        this.m_size = pizza.m_size;
        this.m_cheese = pizza.m_cheese;
        this.m_pepperoni = pizza.m_pepperoni;
        this.m_veggie = pizza.m_veggie;
    }

    /**
     * An accessor of the size variable.
     * @return the pizza's size as a string.
     */
    public String getSize() {
        return m_size;
    }

    /**
     * An accessor of the cheese variable.
     * @return the ammount of cheese toppings as an int.
     */
    public int getCheese() {
        return m_cheese;
    }

    /**
     * An accessor of the veggie variable.
     * @return the ammount of veggie toppings as an int.
     */
    public int getVeggie() {
        return m_veggie;
    }

    /**
     * An accessor of the pepperoni variable.
     * @return the ammount of pepperoni toppings as an int.
     */
    public int getPepperoni() {
        return m_pepperoni;
    }

    /**
     * A modifier of the size variable.
     * @param newSize a string representing the pizza's size (small, medium, or large).
     */
    public void setSize(String newSize) {
        m_size = newSize;
    }

    /**
     * A modifier of the cheese variable.
     * @param newCheese an integer representing the ammount of cheese toppings.
     */
    public void setCheese(int newCheese) {
        m_cheese = newCheese;
    }

    /**
     * A modifier of the veggie variable.
     * @param newVeggie an integer representing the ammount of veggie toppings.
     */
    public void setVeggie(int newVeggie) {
        m_veggie = newVeggie;
    }

    /**
     * A modifier of the pepperoni veriable.
     * @param newPepperoni an integer representing the ammount of pepperoni toppings.
     */
    public void setPepperoni(int newPepperoni) {
        m_pepperoni = newPepperoni;
    }

    /**
     * A method that calculates the total cost of a pizza.
     * @return a double representing the total cost.
     */
    public double calcCost() {
        double pizzaCost;
        // if the pizza is small
        if (this.m_size.equals("small")) {
            pizzaCost = 10;
        // if the pizza is medium
        } else if (this.m_size.equals("medium")) {
            pizzaCost = 12;
        // if the pizza is large
        } else {
            pizzaCost = 14;
        }
        // returns the total cost of the pizza.
        return (pizzaCost + ((this.m_cheese + this.m_veggie + this.m_pepperoni) * 2));
    }

    /**
     * A method that returns a string of the pizza's information (size, toppings, price).
     */
    public String toString() {
        return ("One " + this.m_size + " sized pizza with " + this.m_cheese + " cheese, " + this.m_veggie + " veggies, " + this.m_pepperoni + " pepperoni, for $" + calcCost() + ".");
    }

    /**
     * A method that calculates whether two pizzas are equal.
     * @param other another pizza object.
     * @return a boolean true or false.
     */
    public boolean equals(Pizza other) {
        // checks if all variables (size, cheese, veggie, pepperoni) are equal, and returns true if they are.
        if (!m_size.equals(other.getSize()) && m_cheese == other.getCheese() && m_veggie == other.getVeggie() && m_pepperoni == other.getPepperoni()) {
            return true;
        } else {
            // if all variables are not equal, returns false
            return false;
        }
    }
}