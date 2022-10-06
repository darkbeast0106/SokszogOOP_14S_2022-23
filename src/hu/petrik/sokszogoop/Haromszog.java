package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public Haromszog() {
        super(veletlenOldalGeneralas());
        this.b = veletlenOldalGeneralas();
        this.c = veletlenOldalGeneralas();
        while (!this.isSzerkesztheto()) {
            super.setA(veletlenOldalGeneralas());
            this.b = veletlenOldalGeneralas();
            this.c = veletlenOldalGeneralas();
        }
    }

    private static double veletlenOldalGeneralas() {
        return Math.random() * 100 + 5;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public double getKerulet() {
        return this.getA() + this.getB() + this.getC();
    }

    private double getS() {
        return getKerulet() / 2;
    }

    private boolean isSzerkesztheto() {
        return this.getA() + this.getB() > this.getC() &&
                this.getA() + this.getC() > this.getB() &&
                this.getB() + this.getC() > this.getA();
    }

    public double getTerulet() {
        return Math.sqrt(this.getS() * (this.getS() - this.getA())
                * (this.getS() - this.getB())
                * (this.getS() - this.getC()));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %-10.3f b = %-10.3f c = %-10.3f K = %-10.3f T = %-10.3f",
                this.getA(), this.getB(), this.getC(), this.getKerulet(), this.getTerulet());
    }
}
