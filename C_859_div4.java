public class C_859_div4 {

  public static int checking_near(String a) {
    String numbers = "";
    for (char character : a.toCharArray()) {
      switch (character) {
        case 'a':
          numbers += "0";
          break;
        case 'b':
          numbers += "1";
          break;
        case 'c':
          numbers += "1";
          break;
        default:
          numbers += character;
      }
    }

    char[] array = numbers.toCharArray();
    int num = 0;

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] == array[i + 1]) {
        num += 1;
      } else {
        num += 0;
      }
    }

    return num;
  }

  public static void main(String[] args) {
    String a = "abab";

    if (checking_near(a) != 0) {
      System.out.println("no");
    } else {
      System.out.println("yes");
    }
  }
}
