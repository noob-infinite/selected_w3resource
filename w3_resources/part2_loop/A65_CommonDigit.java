package w3_resources.part2_loop;

public class A65_CommonDigit {
  boolean isCommonDigitExist(int a, int b) {
    int[] used = new int[10]; // used[d] == 1 if digit d is in a

    while (a > 0) {
        used[a % 10] = 1;
        a /= 10;
    }

    while (b > 0) {
        if (used[b % 10] == 1) return true;
        b /= 10;
    }

    return false;
  }
  public static void main(String[] args) {
    A65_CommonDigit sol = new A65_CommonDigit();
    System.out.println( sol.isCommonDigitExist(15, 25) );
    System.out.println( sol.isCommonDigitExist(324, 73) );
  }
}
