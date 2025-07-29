package w3_resources.part1_flow_control;

public class A52_IsSumEqualThird {
    boolean solve(int a, int b, int c) {
        return a + b == c;
    }
    public static void main(String[] args) {
        A52_IsSumEqualThird sol = new A52_IsSumEqualThird();
        System.out.println( sol.solve(5, 10, 15) );
    }
}
