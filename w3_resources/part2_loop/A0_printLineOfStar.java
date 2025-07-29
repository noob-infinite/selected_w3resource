package w3_resources.part2_loop;
// given an integer n, print a row of n stars
public class A0_printLineOfStar {
    static void solve(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        solve(3);
    }
}
