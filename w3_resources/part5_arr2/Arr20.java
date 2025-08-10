package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr20 {
    // 20. Convert array to ArrayList
    public int solve(int[] arr) {
        int ans = Integer.MAX_VALUE;
        return ans;
    }
    List<Integer> iterative(int[] arr) {
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            lis.add(arr[i]);
        return lis;
    }
    List<Integer> toList(Integer[] arr) { // (int[] arr) does not work
        return new ArrayList<Integer>( Arrays.asList(arr) ); 
    }
    public static void main(String[] args) {
        Integer[] arr = {2035, 1899, 1456, 2013, 2458};
        Arr20 sol = new Arr20();
        System.out.println( sol.iterative(new int[] {2035, 1899, 1456, 2013, 2458}) );  
        System.out.println( sol.toList(arr) );   
    }    
}
