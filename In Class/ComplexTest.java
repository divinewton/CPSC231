public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(9.5, 7.7);
        Complex b = new Complex(1.2, 3.1);
        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());
        System.out.println("a + b = " + a.add(a, b));
    }
}