/**
 * Full name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP2: Pizza
 */

/**
 * public class representing a pizza order.
 */
public class PizzaOrder {
    
    // Declaring member variables  of the class.
    private Pizza[] m_order;
    private int m_numPizzas;

    /**
     * Default constructor creating a medium cheese pizza.
     * No parrameters.
     */
    public PizzaOrder() {
        this.m_order[0] = new Pizza();
        this.m_numPizzas = m_order.length;
    }

    /**
     * Overloaded constructor taking in an integer of the ammount of pizzas. 
     * @param numPizzas an integer representing the number of pizzas in the order. 
     */
    public PizzaOrder(int numPizzas) {
        this.m_order = new Pizza[numPizzas];
        this.m_numPizzas = 0;
    }

    /**
     * A method that adds a pizza object into the an order array if there is space.
     * @param pizza a pizza object being added into the order.
     * @return an integer of 1 (successful) or -1 (unsuccessful).
     */
    public int addPizza(Pizza pizza) {
        // checks if theres space for the new pizza in the array.
        if (m_numPizzas < m_order.length) {
            m_order[m_numPizzas] = pizza;
            m_numPizzas++;
            // if successful returns 1
            return 1;
        }
        else {
            // if unsuccessful returns -1
            return -1;
        }
    }
    
    /**
     * A method calculating the total cost of the pizza order.
     * @return a double representing the total price.
     */
    public double calcTotal() {
        double total = 0;
        // iterating through the order array to get the price of each pizza.
        for (int i = 0; i < m_numPizzas; i++) {
            total += m_order[i].calcCost();
        }
        // returns the total cost
        return total;
    }

    /**
     * A method returning a string of the pizza order recept. 
     * Contains the details of each pizza as well as the total price.
     */
    public String toString() {
        String orderOutput = "Order Information:";
        // iterates through each pizza to get its toString statement.
        for(int i = 0; i < m_order.length; i++) {
            orderOutput +=  "\n" + m_order[i].toString();
        }
        orderOutput += "\nOrder Total: $" + calcTotal();
        // returns the output of each pizza's information and total cost.
        return orderOutput;
    }
}