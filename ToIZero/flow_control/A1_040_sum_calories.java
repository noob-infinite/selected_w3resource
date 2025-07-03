package ToIZero.flow_control;

import java.util.Arrays;
import java.util.List;

public class A1_040_sum_calories {
    /*
        1 = Apple = 100
        2 = Papaya = 120
        3 = Banana = 200
        4 = Orange = 60
        5 = EXIT
     */
    static void solution(List<Integer> lis) {
        int ans = 0;
        for (int i = 0; i < lis.size()-1; i++) {
            switch (lis.get(i)) {
                case 1 : ans += 100; break;
                case 2 : ans += 120; break;
                case 3 : ans += 200; break;
                case 4 : ans += 60;
            }
        }
        System.out.println(ans);
    }
    static void demo_1() {
        solution(Arrays.asList(3,1,5));
        solution(Arrays.asList(1,2,3,4,1,5));
    }
    public static void main(String[] args) {
        demo_1();
    }    
}
