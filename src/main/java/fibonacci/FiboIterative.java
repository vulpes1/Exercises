package fibonacci;

public class FiboIterative {

  private static long getFibo(int n) {
    if (n == 1) {
      System.out.println("fibo " + 1 + " = " + 1);
    }
    if (n >= 2) {
      System.out.println("fibo " + 1 + " = " + 1);
      System.out.println("fibo " + 2 + " = " + 1);
    }
    long f = 0;
    long f1 = 1;
    long f2 = 1;

    for (int i = 3; i <= n; i++) {
      f = f1 + f2;
      f1 = f2;
      f2 = f;

      System.out.println("fibo " + i + " = " + f);
    }
    return f;
  }

  public static void main(String[] args) {

    long fibo = getFibo(50);
    System.out.println("Fibo n 50 is: " + fibo);
  }
}
