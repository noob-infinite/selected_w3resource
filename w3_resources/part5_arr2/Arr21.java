package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr21 {
    // 21. Convert ArrayList to array
    public int solve(int[] arr) {
        int min = arr[0];
        return -1;
    }
    private int[] my_toArray() {
        return null;
    }
    private int[] toArray(List<Integer> lis) {
        int[] arr = new int[lis.size()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = lis.get(i);
        return arr;
    }
    private Integer[] call_toArray2(List<Integer> lis) { 
        // int[] byStream = lis.stream()
        //       .mapToInt(Integer::intValue)
        //       .toArray();
        return lis.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
        Integer[] arr = {2035, 1899, 1456, 2013, 2458};
        List<Integer> lis = new ArrayList<>(Arrays.asList(arr));
        Arr21 sol = new Arr21();
        System.out.println( Arrays.toString(sol.toArray(lis)) ); 
        System.out.println( Arrays.toString(sol.call_toArray2(lis)) );     
    }  
}
