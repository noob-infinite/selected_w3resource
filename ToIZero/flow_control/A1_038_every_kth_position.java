package ToIZero.flow_control;

public class A1_038_every_kth_position {
    static void solution(int l,int k) {
        for (int i = 1; i <= l; i++) {
            if (i % k == 0)
                System.out.print("X");
            else System.out.print("*");
        }
        System.out.println();
    }
    static void demo_1() {
        solution(12,5);
        solution(8,5);
    }
    public static void main(String[] args) {
        demo_1();
    }    
}
