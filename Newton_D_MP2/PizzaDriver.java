/**
 * Full name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP2: Pizza
 */

/**
 * Public class representing the pizza driver's console.
 */
public class PizzaDriver {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("small", 1, 0, 1); // small pizza, 1 cheese, 1 veggie
        Pizza pizza2 = new Pizza("large", 2, 2, 0); // large pizza, 2 cheese, 2 pepperoni 
        Pizza pizza3 = new Pizza(pizza2); // Same as pizza 2, using copy constructor
        Pizza pizza4 = new Pizza(pizza1); // Same as pizza 1, using copy constructor

        PizzaOrder order = new PizzaOrder(3); // order of three pizzas

        // add pizza1 to the order 
        System.out.println(order.addPizza(pizza1)); 
        // add pizza2 to the order
        System.out.println(order.addPizza(pizza2)); 
        // add pizza3 to the order  
        System.out.println(order.addPizza(pizza3));
        // add pizza4 to the order – what happens here?
        System.out.println(order.addPizza(pizza4)); 

        // checks if pizza1 and pizza3 are the same
        System.out.println(pizza1.equals(pizza3));

        // Calls order’s toString method
        System.out.println(order); 
    }
}