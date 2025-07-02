package ToIZero.flow_control;

public class A1_028_rev_positive_integer_string {
    static void way_1(int x) {
        String ans = "";
        while (x > 0) {
            ans += x%10;
            x /= 10;
            // System.out.println("x= " + x);
        }
        System.out.println(ans);
    }
    static void demo_1() {
        int x = 1000;
        way_1(x);
        way_1(1234);
    }
    public static void main(String[] args) {
        demo_1();
    }
}
