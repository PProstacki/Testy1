package testy1;

public class Equation {
    private double a;
    private double b;
    private double c;
 
    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
 
    public Equation() {}
 
    public double calculateDiscriminant(){
        return ((b*b)-(4*a*c));
    }
 
    public int rootNumber() {
        double d = (b * b) - (4 * a * c);
        int roots = 0;
        if (d > 0) {
            roots += 2;
        } else if (d == 0) {
            roots++;
        }
        return roots;
    }
}
