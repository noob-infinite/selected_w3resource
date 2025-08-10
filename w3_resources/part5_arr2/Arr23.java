package w3_resources.part5_arr2;

public class Arr23 {
    // 23. Check if two arrays are equal
    boolean solve(int[] a, int[] b) {
        return false;
    }
    boolean iteration(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    boolean isEquals(int[] a, int[] b) {
        // not true ...sad
        return a.equals(b);
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 11, 9};
        int[] arr2 = {2, 5, 7, 11, 9};
        int[] arr3 = {5, 9, 12, 7, 11};
        Arr23 sol = new Arr23();
        System.out.println( sol.isEquals(arr1, arr2) );
        System.out.println( sol.isEquals(arr2, arr3) );
        System.out.println( sol.iteration(arr1, arr2) );
        System.out.println( sol.iteration(arr2, arr3) );
    }
}
