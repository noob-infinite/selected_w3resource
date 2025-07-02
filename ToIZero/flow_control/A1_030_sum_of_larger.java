package ToIZero.flow_control;

public class A1_030_sum_of_larger {
    static void solution(int n, int [] arr){
        int sum = 0;
        // int larger = 0;
        for (int i = 0; i < n*2; i+=2) {
            sum += arr[i] > arr[i+1] ? arr[i] : arr[i+1];
            System.out.println("sum= " + sum);
        }
        System.out.println(sum);
    }
    static void demo_1() {
        int n;
        n = 4;
        int [] arr = {3,7,9,2,4,3,4,9};
        solution(n, arr);
        
        n = 4;

    }
    public static void main(String[] args) {
        demo_1();
    }
}
