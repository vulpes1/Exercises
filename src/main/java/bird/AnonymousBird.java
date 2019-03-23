package bird;

public class AnonymousBird {

  public static class Bird {

    private Whistle whistle;

    public Bird(Whistle whistle) {
      this.whistle = whistle;
    }

    public void whistlePlease() {
      whistle.whistle();
    }
  }

  public static void main(String[] args) {
    Bird nightingale = new Bird(new Whistle() {
      @Override
      public void whistle() {
        System.out.println("I don't whistle, I really sing... and my singing is beautiful and captivating...");
      }
    });

    Bird raven = new Bird(new Whistle() {
      @Override
      public void whistle() {
        System.out.println("I croak and it is beautiful...");
      }
    });

    Bird sparrow = new Bird(new Whistle() {
      @Override
      public void whistle() {
        System.out.println("I whistle all day long.");
      }
    });

    Bird blackbird = new Bird(new Whistle() {
      @Override
      public void whistle() {
        System.out.println("I whistle only at morning.");
      }
    });

    System.out.print("I am raven. ");
    raven.whistlePlease();
    System.out.print("I am nightingale. ");
    nightingale.whistlePlease();
    System.out.print("I am blacbird. ");
    blackbird.whistlePlease();
    System.out.print("I am sparrow. ");
    sparrow.whistlePlease();
  }
}
