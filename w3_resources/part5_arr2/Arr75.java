package w3_resources.part5_arr2;

public class Arr75 {
    // Calculate the largest gap between sorted elements in array
    int solve(int[] arr) {
        int gap = arr[1] - arr[0];
        // if not sorted, sort here 
        for (int i = 2; i < arr.length; i++) {
            gap = Math.max(gap,arr[i]-arr[i-1]);
        }
        return gap;
    }
    public static void main(String[] args) {
        int[] arr = {-2,4,6,12,23,38,45};
        Arr75 sol = new Arr75();
        System.out.println( sol.solve(arr) );
    }
}
