package w3_resources.part1_flow_control;

public class A44_Compute_n_nn_nnn {
// https://www.w3resource.com/java-exercises/basic/java-basic-exercise-44.php#google_vignette
    int solve(int n) {
        return n + (n * 10) + n + (n * 100) + (n * 10) + n;
    }
    public static void main(String[] args) {
        A44_Compute_n_nn_nnn sol = new A44_Compute_n_nn_nnn();
        System.out.println( sol.solve(5) );
    }
}
