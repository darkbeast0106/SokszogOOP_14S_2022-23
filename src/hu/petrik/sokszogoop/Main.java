package hu.petrik.sokszogoop;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            double a = Math.random() * 5 + 10;
            double b = Math.random() * 5 + 10;
            Teglalap t = new Teglalap(a, b);
            System.out.println(t);
        }
    }
}
