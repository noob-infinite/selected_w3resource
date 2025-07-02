package selected_w3resource.part1_flow_control;
// https://www.w3resource.com/java-exercises/conditional-statement/index.php
// https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-3.php
// Find the greatest of three numbers
public class A3_GreatestOfThree {
    static int solve(int x, int y, int z) {
        int max = x;
        if (y > max)
            max = y;
        if (z > max)
            max = z;
        return max;
    }
    public static void main(String[] args) {
        int a1 = 25, a2 = 78, a3 = 87;
        System.out.println(solve(a1,a2,a3));
    }
}
