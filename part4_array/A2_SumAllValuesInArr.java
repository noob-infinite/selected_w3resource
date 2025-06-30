package selected_w3resource.part4_array;

public class A2_SumAllValuesInArr {
// https://www.w3resource.com/java-exercises/array/java-array-exercise-2.php#google_vignette

    static int solve(int [] arr) {
        int sum = 0;
        for (var x: arr) 
            sum += x;
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {3,4,5,7,9};
        System.out.println(solve(arr));
    }
}