public class Complex {
    private double real;
    private double imaginary; 
    
    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imaginary + b.imaginary);
    }

    public Complex subtract(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imaginary - b.imaginary);
    }

    public String toString() {
        return "Real: " + real + ". Imaginary: " + imaginary;
    }
}