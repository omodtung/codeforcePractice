import java.util.Scanner;

public class A859div4 {

  public static String ProblemA(int a, int b, int c) {
    int sum = a + b;
    int minus = a - b;
    if (sum == c && minus != c) {
      return "+";
    } else if (sum != c && minus == c) {
      return "-";
    } else {
      return "-";
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println(ProblemA(a, b, c));
    }
  }
}
