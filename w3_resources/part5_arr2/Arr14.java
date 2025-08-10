package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr14 {
    // find common elements between two arrays (string values).
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-14.php
    String[] solve(String[] a, String[] b) {
        return null;
    }
    private String[] contains(String[] a, String[] b) {
        List<String> lisa = new ArrayList<>(Arrays.asList(a));
        List<String> lis = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (lisa.contains(b[i]))
                lis.add(b[i]);
        }
        String[] ans = new String[lis.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = lis.get(i);
        }
        return ans;
    }
    private String[] brute_force(String[] a, String[] b) {
        List<String> lis = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    lis.add(a[i]);
                }
            }
        }
        String[] ans = new String[lis.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = lis.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        // Declare and initialize two string arrays, array1 and array2.
        String[] arr1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] arr2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        Arr14 sol = new Arr14();
        String ans = Arrays.toString(sol.brute_force(arr1, arr2)).toString();
        System.out.println( ans );

        String[] result = sol.contains(arr1, arr2);
        System.out.print("[");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + ", ");
        System.out.println();
        // System.out.println( sol.contains(arr1, arr2) );
    }
}
