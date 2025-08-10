package w3_resources.part5_arr2;

public class Arr32 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-32.php
    // Check if array has 65 and 77
    boolean solve(int[] arr) {
        final int VALUE1 = 65;  
        final int VALUE2 = 77;
        boolean isValue1 = false, isValue2 = false;  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == VALUE1)
                isValue1 = true;
            if (arr[i] == VALUE2)
                isValue2 = true;
            if (isValue1 && isValue2)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {77, 22, 65, 44, 33, 77};
        Arr32 sol = new Arr32();
        System.out.println( sol.solve(arr));
    }  
}
