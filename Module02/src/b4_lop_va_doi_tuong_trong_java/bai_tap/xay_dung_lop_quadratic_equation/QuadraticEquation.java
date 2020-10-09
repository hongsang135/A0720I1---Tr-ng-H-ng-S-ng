package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadratic_equation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getter_a() {
        return this.a;
    }

    public double getter_b() {
        return this.b;
    }

    public double getter_c() {
        return this.c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            return ((-this.b + Math.sqrt(this.getDiscriminant())) / 2 * this.a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            return ((-this.b - Math.sqrt(this.getDiscriminant())) / 2 * this.a);
        } else {
            return 0;
        }
    }
}
