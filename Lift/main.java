package Lift;

public class main {
    public static void main (String[] args) throws IllegalAccessException {
        Lift lf1 = new Lift(1, 8);
        System.out.printf("");
        lf1.move(4);
        lf1.move(6);
        lf1.move(2);
        System.out.println(lf1.toString());
        System.out.printf("");
        Lift lf2 = new Lift(12);
        System.out.printf("");
        lf2.move(7);
        lf2.move(4);
        lf2.move(10);
        System.out.println(lf2.toString());
    }
}

