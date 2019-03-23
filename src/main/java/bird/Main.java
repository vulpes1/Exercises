package bird;

public class Main {

    public static void main(String[] args) {

        Raven raven = new Raven();
        System.out.print("I am raven. ");
        raven.whistling.whistle();
        Nightingale nightingale = new Nightingale();
        System.out.print("I am nightingale. ");
        nightingale.whistling.whistle();
        Blackbird blackbird = new Blackbird();
        System.out.print("I am blackbird. ");
        blackbird.whistling.whistle();
        Sparrow sparrow = new Sparrow();
        System.out.print("I am sparrow. ");
        sparrow.whistling.whistle();

    }
}