public class B_859_div4 {

  public static boolean checkingNum(int[] a) {
    int mahai = 0;
    int brian = 0;

    for (int candy : a) {
      if (candy % 2 == 0) {
        mahai += candy;
      } else {
        brian += candy;
      }
    }
    return mahai - brian > 0;
  }

  public static void main(String[] args) {
    int a[] = { 1, 3, 3, 4 };

    boolean result = checkingNum(a);
    if (result == true) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
