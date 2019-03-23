package bird;

public class WhistleEarlyMorning implements Whistling {

    @Override
    public void whistle() {
        System.out.println("I whistle only at morning.");
    }
}
